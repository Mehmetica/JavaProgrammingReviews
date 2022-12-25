package week3_09_24_2022;

public class SingleAndDoubleEnd {
    public static void main(String[] args) {
        boolean result = false;
        int a =10;
        int b =9;

           //false & 11<12 true    tek & kullanınca, ilk durumdan sonraki duruma da bakıyor ve işlemi yapıyor
        if (result & a++<12){}

        System.out.println("a = " + a);

        if (result && b++<12){}//&& kullnanınca ilk ifade false ise diğerine bakmadan if den cikar
        //increment yapmadan kodları okumaya devam etti ve b yi olduğu gibi yazdırdı

        System.out.println("b = " + b);

    }
}
