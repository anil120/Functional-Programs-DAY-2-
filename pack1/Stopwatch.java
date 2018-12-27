package pack1;
import com.function.utilities.utility;
public class Stopwatch
{
	public static void main(String[] args) 
	{
		double start =0.0;
		System.out.println("enter stop");
		double stop=utility.getDouble();
		double elapse=0;
		for(double i =0;i<=stop;i++)
		{
			elapse+=i;
		}
		System.out.println(elapse);
	}

}
