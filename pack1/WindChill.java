package pack1;
import com.function.utilities.utility;
public class WindChill
{

	public static void main(String[] args) 
	{
		System.out.println("enter temperature");
		double t =utility.getDouble();
		System.out.println("enter wind speed");
		double v =utility.getDouble();
		double a = Math.pow(v, 0.16);
		if(t<50 && (v<120 && v>3))
		{
			double w = 35.74 + 0.6215 +(.4275 + 35.75)*a;
			System.out.println(w);
		}
		else
		{
			System.out.println("invalid temperature or speed");
		}
	}

}
