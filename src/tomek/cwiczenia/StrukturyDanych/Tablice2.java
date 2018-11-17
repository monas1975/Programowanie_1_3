package tomek.cwiczenia.StrukturyDanych;

import java.util.Random;

public class Tablice2 {

    public static void main(String[] args) {

        int[] tab = generatArray(10,-10,10);
        showArray(tab);
        System.out.println("");
        int searchedIndex = searchNumber(tab,-3);
        if (searchedIndex==-1){
            System.out.println("szukana liczba nie wystepuje w tej tablicy");
        }else{
            System.out.println("szukana liczba wystepuje w tablicy pod indexem" + searchedIndex);
        }
        System.out.println("");
        int[] tab2 = sortBabel(tab);
        showArray(tab2);
        System.out.println("");
        showArray(addAndSort(tab2,-20));
    }

    public static int[] generatArray(int size,int lowLim, int highLim) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i=0;i<array.length;i++){

            array[i] = random.nextInt(Math.abs(highLim) + Math.abs(lowLim)+1)-Math.abs(lowLim);
        }
        return array;
    }

    public static void showArray(int[] array){
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i] +" , ");
        }
    }

    public static int searchNumber(int[] array, int serchedNumber){
        int indexOfNumber = -1;

        for (int i=0;i< array.length;i++){
            if (array[i] == serchedNumber){
                indexOfNumber = i;
            }
        }
        return indexOfNumber;
    }

    public static int[] sortBabel(int[] array){
        int[] newArray = array;
        int temp = 0;

        for(int i =0; i<newArray.length;i++){

            for(int j=0;j<newArray.length-1;j++){
                if(newArray[j]>newArray[j+1]){
                    temp = newArray[j];
                    newArray[j] = newArray[j+1];
                    newArray[j+1]=temp;
                }
            }
        }
        return newArray;
    }

    public static int[] addAndSort(int[] array, int additionalNumber){
        int[] newArray = new int[array.length+1];
        for(int i = 0;i<array.length;i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length-1] = additionalNumber;

        newArray=sortBabel(newArray);

        return newArray;
    }
}


