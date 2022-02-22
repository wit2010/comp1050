package lambda;

public class Drawable2 {

	interface IDrawable {
		public void draw();
	}  

	public static void main(String[] args) {

		// without lambda, IDrawable implementation using anonymous class
		
		IDrawable drawable = new IDrawable() {
			@Override
            public void draw() {
            	System.out.println("{{[[(...)]]}}");
            }
        };

        drawable.draw();
    }  
	
}
