import java.util.Scanner;
class Em 
{
	int id;
	String name;
	int age;
	int salary;
	String desig;
	Scanner sc= new Scanner(System.in);
	Em()
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
}
class Cleerk extends Em
{
	Cleerk()
	{
		desig="Clerk";
		salary=20000;
	
	}
}
class Deveeloper extends Em 
{
	Deveeloper()
	{
		 desig="Developer";
		 salary=40000;
	}

}
class Testeer extends Em
{
	Testeer()
	{
		desig="Tester";
		 salary=30000;
	}
}
class Manageer extends Em
{	
	Manageer()
	{
		 desig="Manager";
		 salary=987659;
	}
}
public class Demo10a {

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
				Cleerk c= new Cleerk();	
				c.display();
			}
			else if(ch==2)
			{
				Deveeloper d = new Deveeloper();
				d.display();
			}
			else if(ch==3)
			{
				Testeer t = new Testeer();
				t.display();
			}
			else if(ch==4)
			{
				Manageer m = new Manageer();
				m.display();
			}
			else if(ch==5)
			{
				System.out.println("Thank you");
				System.exit(0);
			}
			
		}while(ch<=4);

	}

}
