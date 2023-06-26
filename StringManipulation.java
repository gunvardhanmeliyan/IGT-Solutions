import java.util.Scanner;
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string: ");
		String str1=sc.next();
		System.out.println("after reversing the string: ");
		char [] ch1=str1.toCharArray();
		String rev="";
		for(int i=ch1.length-1;i>=0;i--) {
			rev+=ch1[i];
			System.out.print(ch1[i]);
		}
		System.out.println();
		if(str1.equals(rev)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("it is not palindrome.");
		}

	}

}
