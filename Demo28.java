class G{
	int id;
	String name;
	int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class Demo28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G g=new G();
		g.setId(233);
		System.out.println(g.getId());
		g.setAge(22);
		System.out.println(g.getAge());
		g.setName("gunvardhan");
		System.out.println(g.getName());
		

	}

}
