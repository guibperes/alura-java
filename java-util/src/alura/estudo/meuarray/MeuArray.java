package alura.estudo.meuarray;

public class MeuArray<TIPO> {

  private Object[] referencias = new Object[5];
  private int length = 0;

  public int getLength() {
    return this.length;
  }

  public void adicionar(TIPO valor) {
    this.referencias[this.length] = valor;
    this.length++;
  }

  public TIPO get(int index) {
    try {
      return (TIPO) this.referencias[index];
    } catch (Exception e) {
      return null;
    }
  }
}
