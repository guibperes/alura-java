package alura.estudo.sorts.factory.comparators;

import java.util.Comparator;

public abstract class ComparatorFactory {

  public static <T> Comparator<T> getComparator(SortOrder order) {
    if (order == null) {
      return (Comparator<T>) new StringAscComparator();
    }

    switch (order) {
      case ASC:
        return (Comparator<T>) new StringAscComparator();

      case DESC:
        return (Comparator<T>) new StringDescComparator();

      default:
        return (Comparator<T>) new StringAscComparator();
    }
  }
}
