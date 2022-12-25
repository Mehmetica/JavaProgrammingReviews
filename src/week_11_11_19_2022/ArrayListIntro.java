package week_11_11_19_2022;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList  cities = new ArrayList ();
        ArrayList<String > country = new ArrayList<String>();

        cities.add("London");
        cities.add("Paris");

        country.addAll(Arrays.asList("Adana","Izmir"));
        System.out.println("cities.equals(country) = " + cities.equals(country));

        country.set(0,"London");
        country.set(1,"Paris");
        System.out.println("cities.equals(country) = " + cities.equals(country));

        System.out.println("cities = " + cities);
        System.out.println("country = " + country);

        System.out.println("cities.get(0) = " + cities.get(0));
        //cities.retainAll(Arrays.asList("London"));
        //System.out.println("cities = " + cities);
        cities.add(12);
        cities.add(0,12);
        System.out.println("cities = " + cities);
        System.out.println("cities.lastIndexOf(12) = " + cities.lastIndexOf(12));
        System.out.println("cities.indexOf(12) = " + cities.indexOf(12));




    }
}
