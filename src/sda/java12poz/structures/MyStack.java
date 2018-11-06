package sda.java12poz.structures;

import java.util.Stack;

public class MyStack {


    public static  String convertNumber(int number, int base) {
        String wynik = "";
        Stack<Integer> myStack = new Stack<>();
        int tempResult = 0;
        int tempResult2 = number;
        int digit = base;

        do {
            myStack.push(number % base);

            number = number / base;

        } while (number > 0);

        while (!myStack.empty()) {
           

            if (digit>10) {
                wynik = wynik + (char) ('A' + (digit - 10));
            }else{
                wynik = wynik + digit;
                System.out.println(wynik);
            }

    }
        return wynik;
    }

}

