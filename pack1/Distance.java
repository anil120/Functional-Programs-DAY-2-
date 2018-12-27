package pack1;
import com.function.utilities.utility;
public class Distance 
{
	public static void main(String[] args) 
	{
		System.out.println("enter value of 'x' ");
		  int x = utility.getInt();
		  System.out.println("enter value of 'y'");
		  int y = utility.getInt();

		  double distance = Math.pow((x*x + y*y),0.5);
		  System.out.println("Distance: "+ (int)distance);	
		}
}



