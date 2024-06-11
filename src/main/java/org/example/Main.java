package org.example;

import java.util.Scanner;
import java.util.Objects;

public class Main {

  public static String selectedPokemon;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Pokemon selectedPokemonInstance = null;

    while (selectedPokemonInstance == null) {
      System.out.println("野生のカビゴンが現れた！あなたはどのポケモンで戦う？");
      System.out.println("（カイロス/ヒトカゲ/リザードン）から選んでね");
      selectedPokemon = scanner.nextLine();

      switch (selectedPokemon) {
        case "カイロス" -> selectedPokemonInstance = new Pinsir();
        case "ヒトカゲ" -> selectedPokemonInstance = new Charmander();
        case "リザードン" -> selectedPokemonInstance = new Charizard();
        case null, default -> System.out.println("正しいポケモンを選んでね");
      }
    }

    System.out.println("いけっ" + selectedPokemon + "!");
    selectedPokemonInstance.battle();

    if (Objects.equals(selectedPokemon, "リザードン")) {
      System.out.println("カビゴンを倒した！おめでとう");
    } else {
      System.out.println("カビゴンが強い！");
      selectedPokemonInstance.runAway();
    }
  }
}

// Greeting と Speakingは使わずにinterfaceと実装を組み合わせて作ってみてください
// interfaceの実装を二つ以上作ってください。
// 継承を使ってみてください。extends 上記で作った二つの実装クラスのどちらかを継承してクラスを作って実際にメソッドを呼び出してみてください。
// メソッド呼び出しは親子のどちらとも呼び出してみてください。
// ポケモンのinterfaceを作る。要素は・戦う・逃げる
// classは3つ、カイロス、ヒトカゲ、リザードン
// mainでは、敵との遭遇からスタート、呼び出すポケモン(class)を選び、対戦スタート。
//
