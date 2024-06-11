package org.example;

public class Charizard extends Charmander {

  @Override
  public void battle() {
    super.battle();
    fly();
  }

  public void fly() {
    System.out.println(Main.selectedPokemon + "の空を飛ぶ！");
  }


}
