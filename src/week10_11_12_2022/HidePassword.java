package week10_11_12_2022;

import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        String [] arrs = {"one","hi","hold"};

        String [] result = hidePassword(arrs);
        System.out.println(Arrays.toString(result));



    }public  static String [] hidePassword(String[] arr){
String [] results = new String[arr.length];
int d=0;
        for (String each:arr) {
          String result = convert(each);
          results [d++]=result;
        }
return results;
    }
    public static String convert (String s){

        String a="";
        int j=0;
        for (int i = 0; i <s.length() ; i++) {
            a+="*";



        }return  a;
    }
}
