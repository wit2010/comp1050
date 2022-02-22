package lambda;

public class Addable3 {

	interface Addable {  
	    int add(int a, int b);  
	}  

	public static void main(String[] args) {
        
        // You can pass multiple statements in lambda expression
        Addable addable = (int a, int b) -> {
        	int result = 0;
        	result += a;
        	result += b;
        	return result;
        };
        System.out.println(addable.add(100, 200));  
	}

}
