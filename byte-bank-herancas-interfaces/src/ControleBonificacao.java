public class ControleBonificacao {
  private double total;

  public void registrarFuncionario(Funcionario funcionario) {
    this.total += funcionario.getBonificacao();
  }

  public double getTotal() {
    return total;
  }
}
