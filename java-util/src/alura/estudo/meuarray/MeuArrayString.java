package alura.estudo.meuarray;

public class MeuArrayString {

  private String[] referencias = new String[5];
  private int length = 0;

  public int getLength() {
    return this.length;
  }

  public void adicionar(String valor) {
    this.referencias[this.length] = valor;
    this.length++;
  }

  public String getFromIndex(int index) {
    try {
      return this.referencias[index];
    } catch (Exception e) {
      return null;
    }
  }
}
