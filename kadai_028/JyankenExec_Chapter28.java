package kadai_028;

import java.util.HashMap;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        // クラスのインスタンスを作成
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();

        // 自分の手を取得
        String myChoice = jyanken.getMyChoice();

        // 相手の手を取得
        String opponentChoice = jyanken.getRandom();

        // HashMapに格納
        HashMap<String, String> choices = new HashMap<>();
        choices.put("myChoice", myChoice);
        choices.put("opponentChoice", opponentChoice);

        // じゃんけん実行
        jyanken.playGame(myChoice, opponentChoice);
    }
}