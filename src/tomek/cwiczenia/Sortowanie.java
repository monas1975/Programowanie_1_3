package tomek.cwiczenia;

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

}
