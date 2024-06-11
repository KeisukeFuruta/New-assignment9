package org.example;

public class Charmander implements Pokemon {

  @Override
  public void battle() {
    System.out.println(Main.selectedPokemon + "のひのこ！");

  }

  @Override
  public void runAway() {
    System.out.println(Main.selectedPokemon + "と逃げよう！");
  }
}
