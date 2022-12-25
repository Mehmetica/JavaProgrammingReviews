package week7_10_22_2022;

public class nestedLoops {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//
//
//            for (int j = 1; j <= 5; j++) {
//                System.out.println("outer loop " + i + " inner  loop " + j);
//            }
//        }
//------------------------------------------------------------------------
        /*
         *******
         *******
         *******
         *******

         */
//        int rowNumber = 4;
//        int colNumber = 7;
//
//        for (int i = 0; i < rowNumber; i++) {
//            for (int j = 0; j < colNumber; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
 //------------------------------------------------------------------------------xxx


        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if (j==3){
                    break;
                }
                System.out.println(i+ " "+ j);
            }
        }
    }
}
