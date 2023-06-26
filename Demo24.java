class E{
	static int a=123;
	static void hello() {
		System.out.println("hello i am hello method in class E.");
	}
}
public class Demo24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//E e=new E();
		//System.out.println(e.a);
		//System.out.println(e.hello());
//		now doing using static variable
		System.out.println("printing using static keyword: ");
		E.hello();
		System.out.println(E.a);
		

	}

}
