package meuapp.conta.exception;

public class SaldoInsulficienteException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public SaldoInsulficienteException(double valor) {
    super("O saldo de " + valor + " é insulficiente");
  }
}
