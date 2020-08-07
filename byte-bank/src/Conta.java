public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    private boolean podeRetirar(double valor) {
        return saldo - valor >= 0;
    }

    private void retirar(double valor) {
        saldo -= valor;
    }

    void depositar(double valor) {
        saldo += valor;
    }

    boolean sacar(double valor) {
        boolean podeSacar = podeRetirar(valor);

        if (podeSacar) {
            retirar(valor);
        }

        return podeSacar;
    }

    boolean transferir(Conta conta, double valor) {
        boolean podeTransferir = podeRetirar(valor);

        if (podeTransferir) {
            retirar(valor);
            conta.depositar(valor);
        }

        return podeTransferir;
    }
}
