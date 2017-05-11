import java.util.Scanner;
public class two_d_arr_sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int m[][]=new int[50][60];
		int n[][]=new int[60][60];
		int o[][]=new int[70][70];
		int i,j,r,c;
				System.out.println("ENTER ROWS AND COLUMNS OF FIRST MATRIX");
		r=sc.nextInt();
		c=sc.nextInt();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		System.out.println("YOUR FIRST MATRIX IS");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("\t"+m[i][j]);
			}
			System.out.println();
		}
		System.out.println("ENTER ROWS AND COLUMNS OF SECOND MATRIX");
		r=sc.nextInt();
		c=sc.nextInt();
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				n[i][j]=sc.nextInt();
			}
		}
		System.out.println("YOUR SECOND MATRIX IS");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("\t"+n[i][j]);
			}
			System.out.println();
		}
		System.out.println("THE SUM OF TWO MATRICES IS:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				o[i][j]=m[i][j]+n[i][j];
				System.out.print("\t"+o[i][j]);
			}
			System.out.println();
		}	
	}

}