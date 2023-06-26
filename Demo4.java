import java.util.Scanner;

class Aa{
	String name;
	int age;
	int salary;
	int id;
	String desig;
	
	Aa(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter id ");
		 id=sc.nextInt();
		System.out.print("enter name ");
		 name=sc.next();
		
		System.out.println("enter your age:");
		 age=sc.nextInt();
		System.out.println("enter your salary: ");
		 salary=sc.nextInt();
		System.out.println("enter your designation: ");
		 desig=sc.next();
		 
		 
		 
		 
		 sc.close();
	}
	void display() {
		System.out.println("id :"+id);
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
		System.out.println("designation: "+desig);
		
	}
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a=new Aa();
		a.display();

	}

}
