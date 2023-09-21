package inheritanceDemo;

public class Payments  extends HomePage{ 
	public void Payments()
	{
		System.out.println("test payments page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Payments obj = new Payments();
      obj.openbrowser("chrome");
      login("harika","harika");
      obj.HomePagetest();
      obj.Payments();
      obj.logout();
	}

}
