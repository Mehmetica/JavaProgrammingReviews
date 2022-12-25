package week10_11_12_2022;

public class GetSentence {
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

        System.out.println(getSentence(str));


    }

    private static String getSentence(String str) {
       char[] arr= str.toCharArray();
       String result="";
        for (char each:arr) {
            if (Character.isLetter(each) || each==' '){
                result+=each;
            }
        }
        return result;
    }
}
