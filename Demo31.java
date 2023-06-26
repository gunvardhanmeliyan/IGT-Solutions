interface University{
	void exam();
	void result();
}
class IITA implements University{
	public void exam() {
		System.out.println("we conduct exams online.");
	}
	public void result() {
		System.out.println("we declare result on email.");
	}
}
class IITB implements University{
	public void exam() {
		System.out.println("we conduct exams in offline mode");
	}
	public void result() {
		System.out.println("we declare results on the web");
	}
}
class IITC implements University{
	public void exam() {
		System.out.println("we conduct exams in hybrid mode");
	}
	public void result() {
		System.out.println("we declare results in the newspaper");
	}
}
public class Demo31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IITA a=new IITA();
		System.out.println("=====IITA========");
		a.exam();
		a.result();
		IITB b=new IITB();
		System.out.println("=====IITB========");
		b.exam();
		b.result();
		IITC c=new IITC();
		System.out.println("=====IITC========");
		c.exam();
		c.result();

	}

}
