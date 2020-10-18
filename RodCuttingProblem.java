/******************************************************************************

                            Rod Cutting problem Unbounded Knapsack

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int len[]={1,2,3,4,5,6,7,8};
		int price[]={1,5,8,9,10,17,17,20};
		int l=len.length;
		int m=price.length;
		int mat[][]=new int[l+1][m+1];
		for (int i=0;i<=l;i++)
		{
		    mat[i][0]=0;
		}
		for (int j=0;j<=m;j++)
		{
		    mat[0][j]=0;
		}
		for(int i=1;i<=l;i++)
		{
		   for (int j=1;j<=m;j++)
		   {
		       if (len[i-1]<=j)
		       {
		           mat[i][j]=Math.max(price[i-1]+mat[i-1][j-len[i-1]],mat[i-1][j]);
		       }
		       else {
		           mat[i][j]=mat[i-1][j];
		       }
		   }
		    
		}
		System.out.println("Maximum value Obtainable: "+mat[l][m]);
	}
}