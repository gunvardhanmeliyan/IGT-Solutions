class A{
	A(){
		System.out.println("A class constructor.");
	}
}
class B extends A{
	B(){
		System.out.println("B class constructor.");
	}
}
public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a=new A();
		B b=new B(); 

	}

}
