import java.io.*;

public class Demo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi i am main");
		m1();
	}
	static void m1() {
		System.out.println("hi i am m1");
		m2();
	}
	static void m2() {
		System.out.println("hi i am m2");
		m3();
	}
	static void m3() {
		System.out.println("hi i am m3");
		try {
			File f=new File("xyz.txt");
			FileReader ff=new FileReader(f);
			
		}
		catch(FileNotFoundException e) {
			System.out.println("some error occured, not possible.");
		}
		finally {
			System.out.println("thank you!!!");
		}
		
	}

}
