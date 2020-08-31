package meuapp.conta;

import meuapp.tributo.Tributavel;

public class SeguroVida extends Conta implements Tributavel {

  public SeguroVida(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public double getValorImposto() {
    return super.getSaldo() * 0.2;
  }
}
