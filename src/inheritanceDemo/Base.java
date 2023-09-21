package inheritanceDemo;

public class Base {
      public void openbrowser(String browser)
      {
    	  System.out.println("open the browser:" +browser);
      }
      public  static void login(String username,String password) {
  		System.out.println("enter username:" +username);
  		System.out.println("enter password:" +password);
  		System.out.println("sign into mailbox");
  	}
      public void logout() {
      	System.out.println("click on logout button");
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
