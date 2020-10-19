/******************************************************************************

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World");
		int coin[]={1,2,3};
		int sum=5;
		int l=coin.length;
		int mat[][]=new int [l+1][sum+1];
			for (int i=0;i<l+1;i++)
		{
		    mat[i][0]=0;
		}
		for (int i=0;i<sum+1;i++)
		{
		    mat[0][i]=Integer.MAX_VALUE-1;
		}
		for (int i=0;i<l;i++)
		{
		    for(int j=0;j<sum;j++)
		    {
		        if (coin[i]<=j)
		        {
		            mat[i][j]=Math.min(1+mat[i][j-coin[i-1]],mat[i-1][j]);
		        }
		        else {
		            mat[i][j]=mat[i-1][j];
		        }
		    }
		}
		System.out.println(mat[l][sum]);
		
	}
}
