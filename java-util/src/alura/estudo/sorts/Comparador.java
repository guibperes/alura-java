package alura.estudo.sorts;

import java.util.Comparator;

public class Comparador implements Comparator<String> {

  @Override
  public int compare(String nome1, String nome2) {
    return nome1.compareTo(nome2);
    // return nome2.compareTo(nome1);
  }
}
