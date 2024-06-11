package org.example;

import java.util.Scanner;
import java.util.Objects;

// Greeting と Speakingは使わずにinterfaceと実装を組み合わせて作ってみてください
// interfaceの実装を二つ以上作ってください。
// 継承を使ってみてください。extends 上記で作った二つの実装クラスのどちらかを継承してクラスを作って実際にメソッドを呼び出してみてください。
// メソッド呼び出しは親子のどちらとも呼び出してみてください。

public class Main {
  // ポケモンのinterfaceを作る。要素は・戦う・逃げる
  // classは3つ、カイロス、ヒトカゲ、リザードン

  public static String selectedPokemon;

  public static void main(String[] args) {
    // mainでは、敵との遭遇からスタート、呼び出すポケモン(class)を選び、対戦スタート。
    Scanner scanner = new Scanner(System.in);
    Pokemon selectedPokemonInstance = null;

    //while文で正しい名前のポケモンが選ばれるまでループさせる
    while (selectedPokemonInstance == null) {
      System.out.println("野生のカビゴンが現れた！あなたはどのポケモンで戦う？");
      System.out.println("（カイロス/ヒトカゲ/リザードン）から選んでね");
      selectedPokemon = scanner.nextLine();

      //元々if文で記述していたが、switch文に置換。スッキリ読みやすくなった。
      switch (selectedPokemon) {
        case "カイロス" -> selectedPokemonInstance = new Pinsir();
        case "ヒトカゲ" -> selectedPokemonInstance = new Charmander();
        case "リザードン" -> selectedPokemonInstance = new Charizard();
        case null, default -> System.out.println("正しいポケモンを選んでね");
      }
    }

    //　バトル開始。選択したポケモンによって名前が変わるように変数を定義。
    //　親クラス（ヒトカゲクラス）で使用した「ひのこ」をリザードンでも共通で使いたく、
    // selectedPokemonはクラスフィールドとして宣言した
    System.out.println("いけっ" + selectedPokemon + "!");
    selectedPokemonInstance.battle();

    //リザードン以外は敗走ルート。runAwayメソッドを使用して逃げる。
    if (Objects.equals(selectedPokemon, "リザードン")) {
      System.out.println("カビゴンを倒した！おめでとう");
    } else {
      System.out.println("カビゴンが強い！");
      selectedPokemonInstance.runAway();
    }

    //オーバーライドしなくてもCharizardクラスでrunAwayメソッドが呼び出せるか実験
    Charizard charizard = new Charizard();
    charizard.runAway();

  }
}
