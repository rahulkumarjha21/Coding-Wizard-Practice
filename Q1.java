/*Q1. You are provided with an array of numbers and the task is to find triplets in the array which adds up to a
given value. If there is such a triplet present in array, then print the triplet.
Example-1:
Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
Output: 12, 3, 9
Explanation: There is a triplet (12, 3 and 9) present
in the array whose sum is 24. */
import java.util.Scanner;
public class Q1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,sum,i,j,k;
		System.out.println("Enter The Length Of An Array:");
		n=sc.nextInt();
		int m[]=new int[n];
		System.out.println("Enter "+n+" Numbers In An Array:");
		for(i=0;i<n;i++)
			m[i]=sc.nextInt();
		System.out.println("Enter The Sum Value:");
		sum=sc.nextInt();
		System.out.print("Triplet Combinations: ");
		for(i=0;i<n-2;i++)
		{
			if(m[i]<=sum)
			{
				for(j=i+1;j<n-1;j++)
				{
					if(m[i]+m[j]<=sum)
					{
						for(k=j+1;k<n;k++)
						{
							if(m[i]+m[j]+m[k]==sum)
								System.out.print("("+m[i]+","+m[j]+","+m[k]+")  ");
						}
					}
				}
			}
		}
	}
}