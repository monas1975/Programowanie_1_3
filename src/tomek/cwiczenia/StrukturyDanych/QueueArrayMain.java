package tomek.cwiczenia.StrukturyDanych;

public class QueueArrayMain {

    public static void main(String[] args){

        QueueArray q1 = new QueueArray();
        q1.showArray();
        q1.push(5);
        q1.showArray();
        q1.push(3);
        q1.showArray();
        q1.push(8);
        q1.showArray();
        System.out.println("pobieram" + q1.pop());
        q1.showArray();
        System.out.println("pobieram" + q1.pop());
        q1.showArray();
        System.out.println("pobieram" + q1.pop());
        q1.showArray();
    }
}
