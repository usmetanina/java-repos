import java.util.ArrayList;
public class Polyline {
	
	private ArrayList<Point> points=new ArrayList<Point>();
	
	public void addPoint(Point point)
	{
		points.add(point);
	}
	
	public Point getPoint(int index)
	{
		return points.get(index);
	}
	
	public double calculationLength()
	{
		double length=0;
		for (int i=0;i<points.size()-1;i++)
		{
			length=length+points.get(i).distance(points.get(i+1));
		}
		return length;
	}
	
	@Override
	public String toString()
	{
		String stringPolyline = points.get(0)+"-";
		for (int i=1;i<points.size();i++)
		{
			stringPolyline=stringPolyline+points.get(i)+"-";
		}
		return stringPolyline;
	}
	
	public ArrayList<Point> searchPoints(Point point)
	{
		ArrayList<Point> samePoint= new ArrayList<Point>();
		for (int i=0;i<points.size();i++)
		{
			if (points.get(i).equals(point)) //System.out.println("Совпала вершина с индексом:"+ i);
				samePoint.add(points.get(i));
		}
		return samePoint;
	}
}
