package aula;

public class Livro {

  private static String TEST = "TEST";
  private String name;
  private int pages;

  public Livro(String name, int pages) {
    this.name = name;
    this.pages = pages;
  }

  public String getName() {
    return name;
  }

  public int getPages() {
    return pages;
  }

  @Override
  public String toString() {
    return GenericToString.handle(this);
  }
}
