import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number a: ");
		int a=sc.nextInt();
		System.out.println("enter number b: ");
		int b=sc.nextInt();
		System.out.println("after reversing");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A: "+a);
		System.out.println("B: "+b);

	}

}
