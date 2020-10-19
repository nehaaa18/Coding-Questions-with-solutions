/******************************************************************************

coin change problem max number of ways
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int arr[]={1,2,3};
		int sum=5;
		int mat[][]=new int[arr.length+1][sum+1];
		for (int i=0;i<arr.length;i++)
		{
		    mat[i][0]=1;
		}
		for (int j=0;j<=sum;j++)
		{
		    mat[0][j]=0;
		}
		for (int i=1;i<=arr.length;i++)
		{
		    for (int j=1;j<=sum;j++)
		    {
		        if (arr[i-1]<=j)
		        {
		            mat[i][j]= mat[i][j-arr[i-1]] +mat[i-1][j];
		        }
		        else{
		            mat[i][j]=mat[i-1][j];
		        }
		    }
		}
		System.out.println(mat[arr.length][sum]);
	}
}
