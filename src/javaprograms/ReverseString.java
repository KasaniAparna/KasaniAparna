package javaprograms;

public class ReverseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String original = "Aparna";
       String reversed = reverseString(original);
      System.out.println(reversed);
	}
	public static String reverseString( String original) {
		StringBuilder stringBuilder = new StringBuilder(original);
		stringBuilder.reverse();
		return
		stringBuilder.toString();
	}
}
        
        
        
        
        
	
     

