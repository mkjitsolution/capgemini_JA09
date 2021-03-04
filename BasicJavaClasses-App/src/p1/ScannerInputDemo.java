package p1;

import java.util.Scanner;

public class ScannerInputDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Int ");
		String abc = sc.nextLine();
		int x = Integer.parseInt(abc);
		System.out.println(" x as int "+x+"\n");
		
		
		System.out.println(" Enter String ");
		String str = sc.nextLine();
		System.out.println(" Str as String "+str+"\n");
		
		System.out.println(" Enter Float ");
		float f = Float.parseFloat(sc.nextLine());
		System.out.println(" f as float "+f+"\n");
		
		
		
		
		
		
		
		
		
		
	}
}
