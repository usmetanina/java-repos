import java.lang.Math;
public class Point {
	private double x,y;
	
	Point()
	{
		this(0,0);
	}
	
	Point(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	
	public void setCoordinates(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void setX(double x)
	{
		this.x=x;
	}
	
	public void setY(double y)
	{
		this.y=y;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public void getCoordinates(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public String readCoordinates()
	{
		return '('+Double.toString(x)+';'+Double.toString(y)+')';
	}
	
	public void movement(Point point)
	{
		this.x=point.x;
		this.y=point.y;
	}
	
	public void distance()
	{
		Point point=new Point();
		distance(point);
	}
	public double distance(Point point)
	{
		return Math.sqrt((point.x-this.x)*(point.x-this.x)+(point.y-this.y)*(point.y-this.y));
	}
	public boolean compare(Point point)
	{
		if ((this.x==point.x)&&(this.y==point.y)) return true;
		else return false;
	}
}

