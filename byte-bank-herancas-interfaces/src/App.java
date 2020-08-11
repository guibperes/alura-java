public class App {
    public static void main(String[] args) {
        Funcionario funcionario =  new Funcionario();

        funcionario.setNome("Guilherme Beidaki Peres");
        funcionario.setCpf("222.222.222-22");
        funcionario.setSalario(1000);

        System.out.println(funcionario.getBonificacao());

        Gerente gerente = new Gerente();

        gerente.setSalario(2000);

        System.out.println(gerente.getBonificacao());
    }
}
