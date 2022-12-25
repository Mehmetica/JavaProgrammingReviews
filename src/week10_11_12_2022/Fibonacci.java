package week10_11_12_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number= scan.nextInt();

        print(fibonacci(number));

    }public  static int [] fibonacci (int num){
        //0,1,1,     2,3,5,8
        //a,b,c=(a+b)
        //a=b  b=c
         int [] result = new int[num];

        int j=0;
        int a=0,b=1,c;


        for (int i = 0; i <num-1; i++) {
            //0 1 - 1 1 - 1 2- 2 3 - 3 5
            c=a+b;    //1   - 2   - 3   -5   - 8
            a=b;
            b=c;

            result[j++]=c;

        }return result;

    }
    public static void print(int[] arr){

        System.out.print("0, 1");
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(", "+arr[i]);
        }
    }
}
