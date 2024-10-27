import java.util.ArrayList;
public class ArrayListExample{
    public static void main(String[] args){
        ArrayList al= new ArrayList();
        // add methods to add new elements with different datatypes
        al.add(100);
        al.add(true);
        al.add('A');
        al.add(15.5);
        al.add("java");
        System.out.println(al);
        //For getting all the elements in list use the size method
        System.out.println(al.size());
        //for removing the elements
        al.remove(1);
        System.out.println("After removing elements :"+al);
        al.add(2,"pthoyn");
        System.out.println("After adding elements :"+al);

        //to retrive the data use get method
        System.out.println(al.get(0));

        // to change or replace the elements use the set method
        al.set(3,"riya");
        System.out.println("replaced data is"+al);
        //it checks the elements is presents or not it returns tru or false
        System.out.println(al.contains("riya"));

        System.out.println(al.isEmpty());
        // reading elements using for loop
        System.out.println(" reading elements using for loop");
        for (int i = 0; i <al.size(); i++) {

            System.out.println(al.get(i));
        }

        //reading elemnets using for each loop
        System.out.println(" reading elements using for each loop");
        for(Object e: al){
            System.out.println(e);
        }
    }
}