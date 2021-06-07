class Quadratic
{
	private double a,b,c;
	public void setCoefficient (double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void showRoots()
	{
		//double desc=b*b-a*a*c;
		double desc=Math.pow(b,2)-4*a*c;
		double r1=(-b+Math.sqrt(desc))/(2*a);
		double r2=(-b+Math.sqrt(desc))/(2*a);
	if(desc==0)
	{
		System.out.println("Roots are real and equal");
		System.out.println("Root1="+String.format("%.2f",r1));
		System.out.println("Root2="+String.format("%.2f",r2));
	}
	else if(desc>0)
	{
		System.out.println("Roots are real and Distinct");
		System.out.println("Root1="+String.format("%.2f",r1));
		System.out.println("Root2="+String.format("%.2f",r2));
	}
	else
		{
			System.out.println("Roots are imaginary");
		}
	}
}
class Demo3
{
	public static void main(String[] args)
	{
		Quadratic q=new Quadratic();
		q.setCoefficient(4,5,7);
		q.showRoots();
	}
}