package tomek.cwiczenia.StrukturyDanych;

public class SortedGeneric {

    public static void main(String[] args) {

        Integer[] numbers1 = {4, 3, 8, 7, 9, 1, 2};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i]+" , ");
        }
        System.out.println("");
        Integer[] sortedNumber = sortBombelkek(numbers1);
        for (int i = 0; i < sortedNumber.length; i++) {
            System.out.print(sortedNumber[i]+" , ");
        }
        System.out.println("");

        String[] tab={"b","bb","aaa","ccc","a","c","e","d","fff","ffo"};
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+" - ");
        }
        String[] sortedTab = sortBombelkek(tab);

        System.out.println("");
        for (int i = 0; i < sortedTab.length; i++) {
            System.out.print(sortedTab[i]+" , ");
        }


    }
    public static <T extends Comparable>T[] sortBombelkek(T[] array){
        T tempObject;
        T[] sortedArray = array;

        for(int i=0; i<sortedArray.length;i++){
            for (int j=0;j<sortedArray.length-1;j++){
                if (sortedArray[j].compareTo(sortedArray[j+1])==1){
                    tempObject = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = tempObject;

                }
            }
        }
      return sortedArray;
    }


}
