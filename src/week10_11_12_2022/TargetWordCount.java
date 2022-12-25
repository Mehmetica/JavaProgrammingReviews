package week10_11_12_2022;

public class TargetWordCount {
    public static void main(String[] args) {
        String [] array = {"mehmet","ahmet","ömer","ali","ömer","hatice","ömer"};

        int count=countTarget(array,"ömer");
        System.out.println(count);


    }public static int countTarget(String[] arr, String target){
        int targetCount =0;
        for (String each:arr) {
            if (each==target)
                targetCount++;
        }
        return targetCount;
    }
}
