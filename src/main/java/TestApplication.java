import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TestApplication {
  public static void main(String[] args) {
    TypeSafetyMap map = new TypeSafetyMap();

    map.put(new TypeReference<Integer>() {}, 1);

    System.out.println(map.get(new TypeReference<Integer>() {}));
  }
}

class TypeSafetyMap {
  Map<TypeReference<?>, Object> map;

  {
    this.map = new HashMap<>();
  }

  public <T> void put(TypeReference<T> typeReference, T t){
    map.put(typeReference, t);
  }

  public <T> T get(TypeReference<T> typeReference){
    Type type = ((ParameterizedType)typeReference.getClass().getGenericSuperclass())
        .getActualTypeArguments()[0];

    if(type instanceof Class<?>) {
      return ((Class<T>) type).cast(map.get(typeReference));
    }

    return ((Class<T>)((ParameterizedType)type).getRawType())
        .cast(map.get(typeReference));
  }
}

abstract class TypeReference<T> {
  Type type;

  protected TypeReference(){
    type = ((ParameterizedType)this.getClass().getGenericSuperclass())
        .getActualTypeArguments()[0];
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass().getSuperclass() !=
        o.getClass().getSuperclass()) return false;

    TypeReference<?> that = (TypeReference<?>) o;

    return Objects.equals(type, that.type);

  }

  @Override
  public int hashCode() {
    return type != null ? type.hashCode() : 0;
  }
}

