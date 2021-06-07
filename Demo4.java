import java.util.Scanner;
class Sum
{
	private float fn,sn;
	public void setData(float fn,float sn)
	{
	this.fn=fn;
	this.sn=sn;
	}
	public float getSum()
	{
	float res=fn+sn;
	return(res);
	}
}
public class Demo4
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		float x=sc.nextFloat();
		System.out.println("ENTER THE SECOND NUMBER");
		float y=sc.nextFloat();
		Sum z=new Sum();
		z.setData(x,y);
		float result=z.getSum();
		System.out.println("The sum of Two Number SI "+result);
	}
}