package alura.estudo.meuarray;

public class MeuArrayObject {

  private Object[] referencias = new Object[5];
  private int length = 0;

  public int getLength() {
    return this.length;
  }

  public void adicionar(Object valor) {
    this.referencias[this.length] = valor;
    this.length++;
  }

  public Object getFromIndex(int index) {
    try {
      return this.referencias[index];
    } catch (Exception e) {
      return null;
    }
  }
}
