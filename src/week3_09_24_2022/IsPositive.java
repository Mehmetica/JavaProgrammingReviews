package week3_09_24_2022;

public class IsPositive {
    public static void main(String[] args) {
        int a =10;
        if (a>0){
            System.out.println(a+ " pozitif");
        }else System.out.println(a+ " negatif");


       String str = (a>0)? "Pozitif" : "Negatif";
        System.out.println("str = " + str);


    }
}
