class Aaa{
	Aaa(){
		System.out.println("I am class A");
	}
	void abc() {
		System.out.println("I am abc method");
	}
	
}
public class Demo6 {
	public static void main(String[] args) {
		Aaa a=new Aaa();
		a.abc();
		a.abc();
		a.abc();   //method running multiple times
	}

}
