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

    public MyList<T> insertBefore(Element<T> nextElement, T object){
        Element<T> p = new Element();
        p.data = object;
        p.prev = nextElement.prev;
        p.next = nextElement;
        nextElement = p;
        count++;
        if(p.prev !=null){
            p.prev.next = p;
        }else{
            head = p ;
        }
        return this;
    }

    public MyList<T> insertAfter(Element<T> prevElement, T object){
       Element<T> p = new Element<>();
       p.data = object;
      p.prev = prevElement;
      p.next = prevElement.next;
      prevElement = p;
      count++;
      if(p.prev !=null){
          p.prev.prev = p;
      }else
          head = p;
        return this;
    }

    public MyList<T> delate(Element<T> e){
        count--;
        if (e.prev !=null) {
           e.prev.next = e.next;
        }else{
            head  = e.next;
            //head = e.next;
        }
        if (e.next !=null){
            e.next.prev= e.prev;
        }else{
            tail = e.prev;
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
