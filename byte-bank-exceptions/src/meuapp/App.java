package meuapp;

import meuapp.conta.AcaoBolsa;
import meuapp.conta.ContaCorrente;
import meuapp.conta.ContaPoupanca;
import meuapp.conta.SeguroVida;
import meuapp.interno.SistemaInterno;
import meuapp.pessoa.Cliente;
import meuapp.pessoa.funcionario.Administrador;
import meuapp.pessoa.funcionario.ControleBonificacao;
import meuapp.pessoa.funcionario.EditorVideo;
import meuapp.pessoa.funcionario.Gerente;
import meuapp.tributo.CalculadorImposto;

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
    // contaCorrente.sacar(1200);
    // contaCorrente.transferir(contaPoupanca, 1100);

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

    CalculadorImposto calculadorImposto = new CalculadorImposto();

    SeguroVida seguroVida = new SeguroVida(0001, 1111);
    AcaoBolsa acaoBolsa = new AcaoBolsa(0001, 1111);

    calculadorImposto.registrarTributavel(contaCorrente);
    calculadorImposto.registrarTributavel(seguroVida);
    calculadorImposto.registrarTributavel(acaoBolsa);

    System.out.println(calculadorImposto.getTotal());
  }
}
