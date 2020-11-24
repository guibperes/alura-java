package alura.estudo.primitivos;

public class IntegerApp {

  public static void main(String[] args) {
    int idade = 29;
    Integer idadeObjeto = Integer.valueOf(29);

    System.out.println(idade);
    System.out.println(idadeObjeto);

    System.out.println("PARSE:");
    System.out.println(Integer.parseInt("1010", 2));
    System.out.println(Integer.parseInt("10a", 16));
    System.out.println(Integer.parseInt("10"));
    System.out.println(Integer.parseInt("10", 10));

    Number numero = Integer.valueOf(10);

    System.out.println(numero);
  }
}
