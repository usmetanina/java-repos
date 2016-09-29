import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	
	public void outputLength(Polyline polyline)
	{
		System.out.println(polyline.calculationLength());
	}
	
	public void outputInfoCoord(Polyline polyline)
	{
		System.out.println(polyline);
	}
	
	public void outputTops(ArrayList<Point> points)
	{		
		for (int i=0;i<points.size();i++)
		{
			System.out.println("¬ведЄнна€ точка совпала с вершиной: "+points);
		}
	}
}
