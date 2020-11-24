package alura.estudo.sorts.factory.comparators;

import java.util.Comparator;

public class StringAscComparator implements Comparator<String> {

  @Override
  public int compare(String string1, String string2) {
    return string1.compareTo(string2);
  }
}
