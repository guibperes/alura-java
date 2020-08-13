public class App {
  public static void main(String[] args) {
    Funcionario funcionario =  new Funcionario();
    funcionario.setSalario(1000);

    System.out.println(funcionario.getBonificacao());

    Gerente gerente = new Gerente();
    gerente.setSalario(2000);

    System.out.println(gerente.getBonificacao());

    EditorVideo editorVideo =  new EditorVideo();
    editorVideo.setSalario(1500);

    System.out.println(editorVideo.getBonificacao());

    ControleBonificacao controleBonificacao = new ControleBonificacao();
    controleBonificacao.registrarFuncionario(funcionario);
    controleBonificacao.registrarFuncionario(gerente);
    controleBonificacao.registrarFuncionario(editorVideo);

    System.out.println(controleBonificacao.getTotal());

    ContaCorrente contaCorrente = new ContaCorrente(0001, 1111);
    ContaPoupanca contaPoupanca = new ContaPoupanca(0001, 1111);

    contaCorrente.setTitular(funcionario);
    contaPoupanca.setTitular(funcionario);

    contaCorrente.depositar(1000);
    contaCorrente.transferir(contaPoupanca, 500);

    System.out.println(contaCorrente.getSaldo());
    System.out.println(contaPoupanca.getSaldo());
  }
}
