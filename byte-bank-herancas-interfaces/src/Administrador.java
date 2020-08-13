public class Administrador extends Funcionario implements Autenticavel {

  private final Autenticador autenticador = new Autenticador();

  @Override
  public boolean autenticar(int senha) {
    return this.autenticador.autenticar(senha);
  }

  @Override
  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }

  @Override
  public double getBonificacao() {
    return super.getSalario() + 0.3;
  }
}
