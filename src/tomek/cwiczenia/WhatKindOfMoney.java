package tomek.cwiczenia;

public class WhatKindOfMoney {


    public static void main(String[] args) {

        WhatKindOfMoney(585,13);


    }


    public static void WhatKindOfMoney(int zloty, int grosze) {
        final int ZLOTY_AVAIABLE[] = {200, 100, 50, 20, 10, 5, 1};
        final int GROSZE_AVAIABLE[] = {50, 20, 10, 5, 2, 1};
        int[] amountOfZloty = new int[ZLOTY_AVAIABLE.length];
        int[] amountOfGrosze = new int[GROSZE_AVAIABLE.length];
        int amountLeftZl;
        int amountLeftGr;

        amountLeftZl = zloty;
        amountLeftGr = grosze;
        for (int i = 0; i < ZLOTY_AVAIABLE.length; i++) {
            amountOfZloty[i] = (int) (amountLeftZl / ZLOTY_AVAIABLE[i]);
            amountLeftZl = (amountLeftZl - (amountOfZloty[i] * ZLOTY_AVAIABLE[i]));
           // System.out.println("pozostala kwota = " + amountLeft);
            if (amountLeftZl<= 0) break;
        }
        for (int i = 0; i < GROSZE_AVAIABLE.length; i++) {
            amountOfGrosze[i] = (int) (amountLeftGr / GROSZE_AVAIABLE[i]);
            amountLeftGr = (amountLeftGr - (amountOfGrosze[i] * GROSZE_AVAIABLE[i]));
            // System.out.println("pozostala kwota = " + amountLeft);
            if (amountLeftGr<= 0) break;
        }
        for (int i = 0; i < ZLOTY_AVAIABLE.length; i++) {
            System.out.println(ZLOTY_AVAIABLE[i] + " zl -   " + amountOfZloty[i]);
        }
        for (int i = 0; i < GROSZE_AVAIABLE.length; i++) {
            System.out.println(GROSZE_AVAIABLE[i] + " gr -   " + amountOfGrosze[i]);
        }


    }


}
