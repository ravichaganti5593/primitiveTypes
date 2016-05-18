package primitiveTypes;

public class reverseDigits {
	
	public static int reverse(int x) {
		
		String temp = Integer.toString(x);
		String result = "";
		
		if (x >= 0) {
			
			for (int i = temp.length() -1; i >= 0; i--) {
				result += temp.charAt(i);
			}
			
			x = Integer.parseInt(result);
			
			System.out.println("Result is " + x);
		}
		
		else {
			
			for (int i = temp.length()-1; i > 0; i--) {
				result += temp.charAt(i);
			}
			
			x = Integer.parseInt(result);
			x = -x;
			System.out.println("Result is " + x);			
		}
	
		return x;
		
	}
	
	public static void main (String [] args) {
		reverse(-12345);
	}
}
