package tomek.cwiczenia.StrukturyDanych;

public class SortedArray {

    int[] array = new int[3];
    int size =0;

    public SortedArray(){

    }

    public void add(int i){
        int tempVal=0;
        if (size == 0){
            array[size++]=i;
            System.out.println("size=" +size);
        }
        if (size> array.length-1){
            int[] tempArray = new int[array.length+1];
            //int[] temp2 = array;
            for(int j=0;i<array.length;j++){
              tempArray[j]=array[j];
            }
            array = tempArray;
        }
        if(size>0) {
            System.out.println("jestem w");
            this.array[size] = i;
            if (this.array[size]<this.array[size-1]){
                tempVal = array[size];
                System.out.println("tempVal="+tempVal);
                this.array[size] = this.array[size-1];
                this.array[size-1] = tempVal;
            }else{
                System.out.println("jestem w2");
                this.array[size] =i;
            }
          size++;
            System.out.println("size=" +size);
        }
    } public void showArray(){
        System.out.print("[");
        for(int i = 0; i<this.array.length;i++){
            System.out.print(this.array[i] + " , ");
        }
        System.out.print("]");
        System.out.println("");
    }


}
