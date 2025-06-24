package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		Dictionary_Chapter21 dict = new Dictionary_Chapter21();

        String[] words = {"apple", "banana", "grape", "orange"};

        for (String word : words) {
            String meaning = dict.getMeaning(word);
            if (meaning != null) {
                System.out.println(word + "の意味は" + meaning);
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }


	}


