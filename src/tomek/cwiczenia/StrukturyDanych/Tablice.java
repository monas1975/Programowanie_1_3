package tomek.cwiczenia.StrukturyDanych;

public class Tablice {
    public static void main(String[] arg){

        int[] tab;
       tab =  parzyste(20);
        int[] tab2;
        tab2 =  nieParzyste(20);
        System.out.println("parzyste");
        for (int i:tab
             ) {
            System.out.print(i + " , ");
        }
        System.out.println("nieparzyste");
        for (int i:tab2
        ) {
            System.out.print(i + " , ");
        }


        int index = 0;

      while (index<40){



         try {
             System.out.println(tab[index]);
         }catch
         (ArrayIndexOutOfBoundsException e)
          {
             System.out.println("to jest try catch");
          }


           index++;
        }


    }
/*
    public static void parzyste(int size){
        int[] array = new int[size];
        for(int i=0;i<array.length;i++ ){
            array[i]=i*2;
        }
        //print
        for(int i=0;i<array.length;i++ ){
            System.out.print(array[i] + " , ");
        }
    }
   */
    public  static int[] parzyste(int size){
        int[] array = new int[size];
        for (int i=0; i<array.length;i++){
            array[i]= i*2;
        }

        return array;
    }

    public  static int[] nieParzyste(int size){
        int[] array = new int[size];
        for (int i=0; i<array.length;i++){
            array[i]= i*2+1;
        }

        return array;
    }

}
