import java.lang.Math;
public class Point extends Object {
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
	
	@Override
	public String toString()
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	/*@Override
	public boolean equals(Point point)
	{
		if ((this.x==point.x)&&(this.y==point.y)) return true;
		else return false;
	}*/
}

