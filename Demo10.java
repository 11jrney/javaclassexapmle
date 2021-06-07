import java.util.*;
class Test
{
	private String str;
	public void SetString(String str)
	{
		this.str=str;
	}
}
class Demo10
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Full Name:");
		String str=sc.nextLine();
		Test t=new Test();
		t.SetString(str);
		int pos1=str.indexOf(" ");
		

		int pos2=str.lastIndexOf(" ");

		int pos3=str.length();
		String fn=str.substring(0,pos1);
		String mn=str.substring(pos1,pos2);
		String ln=str.substring(pos2,pos3);
		System.out.println("The First Name iS :"+fn);
		System.out.println("The Middle Name iS :"+mn);
		System.out.println("The Middle Name iS :"+ln);
	}
}