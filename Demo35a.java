import java.io.*;
import java.util.*;
import java.sql.*;
class Aw
{
    void abc() throws InvalidAgeeException,FileNotFoundException,NullPointerException,SQLException
    {
        for(int i=1;i<=25;i++)
        {
            if(i==15) throw new FileNotFoundException();
            if(i==10) throw  new InputMismatchException();
            if(i==20) throw  new NullPointerException();
            if(i==9) throw new SQLException();
            if(i==18)  throw new InvalidAgeeException("Please Check age Once  again ...!");
            System.out.println("I  :"+i);
        }
    }
}
public class Demo35a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try
	        {
	            Aw a= new Aw();
	            a.abc();
	        }
	        catch(InvalidAgeeException iae)
	        {
	            System.out.println(iae);
	        }
	        catch(NullPointerException np)
	        {
	            System.out.println("Null pointer came");
	        }
	        catch(FileNotFoundException fn)
	        {
	            System.out.println("File not fouund  came");   
	        }
	        catch(InputMismatchException ime)
	        {
	            System.out.println("INPU mISS MATHC ");   
	        }
	        catch(SQLException sql)
	        {
	            System.out.println("SQL CAME ");
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	        finally
	        {
	            System.out.println("Thank you....!");
	        }

	}

}
class InvalidAgeeException extends Exception {​​​​​


    InvalidAgeeException(String msg) {​​​​​
       super(msg);

    }​​​​​


}​​​​​
