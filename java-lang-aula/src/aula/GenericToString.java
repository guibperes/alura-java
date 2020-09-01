package aula;

import java.lang.reflect.Modifier;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class GenericToString {

  public static String handle(Object object) {
    String className = object.getClass().getName();

    String fields = Stream.of(object.getClass().getDeclaredFields())
      .parallel()
      .filter(field -> !Modifier.isStatic(field.getModifiers()))
      .map(field -> {
        boolean fieldAccessibity = field.canAccess(object);

        if (!fieldAccessibity) {
          field.setAccessible(true);
        }

        Optional<Object> optionalFieldValue = Optional.empty();

        try {
          optionalFieldValue = Optional.of(field.get(object));
        } catch (Exception e) {
          e.printStackTrace();
        }

        field.setAccessible(fieldAccessibity);

        return new StringBuilder()
          .append(field.getName())
          .append('=')
          .append(optionalFieldValue.orElse("null"))
          .toString();
      })
      .collect(Collectors.joining(", "));

    return new StringBuilder()
      .append(className)
      .append('(')
      .append(fields)
      .append(')')
      .toString();
  }
}
