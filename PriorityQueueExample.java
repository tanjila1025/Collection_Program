
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();
        q.add(206);
        q.add(200);
        q.add(207);
        q.add(204);
        q.add(202);

        System.out.println(q);
        PriorityQueue ql=new PriorityQueue();
        ql.offer(20);
        ql.offer(25);
        ql.offer(26);
        ql.offer(23); 
    
       System.out.println(ql);

       ql.element();//if queue is empty & we are try to access head elements then it will throw exception
        
       System.out.println(ql.element());

        q.peek();
        System.out.println(q);
        
        System.out.println(ql.remove());

        System.out.println(q.poll());


        Iterator itr = ql.iterator();
        //hashNext() check the elements are present or not
        while(itr.hasNext()){
            System.out.println(itr.next()); //it provides next elements
        }

        


    }
}
