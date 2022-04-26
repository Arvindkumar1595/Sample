package org.excep;

public class TestException {
public static void main(String[] args) {
	System.out.println(0);
	System.out.println(1);
	System.out.println(2);
	String s= null;
	try {
		System.out.println(3);
		try {
			System.out.println(s.charAt(4));
		}catch (StringIndexOutOfBoundsException e) {
				System.out.println(e);
				
		
		}catch (Exception e) {
			System.out.println(e);

		}
	}finally {
		System.out.println("end");
	}
	System.out.println(4);
	System.out.println(5);
}

}
