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
class Demo6
{
	public static void main(String [] args)
	{
		TestPalindrome tp=new TestPalindrome();
		tp.setString("liril");
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