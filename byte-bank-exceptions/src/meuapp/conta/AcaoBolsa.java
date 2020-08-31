package meuapp.conta;

import meuapp.tributo.Tributavel;

public class AcaoBolsa extends Conta implements Tributavel {

  public AcaoBolsa(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public double getValorImposto() {
    return super.getSaldo() * 0.05;
  }
}
