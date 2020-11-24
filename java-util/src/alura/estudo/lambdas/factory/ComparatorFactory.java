package alura.estudo.lambdas.factory;

import java.util.Comparator;

public class ComparatorFactory {

  private static final ComparatorFactory instance = new ComparatorFactory();

  private Comparator<String> stringAscComparator = (string1, string2) -> string1.compareTo(string2);

  private Comparator<String> stringDescComparator = (string1, string2) -> string2.compareTo(string1);

  private ComparatorFactory() {}

  public static ComparatorFactory getInstance() {
    return instance;
  }

  public Comparator<String> getComparator() {
    return stringAscComparator;
  }

  public Comparator<String> getComparator(SortOrderEnum order) {
    switch (order) {
      case ASC:
        return stringAscComparator;

      case DESC:
        return stringDescComparator;

      default:
        return stringAscComparator;
    }
  }
}
