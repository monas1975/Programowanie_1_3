package sda.java12poz.structures;
import sda.java12poz.structures.Element;
import sda.java12poz.structures.MyList;

public class MyList <T> {
    public Element head = null;
    public Element tail = null;
    public int count = 0;

    public void printElementsRev() {
        Element p = tail;
        while (p != null) {
            System.out.println(p.data);
            p = p.prev;
        }
    }

    public void printElements() {
        Element p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public MyList insert(T text) {
        Element p = new Element();
        p.data = text;
        p.next = head;
        head = p;
        count++;
        if(p.next !=null){
            p.next.prev =p;
        }else{
            tail = p;
        }
        return this;
    }

    public MyList append(T text){
        Element p = new Element();
        p.data = text;
        p.prev = tail;
        tail = p;
        count++;
        if(p.prev !=null){
            p.prev.next = p;
        }else{
            head = p;
        }
        return this;
    }

    @Override
    public String toString() {
        String result = "";
        Element p = head;

        while (p != null) {
            // dodanie p.data na koniec result
            result = result + p.data + ", ";
            p = p.next;
        }
        return result;
    }


}
