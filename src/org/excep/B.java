package org.excep;

public class B {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		String s = "ABC";
		int a[]= new int [4];
		try {
			System.out.println(a[4]);
			try {
			System.out.println(s.charAt(4));
			
		}catch (IndexOutOfBoundsException e) {
			System.out.println("zero");
		}
			System.out.println("dont try");
		}
		catch (Exception e) {
System.out.println(e);

		}
System.out.println(4);
System.out.println(5);
	}
	
}




