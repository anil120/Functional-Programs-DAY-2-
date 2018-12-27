package pack1;
import com.function.utilities.utility;
public class Quadratic
{
	public static void main(String[] args) 
	{
		System.out.println("enter 'a' value");
		int a =utility.getInt();
		System.out.println("enter 'b' value");
		int b =utility.getInt();
		System.out.println("enter 'c' value");
		int c =utility.getInt();
		int delta =b*b -4*a*c ;
		double root1=(-b + Math.sqrt(delta))/2*a;
		double root2=(-b - Math.sqrt(delta))/2*a;
		System.out.println(root1);
		System.out.println(root2);
	}

}
