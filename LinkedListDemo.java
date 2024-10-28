
import java.util.LinkedList;

public class  LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <String> al =new LinkedList<String>();
        al.add("Rani");
        al.add("raza");
        al.add("Mharani");
        System.out.println(al);

        al.addFirst("Tiger");
        System.out.println("after adding first elemnets: "+al);
        al.addLast("Elephent");
        System.out.println("after adding last elements: "+al);

        al.removeFirst();
        System.out.println("after removing"+al);

       
    }
}
