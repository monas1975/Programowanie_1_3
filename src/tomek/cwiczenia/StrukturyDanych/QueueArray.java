package tomek.cwiczenia.StrukturyDanych;

public class QueueArray {

    private int[] array =new int[10];
    int size = 0;

    public QueueArray(){
    }

    public void push(int i){
        array[size++] = i;
       // size++;
    }

    public int  pop(){
        return this.array[size--];
    }

    public int pull(){
        int giveValue=0;
        giveValue=this.array[size-1];
        this.array[size-1] = 0;
        size--;
        return giveValue;
    }

    public int[] getArray() {
        return array;
    }

    public void showArray(){
            System.out.print("[");
        for(int i = 0; i<this.getArray().length;i++){
            System.out.print(this.array[i] + " , ");
        }
        System.out.print("]");
        System.out.println("");
    }
}
