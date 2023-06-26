abstract class A{
	abstract void abc();
}
abstract class B extends A{
	@Override void abc() {
		System.out.println("hi i am abc of class A");
	}
	abstract void xyz();
}
class C extends B{
	@Override void xyz() {
		System.out.println("hi am xyz of class B");
	}
}
public class Demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.abc();
		c.xyz();

	}

}
