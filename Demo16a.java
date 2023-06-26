class Draww{
	Draww(){
		this(10);
		System.out.println("Draw()");
	}
	Draww(int a){
		this(2,4);
		System.out.println("Draw(int a) it is area of square: "+a*a);
	}
	Draww(int a,int b){
		System.out.println("Draw(int a, int b) it is area of rectangle: "+a*b);
	}
}
public class Demo16a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draww d1=new Draww();
//		Draww d2=new Draww(50);
//		Draww d3=new Draww(24,78);

	}

}
