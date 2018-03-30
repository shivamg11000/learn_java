
import java.util.ArrayList;

public class dynamicArray{
    public static void main(String[] args) {
        
        // ArrayList<dataType> variable = new ArrayList<dataType>();
        // default dataType <Object>

        ArrayList genArr = new ArrayList();
        genArr.add(1);
        genArr.add(2);
        genArr.add("string");
        
        for(Object item : genArr){
            System.out.println(item);
        }
        System.out.println(genArr.size()); // length of genArr

        // String type
        ArrayList<String> strArr = new ArrayList<String>();
        strArr.add("a");
        strArr.add("b");
        strArr.add("c");
        
        for(String item: strArr){
            System.out.println(item);
        }
    }
}