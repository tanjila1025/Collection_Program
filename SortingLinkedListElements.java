import java.util.Collections;
import java.util.LinkedList;


public class SortingLinkedListElements {
    public static void main(String[] args) {
        LinkedList ala=new LinkedList();
        ala.add(200);
        ala.add(50);
        ala.add(45);
        ala.add(67);
        ala.add(400);

        Collections.sort(ala);
        System.out.println("after sorting elements:"+ala);


        LinkedList al=new LinkedList();
        al.add('p');
        al.add('d');
        al.add('u');
        al.add('t');
        al.add('g');
   
        Collections.sort(al);
        System.out.println("after sorting elements:"+al);


 
    }
}
