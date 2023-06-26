class Parent{
	int site=5;
	int money=500000;
	 private String car="bmw";
	
}
class Child extends Parent{
	int money=10000;
	void use() {
		System.out.println("site: "+site);
		System.out.println("child money: "+this.money);
		System.out.println("parent money:"+super.money);
		System.out.println("both money:"+(super.money+this.money));
		//System.out.println("accessing car, can't access as it is private:"+car);
	}
}
public class Demo8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child();
		child.use();

	}

}
