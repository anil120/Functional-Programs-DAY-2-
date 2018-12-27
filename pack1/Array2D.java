package pack1;
import com.function.utilities.utility;
public class Array2D 
{
	public static void main(String[] args) 
	{
		System.out.println("enter no. of rows");
		int rows =utility.getInt();
		System.out.println("enter no. of columns");
		int columns=utility.getInt();
		int[][] a =new int[rows][columns];
		System.out.println("enter values");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				a[i][j]=utility.getInt();
			}
		}
		for(int k=0;k<=rows-1;k++)
		{
			for(int l=0;l<=columns-1;l++)
			{
				System.out.print(a[k][l]+" ");
			}
			System.out.println();
		}
	}

}
