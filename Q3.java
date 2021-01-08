/*Q3) Write an efficient program that takes integer as input and convert a given integer into an equivalent
Roman numeral. (Check it in integer range 0 to 1000.)
Example-1:
Input: 5
Output: “V”*/
import java.util.Scanner;
public class Q3 
{
	public static String getRoman(int n)
	{
		String s1[]= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String s2[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String s3[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String s4[] = {"","M"};
		String str="";
		str=str+s4[n/1000];
		n=n%1000;
		str=str+s3[n/100];
		n=n%100;
		str=str+s2[n/10];
		n=n%10;
		str=str+s1[n];
		return(str);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter An Integer Between (0 to 1000): ");
		int n=sc.nextInt();
		if(n>=0 && n<=1000)
			System.out.println("Roman Value: "+getRoman(n));
		else
			System.out.println("Invalid Range...");
	}
}