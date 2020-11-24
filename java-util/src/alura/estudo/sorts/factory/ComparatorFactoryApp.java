package alura.estudo.sorts.factory;

import java.util.ArrayList;
import java.util.List;

import alura.estudo.sorts.factory.comparators.ComparatorFactory;
import alura.estudo.sorts.factory.comparators.SortOrder;

public class ComparatorFactoryApp {

  public static void main(String[] args) {
    List<String> lista = new ArrayList<>();

    lista.add("Guilherme");
    lista.add("Ana");
    lista.add("Cristina");
    lista.add("Paulo");

    // Pegar parâmetro de ordenação (ASC, DESC) e ordenar de acordo
    lista.sort(ComparatorFactory.getComparator(SortOrder.ASC));

    lista.forEach(System.out::println);
  }
}
