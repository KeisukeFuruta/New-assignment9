package org.example;

public class Pinsir implements Pokemon {

  public void battle() {
    System.out.println(Main.selectedPokemon + "が戦う！");
    System.out.println(Main.selectedPokemon + "のハサミギロチン！");
    System.out.println("相手のカビゴンには効果がないようだ");
  }

  public void runAway() {
    System.out.println(Main.selectedPokemon + "と逃げよう！");
    System.out.println("...うまく逃げ切れた！");
  }
}
