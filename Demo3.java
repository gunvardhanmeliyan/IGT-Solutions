class A{
	A() {
		System.out.println("I am class A");
	}
}
class B{
	B() {
		System.out.println("I am class B");
	}
}
class C{
	C(){
		System.out.println("I am class C");
	}
}
public class Demo3 {
	public static void main(String[] args) {
		System.out.println("I am demo3 class.");
		A a=new A();
		B b=new B();
		C c=new C();
	}
	

}
