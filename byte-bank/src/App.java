public class App {
    public static void main(String[] args) {
        Cliente guilherme = new Cliente();
        guilherme.setNome("Guilherme Beidaki");
        guilherme.setCpf("222.222.222-22");
        guilherme.setProfissao("Programador");

        Cliente ana = new Cliente();
        ana.setNome("Ana Luisa");
        ana.setCpf("222.222.222-22");
        ana.setProfissao("Médica");

        Conta minhaConta = new Conta(1, 2);
        minhaConta.setTitular(guilherme);

        Conta contaDaAna = new Conta(1, 2);
        contaDaAna.setTitular(ana);

        minhaConta.depositar(1000);
        System.out.println(minhaConta.getSaldo());
        System.out.println(contaDaAna.getSaldo());

        if (minhaConta.transferir(contaDaAna, 500)){
            System.out.println("Consegui transferir");
        }

        System.out.println(minhaConta.getSaldo());
        System.out.println(contaDaAna.getSaldo());

        if (minhaConta.transferir(contaDaAna, 2000)){
            System.out.println("Consegui transferir");
        }

        System.out.println(minhaConta.getSaldo());
        System.out.println(contaDaAna.getSaldo());

        System.out.println(minhaConta.getTitular().getNome());
        System.out.println(contaDaAna.getTitular().getNome());
        System.out.println("O total de contas é " + Conta.getTotal());
    }
}
