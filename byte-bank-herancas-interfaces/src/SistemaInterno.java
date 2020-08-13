public class SistemaInterno {
  private int senha = 2222;

  public void autenticar(FuncionarioAutenticavel funcionarioAutenticavel) {
    String autenticacaoMensagem = funcionarioAutenticavel.autenticar(this.senha)
      ? "Pode entrar!!!"
      : "Não pode entrar!!!";

    System.out.println(autenticacaoMensagem);
  }
}
