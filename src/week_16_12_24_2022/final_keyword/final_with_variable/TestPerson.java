package week_16_12_24_2022.final_keyword.final_with_variable;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("mehmet","16.05.1988");

        person.setName("Ali");
        //person.birthDay="16.12.1999"; final variables cannot be changed

        System.out.println(person.getName());
        System.out.println(person.getBirthDay() );
        System.out.println(person);



    }
}
