import java.util.Scanner;
class Az{
	Az(){
		System.out.println(" a class constructor.");
	}
	void abc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number a:");
		int a=sc.nextInt();
		System.out.println("enter number b:");
		int b=sc.nextInt();
		System.out.println("enter number c:");
		int c=sc.nextInt();
		int max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		
		System.out.println("maximum out of those numbers is: "+max);

		
	}
}
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Az a=new Az();
	 a.abc();

	}

}
