package alura.estudo.lambdas.factory;

import java.util.ArrayList;
import java.util.List;

public class SortLambdaFactory {

  public static void main(String[] args) {
    List<String> lista = new ArrayList<>();

    lista.add("Guilherme");
    lista.add("Ana");
    lista.add("Cristina");
    lista.add("Paulo");

    lista.sort(ComparatorFactory.getInstance().getComparator());

    lista.forEach(System.out::println);
  }
}
