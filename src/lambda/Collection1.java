package lambda;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

    public static void main(String[] args) {  
        
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        list.forEach(
        		(element) -> System.out.println(element)
        );
    }

}
