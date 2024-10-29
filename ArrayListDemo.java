
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
      String arr [] ={"goa","mumbai","Pune"};
      for(String value:arr){
       System.out.println(value);
      }

     ArrayList al=new ArrayList(Arrays.asList(arr));
     System.out.println(al);
    }
}
