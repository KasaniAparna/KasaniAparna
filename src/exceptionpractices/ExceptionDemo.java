package exceptionpractices;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i =8;
int j =0;
try {
System.out.println("Result" +i/j);
}
catch(ArithmeticException e) {
	System.out.println(e.getMessage());
	System.out.println("Print value of j");
}
System.out.println("Result of subtraction " +(i-j));
System.out.println("Result of multiplication " +i*j);
System.out.println("Result of addition " +i+j);
	}

}
