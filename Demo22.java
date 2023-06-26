class A
{
    int a;//0
    A(){}
}
class A1{}
//class A2 extends A1,A{}
abstract class B
{
    int a;// 0
    B(){}
}
interface I
{
    //int a;
    //I(){}
    void abc();
}
interface J{}
interface K extends J,I{}
public class Demo22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I i = new I();no   

	}

}
