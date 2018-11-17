package tomek.cwiczenia.StrukturyDanych.List;

import sda.java12poz.structures.Element;

public class MyListMain {

    public static void main(String[] args){

        MyList list = new MyList();
        System.out.println(list.toString());
         ListElement e1 = new ListElement();
        e1.data= "element pierwszy";
        list.head = e1;
        list.tail = e1;
        list.count++;
        System.out.println(list.toString());

        //drugi eleemnet
        ListElement e2 = new ListElement();
        e2.data= "element drugi";
        e2.prev = list.tail;
        list.tail.next = e2;
        list.tail = e2;
        list.count++;
        System.out.println(list.toString());

        //element trzeci
        ListElement e3 = new ListElement();
        e3.data= "element trzeci";
        e3.prev = list.tail;
        list.tail.next = e3;
        list.tail = e3;
        list.count++;
        System.out.println(list.toString());



    }
}
