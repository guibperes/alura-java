public class EditorVideo extends Funcionario {
  @Override
  public double getBonificacao() {
    return super.getSalario() * 0.2;
  }
}
