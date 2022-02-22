package lambda;

public class Sayable1 {

	interface Sayable {  
	    public String say();  
	}  

	public static void main(String[] args) {

		Sayable sayable = () -> {
	        return "I have nothing to say.";
	    };

	    System.out.println(sayable.say());  
    }  

}
