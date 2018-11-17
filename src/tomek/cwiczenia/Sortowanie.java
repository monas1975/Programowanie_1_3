package tomek.cwiczenia;

import java.util.Random;

public class Sortowanie {

    public static void main(String[] args){
        int[] array = new int[15];

        for (int i=0;i<array.length; i++){
            array[i] = i;
        }

         showArray(array);
        System.out.println("");
        showArray(opositOrder(array));
        showArray(changeFirstWithLast(array));

        String[] text = {"Ala", "ma","kota", "dddddddddd"};
        System.out.println(longestText(text));
        System.out.println("Tablica nieposortowana");
        int[] array1 = randomArrayGen(20,-20,20);
        showArray(array1);
        System.out.println("sortowanie babelkowe");
        sortBabelkowe(array1);
        showArray(array1);



    }
    public static int[] randomArrayGen(int n, int low, int high){
        int[] array = new int[n];
        Random random = new Random();
        for (int i=0; i <array.length;i++){
            //array[i]= random.nextInt(11)-5;
            array[i]= random.nextInt(Math.abs(low)+Math.abs(high))-Math.abs(low);
        }
        return array;
    }

    public static void showArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" , ");

        }
        System.out.println("");
    }

    public static int[] opositOrder(int[] array){
        int[] changedArray = new int[array.length];

        for (int i=array.length-1;i>=0;i--){
            changedArray[i]= array[array.length-1-i];
        }

        return changedArray;
    }

    public static int[] changeFirstWithLast(int[] array){
        int [] changedAray = new int[array.length];
        int temp = 0;
        changedAray = array;
        temp = changedAray[0];
        changedAray[0] = changedAray[changedAray.length-1];
        changedAray[changedAray.length-1] = temp;
        return changedAray;
    }

    public static String longestText(String[] array){
        String longest = array[0];

        for(int i=0; i<array.length;i++){
            if (array[i].length() > longest.length() ){
                longest = array[i];
            }
        }
        return longest;
    }

    public static void sortBabelkowe(int[] array)
    {
        int temp;
        for(int i=0; i<array.length;i++){

            for(int j=0; j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }


    }

    public static void insertSort(int[] array) {
    }


}
