
import java.util.LinkedList;

public class LinkedListExample{
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(100);
        l.add('A');
        l.add("Rani");
        l.add(null);
        l.add(19.5);
        l.add(true);
        System.out.println(l);

        System.out.println();

        l.addFirst("Raza");
        System.out.println("after adding first elemnets:"+l);

        l.addLast("Python");
        System.out.println("after adding last elemnets:"+l);
        
        l.removeFirst();
        System.out.println("After removing first elements:"+l);

        l.removeLast();
        System.out.println("After removing last elements:"+l);

        System.out.println("After checking elements:"+l.contains("rani"));
        System.out.println("After checking elements:"+l.contains("Rani"));

        System.out.println("After checking elements:"+l.contains(19.5));

        System.out.println("After checking elements is empty or not:"+l.isEmpty());

        //reading elemnets using for loop
        for(int i=0; i<l.size();i++){
            System.out.println(l.get(i));
        }
       // reading elemnets using for each elements

       for(Object e : l ){
        System.out.println(e);
       }

    }
}
