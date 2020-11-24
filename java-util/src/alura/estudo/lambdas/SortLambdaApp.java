package alura.estudo.lambdas;

import java.util.ArrayList;
import java.util.List;

public class SortLambdaApp {

  public static void main(String[] args) {
    List<String> lista = new ArrayList<>();

    lista.add("Guilherme");
    lista.add("Ana");
    lista.add("Cristina");
    lista.add("Paulo");

    lista.sort((string1, string2) -> string1.compareTo(string2));

    lista.forEach(System.out::println);
  }
}
