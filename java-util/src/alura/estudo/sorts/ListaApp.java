package alura.estudo.sorts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaApp {

  public static void main(String[] args) {
    List<String> lista = new ArrayList<>();
    Comparador comparador = new Comparador();

    lista.add("Guilherme");
    lista.add("Ana");
    lista.add("Cristina");
    lista.add("Paulo");

    // lista.sort(Comparator.naturalOrder());
    lista.sort(comparador);

    // lista.forEach(nome -> System.out.println(nome));
    lista.forEach(System.out::println);
  }
}
