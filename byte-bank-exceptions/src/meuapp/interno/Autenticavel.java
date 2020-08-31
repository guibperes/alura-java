package meuapp.interno;

public abstract interface Autenticavel {

  public boolean autenticar(int senha);

  public void setSenha(int senha);
}
