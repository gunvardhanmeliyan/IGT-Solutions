interface I{
	int a=10;
	void add();
	void subtract();
	
}
interface J{
	int b=20;
	void multiply();
	void divide();
	
}
interface K extends I,J{
	
}
class Calc implements K{
	@Override public void add() {
		System.out.println("adding a and b: "+(I.a+J.b));
	}
	@Override public void subtract() {
		System.out.println("subtracting a from b: "+(I.a-J.b));
	}
	@Override public void multiply() {
		System.out.println("multiplying a and b: "+(I.a*J.b));
	}
	@Override public void divide() {
		System.out.println("dividing a from b: "+(I.a/J.b));
	}
}
public class Demo27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========calc class========");
		Calc calc=new Calc();
		calc.add();
		calc.subtract();
		calc.divide();
		calc.multiply();
		System.out.println("========I interface=======");
		I i=calc;
		i.add();
		i.subtract();
		System.out.println("=======J interface========");
		J j=calc;
		j.divide();
		j.multiply();
		System.out.println("==========K interface========");
		K k=calc;
		k.add();
		k.divide();
		k.multiply();
		k.divide();
		

	}

}
