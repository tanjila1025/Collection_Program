
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet sh=new HashSet();
        //insertion order is not preserved
        sh.add(100);
        sh.add(70);
        sh.add("java");
        sh.add('T');
        sh.add('I');
        sh.add('T');
        System.out.println(sh);


        sh.remove("java");
        System.out.println("after removing :"+sh);


        for (Object e: sh) {
            System.out.println(e);
        }

        System.out.println("to check the elements: "+ sh.contains('I'));
 
        System.out.println("to check the set is empty or not:"+sh.isEmpty());
    }
}
