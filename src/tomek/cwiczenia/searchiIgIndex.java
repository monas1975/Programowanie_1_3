package tomek.cwiczenia;

public class searchiIgIndex {

    public static void main(String[] args){

        int[] array1 = {3,4,5,6,7,5};
        int[] resultArray = showIndex(array1,5);
        for(int i=0;i<resultArray.length;i++){
            System.out.print(resultArray[i]);
        }



    }

    public static int[] showIndex(int[] tab, int searchedNumber){
        int[] resultTable = {-1};
        int counter = 0;
        int[] tempArray;

        for(int i=0; i<tab.length;i++){
            if (tab[i] == searchedNumber){
                    resultTable[counter]   = i;
                    tempArray = resultTable;
                    resultTable = new int[resultTable.length+1-1];
                    System.out.println("resultTable = " + resultTable.length);
                    for(int n=0;n<tempArray.length;n++){
                      resultTable[n] = tempArray[n];
                }
                counter++;
                System.out.println("counter = " + counter);

            }
        }


        return resultTable;
    }

}
