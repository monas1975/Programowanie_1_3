package tomek.cwiczenia;

import java.util.Scanner;

public class Tablice {

    public static void main(String[] args){

        String[] firstNameArray = new String[5];
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<firstNameArray.length;i++){
            System.out.println("Podaj imie" + i + " :");
            firstNameArray[i] = scanner.nextLine();
        }
        System.out.println("");
        System.out.print("[");
        for(int i =0; i<firstNameArray.length;i++){
            System.out.print(firstNameArray[i] + " , " );
        }
        System.out.print("]");

    }
}
