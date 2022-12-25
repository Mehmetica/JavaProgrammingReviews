package week7_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class task1HiddenNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        boolean flag = true;
        Random random = new Random();
        int hiddenNumber= random.nextInt(10)+1;

        do {
            System.out.print("Enter a number: ");
            int searchNumber = scan.nextInt();
            if (searchNumber==hiddenNumber){
                System.out.println("You've found it!");
                flag = false;
            }else System.out.println("Try again.");
        }while (flag==true);


    }
}
