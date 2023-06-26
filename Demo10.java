import java.util.Scanner;
class Empp{
	String name;
	int id;
	Scanner sc=new Scanner(System.in);
	Empp(){
		System.out.print("enter id ");
		 id=sc.nextInt();
		System.out.print("enter name ");
		 name=sc.next();
		
	}
}
class Clerkk extends Empp{
	int salary=10000;
	String desig="clerk";
	void display() {
		System.out.println("displaying details for clerk");
		System.out.println("id :"+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("designation: "+desig);
	}
}

class Devv extends Empp{
	
	int salary=20000;
	String desig="developer";
	
	void display() {
		System.out.println("displaying details for dev");
		System.out.println("id :"+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("designation: "+desig);
	}
	}

class Managerr extends Empp{
	int salary=50000;
	String desig="manager";
	

	void display() {
		System.out.println("displaying details for manager");
		System.out.println("id :"+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("designation: "+desig);
	}
}

class Testerr extends Empp{

	int salary=7000;
	String desig="tester";
	

	void display() {
		System.out.println("displaying details for tester");
		System.out.println("id :"+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		System.out.println("designation: "+desig);
	}
}



public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("enter your choice (1=clerk,2=dev,3=tester,4=manager,5=exit): ");
		 choice=sc.nextInt();
		if(choice==1) {
			Clerkk clerk =new Clerkk();
			clerk.display();
		}
		else if(choice==2) {
			Devv dev=new Devv();
			dev.display();
		}
		else if(choice==3) {
			Testerr tester=new Testerr();
			tester.display();
		}
		else if(choice==4) {
			Managerr manager=new Managerr();
			manager.display();
		}
		else if(choice==5) {
			System.out.println("thank you");
			System.exit(0);
		}
		}while(choice<=4);
		//clerk.display();
		//dev.display();
		//manager.display();
		//tester.display();
	}

}
