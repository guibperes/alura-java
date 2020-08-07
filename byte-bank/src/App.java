public class App {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Conta contaDaAna = new Conta();

        minhaConta.depositar(1000);
        System.out.println(minhaConta.saldo);
        System.out.println(contaDaAna.saldo);

        if (minhaConta.transferir(contaDaAna, 500)){
            System.out.println("Consegui transferir");
        }

        System.out.println(minhaConta.saldo);
        System.out.println(contaDaAna.saldo);

        if (minhaConta.transferir(contaDaAna, 2000)){
            System.out.println("Consegui transferir");
        }

        System.out.println(minhaConta.saldo);
        System.out.println(contaDaAna.saldo);
    }
}
