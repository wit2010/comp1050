package lambda;

public class Drawable3 {

	interface IDrawable {
		void draw();
	}  

	public static void main(String[] args) {

		// with lambda
        IDrawable drawable1 = () -> {
        	System.out.println("{{[[(...)]]}}");
        };  
        
        drawable1.draw();

	
        IDrawable drawable2 = () -> {
        	System.out.println("{{[[(........)]]}}");
        };  
        
        drawable2.draw();
	
	}  

}
