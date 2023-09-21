package javaprograms;

public class InbuiltDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String title = "Simplilearn is online course";
       if(title.contains("Simplilearn")) {
    	   System.out.println("Title is valid : Test case is passed");
       }
       else {
    	   System.out.println("Title is not valid : Test case is failed");
       }
       // method : substring()
       String title2 = "Practice Labs Java";
       String result = title.substring(14);
       if(result.equals("Java")) {
    	   System.out.println("String is valid");
       }
       else {
    	   System.out.println("String is not valid");
       }
	}

}
