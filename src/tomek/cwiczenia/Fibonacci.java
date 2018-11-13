package tomek.cwiczenia;

public class Fibonacci {

    public static void main(String[] args){

        System.out.println("dla n=8, ciag Fibonacciego wynosi =" + Fibonacci(8));
        System.out.println("dla n=12, ciag Fibonacciego wynosi =" + Fibonacci(12));

        for (int n=0;n<20;n++){
            System.out.println("dla n=" + n + "  Fn =  " + Fibonacci(n));
        }


    }

    public static int Fibonacci(int n){
        int wynik= 0;
        if (n==0) return 0;
        if (n==1) return 1;
        if (n>1) {
            wynik = Fibonacci(n-1)+Fibonacci(n-2);
        }
        return wynik;
    }
}
