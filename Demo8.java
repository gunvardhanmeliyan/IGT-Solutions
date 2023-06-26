class Cc{
	int a=1000;
}
class D extends Cc{
	int a=100;
	void abc(int a) {
		System.out.println("hi i am class D :"+a);
		System.out.println("hi i am class D instance variable :"+this.a);
		System.out.println("hi i am class Cc: "+super.a);
		
		
	}
}
public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D();
		d.abc(10);

	}

}
