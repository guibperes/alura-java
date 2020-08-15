public class CalculadorImposto {
  private double total;

  public void registrarTributavel(Tributavel tributavel) {
    this.total += tributavel.getValorImposto();
  }

  public double getTotal() {
    return total;
  }
}
