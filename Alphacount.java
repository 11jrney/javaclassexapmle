import java.util.*;
class Alphacount
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line:");
		String str=sc.nextLine();
		int count_vow=0,count_cons=0,
		count_digit=0,count_ws=0,count_other=0,count_word=0;
		for (int i=0;i<str.length();i++)
		{
			char ext=str.charAt(i); //this line extract each word from line
			if (Character.isDigit(ext))
			{
				count_digit++;
			}
			else if (Character.isLetter(ext))
			{
					//either vowel or cons
				if (ext=='a' || ext=='e' || ext=='i' || ext =='o' || ext=='u'|| 
				ext=='A' || ext=='E' || ext=='I' || ext =='O' || ext=='U')
				{
					count_vow++;
				}
				else{
					count_cons++;
				}
			}
			else if(Character.isSpaceChar(ext))
			{
				count_ws++;
			}
			else{
				count_other++;
			}
		}
		count_word=count_ws++;
		System.out.println("Total Digits="+count_digit);
		System.out.println("Total Vowel="+count_vow);
		System.out.println("Total Consonant="+count_cons);
		System.out.println("Total Space="+count_ws);
		System.out.println("Total other character="+count_other);
		System.out.println("Total Word="+count_word);
				
		}
}