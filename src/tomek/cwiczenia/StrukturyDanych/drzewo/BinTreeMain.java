package tomek.cwiczenia.StrukturyDanych.drzewo;

public class BinTreeMain {

    public static void main(String[] args){

        BinaryTreeElement t4 = new BinaryTreeElement(4,null,null);
        BinaryTreeElement t2 = new BinaryTreeElement(2,null,null);
        BinaryTreeElement t3 = new BinaryTreeElement(3,t4,null);
        BinaryTreeElement t1 = new BinaryTreeElement(1,t3,null);
        BinaryTreeElement t0 = new BinaryTreeElement(0,t1,t2);


        System.out.println(t0.toString());
        System.out.println(t1.toString());
        System.out.println(t2.toString());

        System.out.println("aaaaa");
      // BinaryTreeElement.exampleTree().toString();
        System.out.println(BinaryTreeElement.exampleTree().toString());

        System.out.println("formated JSON");
        System.out.println(BinaryTreeElement.exampleTree().toFormattedJSON());

        System.out.println("simple JSON");
        System.out.println(BinaryTreeElement.exampleTree().toSimpleJSON());



        //int hight = BinaryTreeElement.exampleTree().heighOfTree();
        int hight = t0.heighOfTree();
        System.out.println("wysokosc drzewa   " + hight );
        int hight2 = BinaryTreeElement.exampleTree().heighOfTree();
        System.out.println("wysokosc drzewa   " + hight2 );



        System.out.println("PRE-ORDER");
        t0.printPreOrder();
        System.out.println("");
        System.out.println("exampleTree");
        BinaryTreeElement.exampleTree().printPreOrder();
        System.out.println("");
        System.out.println("z lista");
      //  t0.getPreOrderedList();
        System.out.println(t0.getPreOrderedList().toString());
        System.out.println(BinaryTreeElement.exampleTree().getPreOrderedList().toString());
        System.out.println("");
        System.out.println("IN-ORDER");
        t0.printInOrder();
        System.out.println("");
        BinaryTreeElement.exampleTree().printInOrder();
        System.out.println("");
        System.out.println("IN-ORDER z lista");
        System.out.println(t0.getInOrderList().toString());
        System.out.println(BinaryTreeElement.exampleTree().getInOrderList().toString());

        int[] tabSorted = {1,4,7,12,13,14,15,21,23,44,55,66,77,88,89,99,100};

        //szukam 1
        System.out.println("  1 znajduj sie:" + BinaryTreeElement.search(tabSorted,1) );
        BinaryTreeElement.searchUsingFor(tabSorted,1);

        //szukam 77
        System.out.println("  77 znajduj sie:" + BinaryTreeElement.search(tabSorted,77) );
        BinaryTreeElement.searchUsingFor(tabSorted,77);

        //szukam 13
        System.out.println("  13 znajduj sie:" + BinaryTreeElement.search(tabSorted,13) );
        BinaryTreeElement.searchUsingFor(tabSorted,13);
        //szukam 100
        System.out.println("  100 znajduj sie:" + BinaryTreeElement.search(tabSorted,100) );
        BinaryTreeElement.searchUsingFor(tabSorted,100);
        //szukam 0
        System.out.println("  0 znajduj sie:" + BinaryTreeElement.search(tabSorted,0) );
        BinaryTreeElement.searchUsingFor(tabSorted,0);



    }







}


