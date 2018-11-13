package tomek.cwiczenia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class cezarCode {

    public static void main(String[] args){

        String test = "ppppppzzzzzzzz*";

         char[] array = test.toCharArray();

         for (int i=0;i<array.length;i++){
             System.out.print(array[i] + " ");
         }
         System.out.println(codeText(test,1));


        File file = new File("textFile.txt");
        String st;
        String readText="";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((st=br.readLine())!=null){
              readText = readText+st;
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        System.out.println("TEXT NIEAKODOWANY");
        System.out.println("");
        System.out.println(readText);
        System.out.println("");
        System.out.println("TEXT ZAKODOWANY");
        String textZakodowany = codeText(readText,5);
        System.out.println("");
        System.out.println(textZakodowany);
        System.out.println("");
        System.out.println("TEXT ODKODOWANY");
        System.out.println("");
        System.out.println(codeText(textZakodowany,-5));



    }
    public static String codeText(String text, int move){
        String codedString="";
        char[] splitedText = text.toCharArray();
        char[] codedArray = new char[splitedText.length];
        //A-65 ,Z-90
        //a-97,z-122
        int signValue;

        for(int i=0;i<splitedText.length;i++){
            //codedArray[i] = (char) (splitedText[i]+move);

            if ((splitedText[i] >=65 & splitedText[i]<=90) | (splitedText[i] >=97 & splitedText[i]<=122)){
                signValue = splitedText[i]+move;
                if (signValue > 90 & signValue < 97){
                    codedArray[i] = (char) (signValue-90+64);
                } else if (signValue>122){
                    codedArray[i] = (char) (signValue-122+96);
                } else {
                    codedArray[i] = (char) signValue;
                }
            }else{
                codedArray[i] = (char) (splitedText[i]);
            }

        }

       // for (int n=0; n<codedArray.length;n++){
         //   System.out.println(codedArray[n] + "   " + (int) codedArray[n]);
        //}
         codedString = new String(codedArray);
     return codedString;
    }



}
