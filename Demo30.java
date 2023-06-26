import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		m1();
		
	}
	static void m1() {
		System.out.println("hi i am m1 method");
		m2();
	}
	static void m2() {
		System.out.println("hi i am m2 method");
		m3();
	}
	static void m3() {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("hi i am m3 method");
			System.out.println("enter number a: ");
			int a=sc.nextInt();
			System.out.println("enter number b: ");
			int b=sc.nextInt();
			float c=a/b;
			System.out.println("result after division is: ");
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("division by zero error. not possible");
		}
		catch (InputMismatchException e) {
			System.out.println("pass a valid number only");
		}
	}

}
