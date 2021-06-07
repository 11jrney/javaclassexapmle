//inout the string and check whether the given string is palindrome or not
import java.util.*;
class TestPalindrome
{
	private String str;
	public void setString(String str)
	{
		
		this.str=str;
	}
	public boolean isPalindrome()
	{
		String rev="";
		for (int i=str.length()-1; i>=0; i--)
		{
			char ext=str.charAt(i);
			rev=rev+ext;
		}
		if(str.equalsIgnoreCase(rev))
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
}
class Demo9
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String sc=sc.nextLine();
		TestPalindrome tp=new TestPalindrome();
		tp.setString(st);
		if(tp.isPalindrome()==true)
		{
			System.out.println("The Input String Is palindrome");
		}
		else
		{
				System.out.println("The String IS Not Palindrome");
		}
	}
}