import java.util.*;
class Demo7
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(); //123;
		int count_even=0;
		int count_odd=0;
		while(num!=0)
		{
			int ext=num%10;
			if(ext%2==0)
			{
				count_even++;
			}
			else
			{
				count_odd++;
			}
			num=num/10;
		}
		System.out.println("Total odd digits="+count_odd);
		System.out.println("Total even digits="+count_even);
	}
}