package exceptionpractices;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =8;
		int j =0;
		try {
		System.out.println("Result" +i/j);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
		System.out.println("Result of subtraction " +(i-j));
		System.out.println("Result of multiplication " +i*j);
		System.out.println("Result of addition " +i+j);
		}
	}

}
