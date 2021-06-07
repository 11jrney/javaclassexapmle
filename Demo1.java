class Student
{
	private int roll;
	public void setRoll(int roll)
	{
	this.roll=roll;
	}
	public int getRoll()
	{
	return (roll);
	}
}
class Demo1
{
	public static void main(String [] args)
	{
	Student s=new Student();
	s.setRoll(5);
	int roll=s.getRoll();
	System.out.println("Roll number="+roll);
	}
}