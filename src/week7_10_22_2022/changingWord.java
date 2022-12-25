package week7_10_22_2022;

public class changingWord {
    public static void main(String[] args) {
//use indexof and substring
        String str = "I love cats.I have a cat. My cat's name is Niyazi";
        String temp = "";
        String searched = "cat";
        String changed = "dog";
        int c = str.indexOf(searched);
        // System.out.println(str.replace("cat","dog"));

        while (str.contains(searched)){
            int indexOfFirstCat= str.indexOf(searched);
            int endOfWord = str.indexOf(searched)+searched.length();

            str=str.substring(0,indexOfFirstCat)+changed+str.substring(endOfWord);
        }
        System.out.println("str = " + str);


    }
}
