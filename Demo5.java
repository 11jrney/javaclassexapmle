import java.util.*;
class Demo5
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(); //123
		int rev=0;
		int org=num;
		while(num!=0)
		{
			int ext=num%10;
			rev=rev*10+ext;
			num=num/10;
		}
		System.out.println("Reversed number"+rev);
		if(org==rev)
		{
				System.out.println("Enter number is Pallindrome ");

		}
		else
		{
			System.out.println("Given number is not Palindrome");
		}
	}
}