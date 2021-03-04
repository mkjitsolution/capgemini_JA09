package p1;

public class StringDemo {
	
	public static void main(String[] args) {
		
			String str1 = "Hello";
			
			String str2 = "Hello";
			
			// String is an Object
			String str3 = new String("Hello");
			
			// String is an Object
			String str4 = new String("Hello");
			
			
			boolean a = (str1 == str2);
			boolean b = (str1 == str3);
			boolean c = (str3 == str4);
			
			System.out.println("a "+a);
			System.out.println("b "+b);
			System.out.println("c "+c);
			
			System.out.println(str3.equals(str4));
			
		
	}//end 

}//end class
