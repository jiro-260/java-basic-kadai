package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
    public KatoTaro_Chapter18() {
    	   familyName = "加藤";
           setGivenName("太郎");
           address = "東京都中野区〇×";
       }

       public void setGivenName(String name) {
           this.givenName = name;
       }

       @Override
       public void eachIntroduce() {
           System.out.println("私はJavaが得意です");
       }
   }