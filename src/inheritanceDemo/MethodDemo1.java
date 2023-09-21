package inheritanceDemo;

public class MethodDemo1 {
	public void login() {
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("sign into mailbox");
	}
	public void composeEmail() {
		System.out.println("compose an email");
	}
    public void logout() {
    	System.out.println("click on logout button");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MethodDemo1 obj = new MethodDemo1();
      obj.login();
      obj.composeEmail();
      obj.logout();
	}

}
