class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}
class Aq{
	void abc() throws InvalidAgeException{
		for(int i=1;i<=25;i++) {
			if(i==18) {
				throw new InvalidAgeException("please check your age once again.");
			}
//			System.out.println("age is: "+i);
		}
	}
}
public class Demo34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi i am main method");
		try {
			Aq a=new Aq();
			a.abc();
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("hi i am finally block");
		}

	}

}
