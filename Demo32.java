import java.io.*;
public class Demo32 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	}
	static void m1() throws FileNotFoundException {
		System.out.println("hi i am m1");
		m2();
	}
	static void m2() throws FileNotFoundException {
		System.out.println("hi i am m2");
		m3();
	}
	static void m3() throws FileNotFoundException {
		System.out.println("hi i am m3");
		File f=new File("xyz.txt");
		FileReader ff=new FileReader(f);
	}

}
