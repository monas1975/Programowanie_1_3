package tomek.cwiczenia.StrukturyDanych.List;

import sda.java12poz.structures.Element;

public class MyList<T> {

    public ListElement head = null;
    public ListElement tail = null;
    public int count = 0;

    public void printElementsRev() {
        ListElement<T> p = tail;
        while (p != null) {
            System.out.println(p.data);
            p = p.prev;
        }
    }


    public void printElements() {
        ListElement<T> p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public MyList<T> inser(T object) {
        ListElement<T> p = new ListElement<>();
        p.data = object;
        p.next = head;
        head = p;
        count++;
        if (p.next != null) {
            p.next.prev = p;
        } else {
            tail = p;
        }
        return this;
    }

    public MyList<T> append(T object) {
        ListElement<T> p = new ListElement<>();
        p.data = object;
        ;
        p.prev = tail;
        tail = p;
        count++;
        if (p.prev != null) {
            p.prev.next = p;
        } else {
            head = p;
        }
        return this;
    }

    public MyList<T> insertBefore(ListElement<T> nextElement, T object) {
        ListElement<T> p = new ListElement<>();
        p.data = object;
        p.prev = nextElement.prev;
        p.next = nextElement;

        nextElement.prev = p;
        count++;
        if (p.prev != null) {
            p.prev.next = p;
        } else {
            head = p;
        }
        return this;
    }

    public  MyList<T> inserAfter(ListElement<T> prevElement,T object){
        ListElement<T> p = new ListElement<>();
        p.data = object;
        p.prev = prevElement;
        p.next = prevElement.next;
        prevElement.next = p;
        count++;
        if (p.next != null) {
            p.next.prev = p;
        } else {
            tail = p;
        }
        return this;
    }

    public MyList<T>  delate(ListElement<T> e){
    count--;
    if(e.prev !=null){
        e.prev.next = e.next;
    }else{
        head = e.next;
    }
    if (e.next !=null){
        e.next.prev = e.prev;
    }else{
        tail=e.prev;
        }
    return this;
    }

     @Override
    public  String toString(){
        StringBuilder result = new StringBuilder();
        ListElement p = head;
        while(p!=null){
            result.append(p.data);
            if(p.next !=null){
                result.append(" , ");
            }else{
                result.append(" . ") ;
            }
            p=p.next;
        }
        return result.toString();
     }
}




