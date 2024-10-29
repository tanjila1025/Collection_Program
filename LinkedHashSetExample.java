
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        
        LinkedHashSet lset=new LinkedHashSet();
        lset.add(67);
        lset.add(90);
        lset.add(20);
        lset.add(34);

        System.out.println(lset);

        System.out.println("checking set is empty or not : " +lset.isEmpty());

        System.out.println("to check elements: "+lset.contains(20));

        lset.removeAll(lset);
        System.out.println(" After removing elements:"+lset);

        
    }
}
