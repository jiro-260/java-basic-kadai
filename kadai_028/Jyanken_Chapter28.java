package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    // 自分のじゃんけんの手を入力
    public String getMyChoice() {
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    System.out.println("自分のじゃんけんの手を入力しましょう");
			    System.out.println("グーはrockのrを入力しましょう");
			    System.out.println("チョキはscissorsのsを入力しましょう");
			    System.out.println("パーはpaperのpを入力しましょう");
			    String choice = scanner.nextLine().trim().toLowerCase();

			    if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
			        return choice;
			    } else {
			        System.out.println("正しい記号を入力してください");
			    }
			}
		}
    }

    // 乱数で相手の手を選ぶ
    public String getRandom() {
        double randDouble = Math.random(); // 0.0以上1.0未満
        int randInt = (int) Math.floor(randDouble * 3); // 0,1,2
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "r");
        map.put(1, "s");
        map.put(2, "p");
        return map.get(randInt);
    }

    // じゃんけんの結果を出力する
    public void playGame(String myChoice, String opponentChoice) {
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        System.out.println("自分の手は" + handMap.get(myChoice) + ",対戦相手の手は" + handMap.get(opponentChoice));

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && opponentChoice.equals("s")) ||
            (myChoice.equals("s") && opponentChoice.equals("p")) ||
            (myChoice.equals("p") && opponentChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }

	
		
}