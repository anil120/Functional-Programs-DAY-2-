package pack1;
import com.function.utilities.utility;
public class FlipCoin 
{

	public static void main(String[] args) 
	{
		System.out.println("enter number of flips");
		int flip =utility.getInt();
		double head =0;
		double tail=0;
		for(int i =1;i<=flip;i++)
		{
			double d=Math.random();
			if(d<0.5)
			{
				tail++;
			}
			else
			{
				head++;
			}
		}
		System.out.println("head percentage is" + head/flip*100);
		System.out.println("tail percentage is" + tail/flip*100);
	}

}
