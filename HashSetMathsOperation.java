
import java.util.HashSet;

public class HashSetMathsOperation {
    public static void main(String[] args) {
        HashSet <Integer> set1= new HashSet <Integer>();
        set1.add(9);
        set1.add(2);
        set1.add(4);
        System.out.println(set1);

        HashSet <Integer> set2= new HashSet <Integer>();
        set2.add(2);
        set2.add(7);
        set2.add(4);
        System.out.println(set2);


        set1.addAll(set2);
        System.out.println("Union:" +set1);

        set1.retainAll(set2);
        System.out.println("Intersection:" +set1);

        set1.containsAll(set2 );
        System.out.println("subset of s1 :" +set1);

        set1.removeAll(set2);
        System.out.println("differece:" +set1);








    }
}
