package week2_09_17_2022;

public class TempratureConverter {

    public static void main(String[] args) {
        /*
        6. Create class named "TemperatureConverter" and make IntroPostIncrementDecrement main method
						- Write IntroPostIncrementDecrement Java program to convert temperature from Fahrenheit to Celsius degree
						- Input IntroPostIncrementDecrement degree in Fahrenheit: 212
							Formula : 		C = (5(F-32))/9
							Expected Output:
							212.0 degree Fahrenheit is equal to 100.0 in Celsius
         */
        double fahrenheit=212;

        double celsius=(5*(fahrenheit-32))/9;
        System.out.println(fahrenheit+" degree Fahrenheit is equal to "+celsius+" in Celsius");






    }
}