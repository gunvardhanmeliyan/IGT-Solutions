class F{
	void display() {
		System.out.println("hiiiiiiiii");
	}
}
class G extends F{
	@Override void display() {
		System.out.println("hellooooooo");
		
	}
}
public class Demo19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G g=new G();
		g.display();

	}

}
