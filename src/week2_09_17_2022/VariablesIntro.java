package week2_09_17_2022;

public class VariablesIntro {
    public static void main(String[] args) {


        System.out.println(1   +    8   +    "ali");
        //                 int +    int +     str    //int+int=int olacağından ,toplama işlemini yaptı
        //                      int     +      str      //int + str = str olacağından, concatenation yaptı
        //                              str

        System.out.println("result  "+1  +8);//soldan sağa doğru concatenate etmeye başlar.
                         //str       +int+int   //str+ int demek concatenate demek. add yapmaz
                        //      str      +int   //str+int=str
                        //          str         //sonuc str

        double number1 =15.45;
        double number2=58;

        double add= number1 +number2;
        System.out.println("----------------------------------------");
        float avarageScore=20.5f;

        byte num1=(byte)avarageScore;
        System.out.println("num1 = " + num1);

        short num2=(short) avarageScore;
        System.out.println("num2 = " + num2);

        int num3=(int)avarageScore;
        System.out.println("num3 = " + num3);

        long num4= (long) avarageScore;
        System.out.println("num4 = " + num4);

        float num5=avarageScore;
        System.out.println("num5 = " + num5);

        double num6=avarageScore;
        System.out.println("num5 = " + num5);

        float fvar=200;


    }
}
