
import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("A");
        al.add("D");
        al.add("C");
        al.add("G");
        al.add("T");
        al.add("W");
        al.add("I");
        
        System.err.println("Befor sorting elements :"+al);
        Collections.sort(al);
        System.err.println("After sorting elements :"+al);
       
        ArrayList <Integer> arr=new ArrayList <Integer>();
        arr.add(1000);
        arr.add(300);
        arr.add(700);
        arr.add(100);
        arr.add(340);
        arr.add(250);
        arr.add(800);

        System.err.println("Befor sorting elements :"+arr);
        Collections.sort(arr);
        System.err.println("After sorting elements :"+arr);

       
        arr.remove(0);
        System.out.println("after removing all the elemnets:"+arr);
        System.out.println(arr.size());

        arr.removeAll(arr);
        System.out.println("after removing all the elemnets:"+arr);

        ArrayList aal=new ArrayList();
        aal.add(35);
        aal.add(10);
        aal.add(60);
        aal.add(20);
        aal.add(90);
        Collections.sort(aal, Collections.reverseOrder());
        System.out.println("after sorting the reverse elements are:"+aal);

        Collections.sort(aal, Collections.reverseOrder());
        System.out.println("after sorting the reverse elements are:"+aal);
        
        Collections.shuffle(aal);
        System.out.println("after shufflening the elements are:"+aal);




       

    }
}
