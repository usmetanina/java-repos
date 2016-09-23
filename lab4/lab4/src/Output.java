import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	public void outputLength(Polyline polyline)
	{
		System.out.println(polyline.calculationLength());
		
	}
	
	public void outputInfoCoord(Polyline polyline)
	{
		System.out.println(polyline.readPolyline());
		
	}
	public void outputTops(Polyline polyline)
	{
		System.out.println("������� ���������� �����, � ������� ������ �������� ������� �������:");
		String str=null;
		
		Scanner in = new Scanner(System.in);
		str=in.nextLine();
		String[] coord = str.split(" ");
		
		Point point=new Point(Double.parseDouble(coord[0]),Double.parseDouble(coord[1]));
		ArrayList<Point> points=polyline.searchPoints(point);
		
		for (int i=0;i<points.size();i++)
		{
			System.out.println("�������� ����� ������� � ��������: "+points.get(i).readCoordinates());
		}
	}
}
