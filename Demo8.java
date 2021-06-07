import java.util.*;
class Demo8
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(); //123;
		int count_even=0;
		int count_odd=0;
		int sumeven=0;
		int sumodd=0;
		while(num!=0)
		{
			
			int ext=num%10;
			if(ext%2==0)
			{
				
				sumeven=sumeven+ext;
				count_even++;
			}
			else
			{
				sumodd=sumodd+ext;
				count_odd++;
			}
			num=num/10;
		}
		System.out.println("Total Sum of even digits="+sumeven);
		System.out.println("Total Sum of odd digits="+sumodd);
	}
}