import java.util.Scanner;
class AgeException extends Exception{
	AgeException(String msg){
		super(msg);
	}
}
class AgeChecker {
	void age() throws AgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		if(age==65) {
			throw new AgeException("age should not be 65.");
		}
		else {
			System.out.println("good to go.");
		}
	}
}
public class Demo35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi i am main");
		try {
			AgeChecker age=new AgeChecker();
			age.age();
		}
		catch(AgeException e){
			System.out.println(e);
			
		}

	}

}
