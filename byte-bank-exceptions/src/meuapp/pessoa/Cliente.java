package meuapp.pessoa;

import meuapp.interno.Autenticador;
import meuapp.interno.Autenticavel;

public class Cliente implements Autenticavel {

  private final Autenticador autenticador = new Autenticador();

  @Override
  public boolean autenticar(int senha) {
    return this.autenticador.autenticar(senha);
  }

  @Override
  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }
}
