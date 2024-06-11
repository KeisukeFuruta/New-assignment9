package org.example;

public class Pinsir implements Pokemon {

  public void battle() {
    System.out.println(Main.selectedPokemon + "が戦う！");
    System.out.println(Main.selectedPokemon + "のハサミギロチン！");
  }

  public void runAway() {
    System.out.println(Main.selectedPokemon + "と逃げよう！");
  }
}
