package alura.estudo;

import java.util.ArrayList;

import alura.estudo.meuarray.MeuArray;
import alura.estudo.meuarray.MeuArrayObject;
import alura.estudo.meuarray.MeuArrayString;

public class App {

  public static void main(String[] args) {
    MeuArrayString lista = new MeuArrayString();

    lista.adicionar("Guilherme");
    lista.adicionar("Ana");
    lista.adicionar("Cristina");

    System.out.println(lista.getLength());
    System.out.println(lista.getFromIndex(0));
    System.out.println(lista.getFromIndex(-1));
    System.out.println(lista.getFromIndex(2));
    System.out.println(lista.getFromIndex(6));

    MeuArrayObject listaObject = new MeuArrayObject();

    listaObject.adicionar("Guilherme");
    listaObject.adicionar("Ana");
    listaObject.adicionar("Cristina");

    System.out.println(listaObject.getLength());
    System.out.println(listaObject.getFromIndex(0));
    System.out.println(listaObject.getFromIndex(-1));
    System.out.println(listaObject.getFromIndex(2));
    System.out.println(listaObject.getFromIndex(6));

    ArrayList<String> listaArray = new ArrayList<>();

    listaArray.add("Guilherme");
    listaArray.add("Ana");
    listaArray.add("Cristina");

    System.out.println(listaArray.size());
    System.out.println(listaArray.get(0));

    listaArray.remove("Ana");
    System.out.println(listaArray.size());

    for (Object object : listaArray) {
      System.out.println(object);
    }

    MeuArray<String> meuArray = new MeuArray<>();

    meuArray.adicionar("Gui");
    meuArray.adicionar("Ana");
    meuArray.adicionar("Cris");

    System.out.println(meuArray.getLength());

    for (int i = 0; i < meuArray.getLength(); i++) {
      System.out.println(meuArray.get(i));
    }
  }
}
