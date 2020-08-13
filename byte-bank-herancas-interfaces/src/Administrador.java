public class Administrador extends Funcionario implements Autenticavel {
  private int senha;

  @Override
  public boolean autenticar(int senha) {
    return this.senha == senha;
  }

  @Override
  public void setSenha(int senha) {
    this.senha = senha;
  }

  @Override
  public double getBonificacao() {
    return super.getSalario() + 0.3;
  }
}
