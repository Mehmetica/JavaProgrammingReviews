package week7_10_22_2022;

import java.util.ArrayList;

public class CountEachNumberArray {
    public static void main(String[] args) {
        String names = "Mehmet Ömer Ömer Mehmet Hatice";
        ArrayList arrayList= new ArrayList<>();
        String temp="";



        for (int i = 0; i <names.length() ; i++) {
            char ch = names.charAt(i);
            while (ch!=' '){
                temp+=ch;

            }arrayList.add(temp);
            names=names.substring(names.indexOf(temp)+temp.length());

        }
        System.out.println(arrayList);




    }
}
