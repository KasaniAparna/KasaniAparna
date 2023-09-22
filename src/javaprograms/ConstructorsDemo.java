package javaprograms;

public class ConstructorsDemo {
	public ConstructorsDemo () {
		System.out.println("This is default constructor");
	}
		public ConstructorsDemo (int a)
		{
			System.out.println("This is parametrized constructor");
			System.out.println("The value of variable is :" +a);
		}
		public ConstructorsDemo (int a,int b)
		{
			System.out.println("This is parametrized constructor");
			System.out.println("The value of variable is :" +a);
			System.out.println("The value of variable is :" +b);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorsDemo obj = new ConstructorsDemo();
ConstructorsDemo obj2 = new ConstructorsDemo(5);
ConstructorsDemo obj3 = new ConstructorsDemo(5,6);
	}

}
