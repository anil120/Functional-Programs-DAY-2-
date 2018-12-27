package pack1;
import com.function.utilities.utility;
public class SumOfThree
{
	public static void main(String[] args) 
	{
		int count=0;
		System.out.println("enter array size");
		int arrsize= utility.getInt();
		int[] a =new int[arrsize];
		System.out.println("enter array elements");
		for(int i =0;i<a.length;i++)
		{
			a[i]=utility.getInt();
		}
		for(int j=0;j<a.length;j++)
		{
			for(int k=j+1;j<a.length;j++)
			{
				for(int l=k+1;l<a.length;l++)
				{
					if(a[j]+a[k]+a[l]==0)
					{
						System.out.println(a[j]+" " +a[k]+" " +a[l]);
						count++;
					}
				}
			}
		}
		System.out.println("no. of triplets are "+ count);
	}

}
