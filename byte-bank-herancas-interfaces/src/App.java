public class App {
  public static void main(String[] args) {
    Gerente gerente = new Gerente();
    gerente.setSalario(2000);

    System.out.println(gerente.getBonificacao());

    EditorVideo editorVideo =  new EditorVideo();
    editorVideo.setSalario(1500);

    System.out.println(editorVideo.getBonificacao());

    ControleBonificacao controleBonificacao = new ControleBonificacao();
    controleBonificacao.registrarFuncionario(gerente);
    controleBonificacao.registrarFuncionario(editorVideo);

    System.out.println(controleBonificacao.getTotal());

    ContaCorrente contaCorrente = new ContaCorrente(0001, 1111);
    ContaPoupanca contaPoupanca = new ContaPoupanca(0001, 1111);

    contaCorrente.setTitular(gerente);
    contaPoupanca.setTitular(gerente);

    contaCorrente.depositar(1000);
    contaCorrente.transferir(contaPoupanca, 500);

    System.out.println(contaCorrente.getSaldo());
    System.out.println(contaPoupanca.getSaldo());

    SistemaInterno sistemaInterno = new SistemaInterno();
    Administrador administrador = new Administrador();
    Cliente cliente = new Cliente();

    gerente.setSenha(2222);
    administrador.setSenha(3333);
    cliente.setSenha(4444);

    sistemaInterno.autenticar(gerente);
    sistemaInterno.autenticar(administrador);
    sistemaInterno.autenticar(cliente);
  }
}
