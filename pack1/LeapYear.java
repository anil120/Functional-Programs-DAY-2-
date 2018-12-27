package pack1;
import com.function.utilities.utility;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		System.out.println("enter year");
		int year =utility.getInt();
		if(year<1000)
		{
			System.out.println("enter a valid year");
		}
		else
		{
			if(year%4==0 && year%100!=0 || year%400==0)
			   System.out.println(year +" is a leap year ");
			else
				System.out.println(year +"is not a leap year");
		}

	}

}
