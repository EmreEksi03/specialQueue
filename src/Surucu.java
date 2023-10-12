import java.util.Iterator;

public class Surucu {

    public static void main(String[] args) {
        SpecialQueue<Integer> q = new SpecialQueue<Integer>();

        q.enqueue(5,7,-4,12);
        q.dequeue();
        q.dequeue();
        Integer deger = q.dequeue();
        System.out.println(deger);
        //for (Iterator<Integer> it = q.dequeueIndeks(2); it.hasNext(); ) {
            //Integer e = it.next();
            //System.out.println(e);
        //}

        q.enqueue(1,-2);
        q.dequeue();
        //q.sortIndeks(5);
        //q.refresh();
        System.out.println(q);

    }

}
