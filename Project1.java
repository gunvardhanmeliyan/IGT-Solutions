import java.util.Scanner;
abstract class Emp 
{
	int id;
	String name;
	int age;
	int salary;
	String desig;
	Scanner sc= new Scanner(System.in);
	Emp()
	{
		System.out.print("Enter ID: ");
		id= sc.nextInt();

		System.out.print("Enter Name :");
		name= sc.next();
	
		System.out.print("Enter Age: ");
		age= sc.nextInt();	
	}
	void display()
	{
		System.out.println("========================");
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Designation :"+desig);
	}
	abstract int raisesalary();
	abstract void bonus();
}
class Clerk extends Emp
{
	Clerk()
	{
		desig="Clerk";
		salary=20000;
	
	}
	@Override int raisesalary() {
		return salary+=10000;
	}
	@Override void bonus() {
		System.out.println("clerk bonus is: 2000");
	}
}
class Developer extends Emp 
{
	Developer()
	{
		 desig="Developer";
		 salary=40000;
	}
	@Override int raisesalary() {
		return salary+=20000;
	}
	@Override void bonus() {
		System.out.println("developer bonus is: 5000");
	}

}
class Tester extends Emp
{
	Tester()
	{
		desig="Tester";
		 salary=30000;
	}
	@Override int raisesalary() {
		return salary+=5000;
	}
	@Override void bonus() {
		System.out.println("tester bonus is: 1500");
	}
}
class Manager extends Emp
{	
	Manager()
	{
		 desig="Manager";
		 salary=987659;
	}
	@Override int raisesalary() {
		return salary+=25000;
	}
	@Override void bonus() {
		System.out.println("manager bonus is: 8000");
	}
}
public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("1 ) Clerk ");
			System.out.println("2 ) Developer");
			System.out.println("3 ) Tester ");
			System.out.println("4 ) Manager");
			System.out.println("5 ) Exit");
			System.out.print("Enter the Chioice :");
			ch=sc.nextInt();
			if(ch==1)
			{
				Clerk c= new Clerk();	
				c.display();
				c.raisesalary();
				System.out.println("salary after raising.");
				c.display();
				c.bonus();
			}
			else if(ch==2)
			{
				Developer d = new Developer();
				d.display();
				d.raisesalary();
				System.out.println("salary after raising.");
				d.display();
				d.bonus();
			}
			else if(ch==3)
			{
				Tester t = new Tester();
				t.display();
				t.raisesalary();
				System.out.println("salary after raising.");
				t.display();
				t.bonus();
			}
			else if(ch==4)
			{
				Manager m = new Manager();
				m.display();
				m.raisesalary();
				System.out.println("salary after raising.");
				m.display();
				m.bonus();
			}
			else if(ch==5)
			{
				System.out.println("Thank you");
				System.exit(0);
			}
			
		}while(ch<=4);

	}

}
