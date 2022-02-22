package lambda;

public class Drawable1 {

	interface IDrawable {
		public void draw();
	}  

	static class Drawable implements IDrawable {

		@Override
		public void draw() {
        	System.out.println("=>=>=>...<=<=<=");
		}

	}

	public static void main(String[] args) {

		IDrawable drawable = new Drawable();

        drawable.draw();
    }  
	
}
