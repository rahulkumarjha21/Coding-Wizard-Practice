/*Q2. Write an efficient program that takes two strings as arguments and removes the characters from the first
string, which are present in the second string.
Example-1:
Input:
First String: "India is great"
Second String: “in"
Output: "da s great"*/import java.util.Scanner;
public class Q2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		String s1,s2;
		System.out.println("Enter First String:");
		s1=sc.nextLine();
		System.out.println("Enter Second String:");
		s2=sc.nextLine();
		String str[]=s2.split("");
		for(i=0;i<str.length;i++)
		{
			s1=s1.replaceAll(str[i].toLowerCase(),"");
			s1=s1.replaceAll(str[i].toUpperCase(),"");
		}
		System.out.println(s1.trim());
	}
}
