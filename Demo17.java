class Employee
{
    Employee(int id, String name , int age , int salary , String desig, String pan)
    {
        System.out.println(" yes perferct  HR ");
    }
    Employee(int id, String name , String project, String loc)
    {
        System.out.println(" yes perferct  manager ");    
    }

}
public class Demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e1 = new Employee(100,"Rama",35,45678,"Dev","ABC123");
	        Employee e2 = new Employee(100,"Rama","Facebok","Banglore");

	}

}
