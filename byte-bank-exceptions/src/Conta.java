public abstract class Conta {

  private double saldo;
  private int agencia;
  private int numero;
  private Funcionario titular;

  public Conta(int agencia, int numero) {
    this.agencia = agencia;
    this.numero = numero;
  }

  private boolean podeRetirar(double valor) {
    return this.saldo - valor >= 0;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    boolean podeSacar = this.podeRetirar(valor);

    if (!podeSacar) {
      throw new SaldoInsulficienteException(valor);
    }

    this.saldo -= valor;
  }

  public void transferir(Conta conta, double valor) {
    this.sacar(valor);
    conta.depositar(valor);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setTitular(Funcionario titular) {
    this.titular = titular;
  }

  public Funcionario getTitular() {
    return this.titular;
  }
}
