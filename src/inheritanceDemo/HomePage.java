package inheritanceDemo;

public class HomePage extends Base {
	public void HomePagetest()
	{
		System.out.println("Test from HomePage");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HomePage obj = new HomePage();
      obj.openbrowser("Chrome");
      login("appu","appu");
      obj.HomePagetest();
      obj.logout();
	}

}
