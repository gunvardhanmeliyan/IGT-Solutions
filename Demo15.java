class Aa{
	Aa(){
		System.out.println("A()");
		
	}
	Aa(int a){
		System.out.println("A(int a)");
	}
	Aa(int a, String name){
		System.out.println("A(int a, String name)");
	}
}
public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a1=new Aa();
		Aa a2=new Aa(100);
		Aa a3=new Aa(200,"java");

	}

}
