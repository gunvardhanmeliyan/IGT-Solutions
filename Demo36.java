
public class Demo36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi i am main.");
		String str1="Gunvardhan";
//		str1=null;  //null pointer exception
		System.out.println(str1.length());
		int [] arr1= {1,2,3,4,5,6};
		System.out.println(arr1[4]);
//		System.out.println(arr1[10]);    //array_index_out_of_bound_exception
		String num="100";
//		String num2="100abc";    //format_mismatch_exception
		int n=Integer.parseInt(num);
		
		

	}

}
