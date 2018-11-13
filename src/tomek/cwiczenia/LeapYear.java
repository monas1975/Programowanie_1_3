package tomek.cwiczenia;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Czy rok przystepny TAK/NIE");
        for (int i = 0; i < 2100; i++) {

            if (leapYear(i)) {
                System.out.println("rok " + i + "   TAK");
            }else{
                System.out.println("rok " + i + "   NIE");
            }

        }
    }
    public static boolean leapYear(int year){
        boolean leapYear = false;

        if (((year%4==0) & !(year%100==0)) | (year%400==0)){
            leapYear = true;
        }else leapYear = false;

        return leapYear;
    }
}
