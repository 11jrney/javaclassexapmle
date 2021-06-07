import java.util.Scanner;
class Rectangle
{
	private double length, breadth;
	public void setData(double length, double breadth)
	{
	this.length=length;
	this.breadth=breadth;
	}
	public double getArea()
	{
	return(length*breadth);
	}
}


class Demo2
 {
 public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth");
		double len=sc.nextDouble();
		double bre=sc.nextDouble();
		Rectangle r=new Rectangle();
		r.setData(len,bre);
		double res=r.getArea();
		System.out.println("Area ofRctangle ="+ res);
	}
}