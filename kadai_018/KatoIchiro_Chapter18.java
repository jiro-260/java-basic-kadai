package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	   public KatoIchiro_Chapter18() {
	        familyName = "加藤";
	        setGivenName("一郎");
	        address = "東京都中野区〇×";
	    }

	    public void setGivenName(String name) {
	        this.givenName = name;
	    }

	    @Override
	    public void eachIntroduce() {
	        System.out.println("好きな食べ物はリンゴです");
	    }
	}

