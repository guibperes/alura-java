package aula;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Pattern;

public abstract class StringUtils {

  public static String unnacent(String string) {
    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    String normalizedString = Normalizer.normalize(string, Form.NFD);

    return pattern.matcher(normalizedString).replaceAll("");
  }

  public static String capitalize(String string) {
    return string.toUpperCase().charAt(0) + string.substring(1);
  }

  public static String uncapitalize(String string) {
    return string.toLowerCase().charAt(0) + string.substring(1);
  }
}
