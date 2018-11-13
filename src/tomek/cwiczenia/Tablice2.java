package tomek.cwiczenia;

import java.util.Random;

public class Tablice2 {

    public static void main(String[] args) {

        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + ",");
        }
        System.out.println("");

        for (int n = numbersArray.length - 1; n >= 0; n--) {
            System.out.print(numbersArray[n] + ",");
        }

        for (int i = 0; i < 20; i++) {
            if (!primeNumbers(i)) {
                System.out.println(i + "          NIE");
            } else System.out.println(i + "          TAK");
        }
        System.out.println("");
        System.out.println("sumowanie liczb");
        int[] tab = randomNumbers(10,-100,100);
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+ " , ");
        }
        System.out.println("");
        int[] tab2 = sumOfNumbers(tab);
        for(int i=0;i<tab2.length;i++){
            System.out.print(tab2[i]+ " , ");
        }
        double [] money = {200,100,50,20,10,5,1,0.50,0.20,0.10,0.05,0.02,0.01};
        int[] moneyNumber = new int[money.length];
    }

    public static boolean primeNumbers(int number) {
        boolean result = true; // prime
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
            }
        }
        return result;
    }

    public static int[] randomNumbers(int arraySize, int lowRange, int highRange){
        int[] array = new int[arraySize];
        int low = Math.abs(lowRange);
        int high = Math.abs(highRange);
        Random random = new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(low+high+1)-low;
        }

        return array;
    }

    public static int[] sumOfNumbers(int[] array){
        int[] calculatedArray = new int[array.length];
        int total=0;

        for(int i =0; i<array.length;i++){
            total = total + array[i];
            calculatedArray[i]=total;

        }

        return calculatedArray;
    }



}
