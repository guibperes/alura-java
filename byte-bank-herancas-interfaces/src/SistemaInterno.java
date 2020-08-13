public class SistemaInterno {
  private int senha = 2222;

  public void autenticar(Autenticavel autenticavel) {
    String autenticacaoMensagem = autenticavel.autenticar(this.senha)
      ? "Pode entrar!!!"
      : "Não pode entrar!!!";

    System.out.println(autenticacaoMensagem);
  }
}
