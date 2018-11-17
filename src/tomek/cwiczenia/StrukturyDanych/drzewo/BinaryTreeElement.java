package tomek.cwiczenia.StrukturyDanych.drzewo;

import tomek.cwiczenia.StrukturyDanych.List.MyList;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class BinaryTreeElement {

    private Integer data;
    private BinaryTreeElement leftElement;
    private BinaryTreeElement rightElement;

    public  BinaryTreeElement(){
    }

    public BinaryTreeElement(Integer data, BinaryTreeElement left){
        this.leftElement = left;
        this.data = data;
    }

    public BinaryTreeElement(Integer data, BinaryTreeElement left, BinaryTreeElement right){
        this.leftElement = left;
        this.rightElement = right;
        this.data = data;
    }
    public BinaryTreeElement(Integer data){
        this.data = data;
    }

    public BinaryTreeElement getLeftElement() {
        return leftElement;
    }

    public BinaryTreeElement getRightElement() {
        return rightElement;
    }

    public Integer getData() {
        return data;
    }

    public void setLeftElement(BinaryTreeElement leftElement) {
        this.leftElement = leftElement;
    }

    public void setRightElement(BinaryTreeElement rightElement) {
        this.rightElement = rightElement;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public  static BinaryTreeElement exampleTree(){
        return new BinaryTreeElement(0,
                new BinaryTreeElement(1,new BinaryTreeElement(3,null,null),
                        null),
                new BinaryTreeElement(2,null,null));
    }

    @Override
    public String toString() {
        return "BinaryTreeElement{" +
                "data=" + data +
                ", leftElement=" + leftElement +
                ", rightElement=" + rightElement +
                '}';
    }

    public String toSimpleJSON(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("{ \"data\": ").append(data);

        if (leftElement != null) stringBuilder.append(", \"left\": ").append(leftElement.toSimpleJSON());

        if (rightElement != null) stringBuilder.append(", \"right\": ").append(rightElement.toSimpleJSON());

        stringBuilder.append("}");

        return stringBuilder.toString();

    }



    public String toFormattedJSON(){

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");

        try {

            engine.eval("function toJSON(obj){ return JSON.stringify(JSON.parse(obj),null,4) };");

            Invocable scriptFunction = (Invocable) engine;

            String formattedJSON = scriptFunction.invokeFunction("toJSON", toSimpleJSON()).toString();

            return formattedJSON.replaceAll("\"", "");

        } catch (ScriptException | NoSuchMethodException e) {

            return "";

        }

    }

    public int heighOfTree(){

       int leftHeight=(leftElement==null)?0: leftElement.heighOfTree();
       int rightHeight=(rightElement==null)?0:rightElement.heighOfTree();
       return Integer.max(leftHeight,rightHeight)+1;
    }

    public void printPreOrder(){
        System.out.print(data + "--");
        if (leftElement !=null) {
            leftElement.printPreOrder();
        }
        if (rightElement !=null) {
            rightElement.printPreOrder();
        }

    }

    public MyList<Integer> getPreOrderedList(){
        MyList<Integer> preOrderedList = new MyList<>();
        this.adddToPreOrderedList(preOrderedList);

        return preOrderedList;
    }

       private void adddToPreOrderedList(MyList<Integer> preOrderedList){
        preOrderedList.append(data);
        if (leftElement !=null) leftElement.adddToPreOrderedList(preOrderedList);
        if (rightElement !=null) rightElement.adddToPreOrderedList(preOrderedList);
       }

       public void printInOrder()
    {
        if (leftElement != null) {
            leftElement.printInOrder();
        }
        System.out.print(data + "--");
        if (rightElement != null) {
            rightElement.printInOrder();
        }
    }

    public MyList<Integer> getInOrderList(){
        MyList<Integer> inOrderList = new MyList<>();
        this.addtoInOrderList(inOrderList);
        return inOrderList;
    }

    private void addtoInOrderList(MyList<Integer> inOrderList){
        if (leftElement !=null) leftElement.addtoInOrderList(inOrderList);
        inOrderList.append(data);
        if (rightElement !=null) rightElement.addtoInOrderList(inOrderList);
    }


    public static int search(int[] array, int value){
        int counterAmoutnOfLoopToSearch =0;
        final int lenght = array.length;
        int left =0,right = array.length,midle;
        while(left<=right){
            midle=(left+right)/2;
            if (array[midle]<value) left = midle+1;
            else if (array[midle]>value) right = midle-1;
            else{
                System.out.print("ilosc obiegow do znalezienia wartosci  " + counterAmoutnOfLoopToSearch + "");
                return midle;
            }

            counterAmoutnOfLoopToSearch++;
        }
        System.out.println("ilosc obiegow" + counterAmoutnOfLoopToSearch) ;
         return - 1;
    }

    public static void  searchUsingFor(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println(" FOR liczba " + number + " znajduje sie na pozycji" + i + "ilosc obiegow " + i);
                break;
            }
        }
    }


    };

