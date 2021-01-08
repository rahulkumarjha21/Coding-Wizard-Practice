/*Q4. write a program where each column represents same number according to given example:
Example-1:
Input: 5
Output:
 1
212
32123
 212
 1*/
import java.util.Scanner;
public class Q4 
{
	public static void generatePattern(int n) 
    { 
        int mid=n/2,first=1,c; 
        for (int i=1;i<=n;i++) 
        {
            for (int j=1;j<=mid;j++) 
                System.out.print(" "); 
            c=(first/2)+1; 
            for (int k=1;k<=first;k++) 
            { 
                System.out.print(c); 
                if (k<=first/2) 
                    c=c-1; 
                else
                    c=c+1; 
            }
            System.out.println(); 
            if (i<=n/2) 
            { 
                mid=mid-1; 
                first=first+2; 
            } 
            else 
            { 
                mid=mid+1; 
                first=first-2; 
            } 
        } 
    } 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int n=sc.nextInt();
		if(n>=0)
			generatePattern(n);
		else
			System.out.println("Invalid Input Pattern Formation");
		
	}
}