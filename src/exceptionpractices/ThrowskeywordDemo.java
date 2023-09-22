package exceptionpractices;

public class ThrowskeywordDemo {
	public void div (int a,int b) 
	{
		if (b==0)
		{
			throw new ArithmeticException ();
		}
		else {
		int c = a/b;
		System.out.println("The division of 2 numbers is:" + c);
		}
	}

	public static void main(String[] args)  throws ArithmeticException{
		// TODO Auto-generated method stub
ThrowskeywordDemo obj = new ThrowskeywordDemo();
try {
obj.div(12, 0);
	}
catch (Exception e) {
	System.out.println("Execute the code");
}
}
}    
		
		
		
		
		
		
		
		
		
		
	


