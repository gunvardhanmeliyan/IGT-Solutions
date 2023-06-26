class X{
	void draw() {
		System.out.println("Draw() method.");
		
	}
	void draw(int a) {
		System.out.println("Draw(int a) method: (square) "+a*a);
	}
	void draw(int a,int b) {
		System.out.println("Draw(int a,int b): (rectangle) "+a*b);
	}
}
public class Demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x=new X();
		x.draw();
		x.draw(43);
		x.draw(32, 76);

	}

}
