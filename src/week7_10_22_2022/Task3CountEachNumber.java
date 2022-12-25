package week7_10_22_2022;

public class Task3CountEachNumber {
    public static void main(String[] args) {
        String names = " Adam Berry Aysun Aysun Adam Adam";
        String temp = "";
        String resut="";

        for (int i = 0; i < names.length(); i++) {
            char ch = names.charAt(i);
            if (ch != ' ') {
                temp += ch;
                continue;
            }

            String searched = temp;

            int counter = 0;
            String dumy = names;
            while (dumy.contains(searched)) {
                counter++;
                dumy = dumy.replaceFirst(searched, "");

            }
            if (!resut.contains(searched)) {
                resut += searched + "-" + counter + " ";
            }
            temp="";

        }
        System.out.println("resut = " + resut);
    }
}
