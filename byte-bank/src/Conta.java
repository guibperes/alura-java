public class Conta {
    private static int total;
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;

        Conta.total++;
    }

    public static int getTotal() {
        return Conta.total;
    }

    private boolean podeRetirar(double valor) {
        return this.saldo - valor >= 0;
    }

    private void retirar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        boolean podeSacar = this.podeRetirar(valor);

        if (podeSacar) {
            this.retirar(valor);
        }

        return podeSacar;
    }

    public boolean transferir(Conta conta, double valor) {
        boolean podeTransferir = this.podeRetirar(valor);

        if (podeTransferir) {
            this.retirar(valor);
            conta.depositar(valor);
        }

        return podeTransferir;
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

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }
}
