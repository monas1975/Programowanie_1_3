import sda.java12poz.structures.Element;
import sda.java12poz.structures.MyList;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        MyList list = new MyList();
      //  MyList <Integer> list = new MyList();

        // pierwszy element listy
        Element e1 = new Element();
        e1.data = "element pierwszy";
       // e1.data = 1;
        list.head = e1;
        list.tail = e1;
        list.count++;

        // drugi element listy
        Element e2 = new Element();
        e2.data = "element drugi";
        e2.prev = list.tail;
        list.tail.next = e2;
        list.tail = e2;
        list.count++;

        //trzeci element listy
        Element e3 = new Element();
        e3.data = "element trzeci";
        e3.prev = list.tail;
        list.tail.next = e3;
        list.tail = e3;
        list.count++;

        System.out.println(list);

        list.insert("aaaa");
        System.out.println(list);


        list.append("bbbb");
        System.out.println(list);

        list.insert("cccc");
        System.out.println(list);

        list.append("ddddd");
        System.out.println(list);

        list.append(4);
        System.out.println(list);

        }


    }
