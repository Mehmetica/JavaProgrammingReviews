package week10_11_12_2022;

import java.util.Arrays;

public class SumNumbers {
    public static void main(String[] args) {
        String[] array = {"123", "134", "513"};

        int[] result = sumNumbers(array);

        System.out.println(Arrays.toString(result));


    }

    public static int[] sumNumbers(String[] array) {
        int [] result = new int[array.length];
        int j=0;
        for (String s : array) {


            int each = Integer.parseInt(s);

            int sumOfDigits = sumDigits(each);

            result [j++]=sumOfDigits;

        }
        return result;
    }

    private static int sumDigits(int each) {
        int lastDigit =each%10 ;
        int middleDigit = each/10%10;
        int firstDigit =each/100;

        int sum= lastDigit+middleDigit+firstDigit;
        return sum;
    }
}
