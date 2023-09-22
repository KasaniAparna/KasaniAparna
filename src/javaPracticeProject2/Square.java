package javaPracticeProject2;

public class Square extends Shape {
	
	  private int length;
	  
	    public Square(int length) {
			// TODO Auto-generated constructor stub
	    	this.length = length;
		}

		@Override
	    public void displayArea() {
	        System.out.println("Area of the Square: " + calculateArea());
	    }

	    public double calculateArea() {
	        return length * length;
	    }

}
 

	