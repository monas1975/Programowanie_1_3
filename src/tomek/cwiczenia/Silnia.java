package tomek.cwiczenia;

public class Silnia {

    public static void main(String[] args){

        System.out.println("dla n=4 silnia wynosi  " + silnia(4));
        System.out.println("dla n=5 silnia wynosi  " + silnia(5));

        for(int i=0;i<6;i++){
            System.out.println("dla n= " +i + " silnia = " + silnia(i));
        }

        for(int i=0;i<6;i++){
            System.out.println(silnia2(i));
        }

    }


    public static int silnia(int n){
        if (n==0 | n==1) {
            return 1;
        }
        return n*silnia(n-1);
    }

    public static String silnia2(int n){
        String result = "";
        int calSilnia = silnia(n);
        int dozens;
        int ones;
        dozens = calSilnia/10;
        ones = calSilnia%10;
        result = dozens + " " + ones;
        return result;
    }
}
