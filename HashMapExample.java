import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapExample{
    public static void main(String[] args) {
        HashMap <Integer, String> m=new HashMap <Integer, String>();
        m.put(101, "riya");
        m.put(102,"smith");
        m.put(103,"scott");
        m.put(105,"Irfan");
        m.put(108,"Tanjila");

        System.out.println(m);

        System.out.println("******************");

        System.out.println(m.get(102)); //it will 

        System.out.println("******************");


        System.out.println(m.containsKey(103)); // it will check the key is present or not


        System.out.println(m.containsValue("riya")); // it checks the value is present is not
        
        System.out.println("******************");


        System.out.println(m.size()); // it will return the siz of 

        System.out.println("******************");


        System.out.println(m.remove(102));  //it will remove the specific key

        
        System.out.println("******************");

        System.out.println(m.keySet()); // it will returns only  keys

        System.out.println("******************");

    
        System.out.println(m.values()); //it returns all  only values


        System.out.println("******************");

        System.out.println(m.entrySet()); // it will return  the entry(pairs)

        System.out.println("******************");

        
        for(Object e :m.keySet()){
            System.out.println(e);
        }
        System.out.println("**********");

        for(Object e1 : m.values()){
            System.out.println(e1);
        }

        System.out.println("***********");

        for(Object e2:m.keySet()){
            System.out.println(e2+ " " +m.get(e2));
        }

        System.out.println("*************");
        
       // Entry Method 
       for(Map.Entry entry:m.entrySet()){
        System.out.println(entry.getKey()+ "  " +entry.getValue());

       }
     
       System.out.println("******************");

       //Iterator Method
       Set<Entry<Integer, String>> s=m.entrySet();
       Iterator itr= s.iterator();

       while(itr.hasNext()){
        
        Map.Entry entry=(Entry) itr.next();
        System.out.println(entry.getKey()+ " " +entry.getKey());
       }

       System.out.println("******************");

        m.clear();
        System.out.println(m);
    }
}