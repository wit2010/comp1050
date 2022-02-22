package lambda;

public class Addable2 {

	interface Addable {  
	    int add(int a,int b);  
	}  

	public static void main(String[] args) {
        
		// Lambda expression without return keyword.  
        Addable a1 = (a, b) -> (a + b);
        System.out.println(a1.add(10, 20));
          
        // Lambda expression with return keyword.    
        Addable a2 = (int a, int b) -> {
        	return a + b;
        };
        System.out.println(a2.add(100, 200));  
	}

}
