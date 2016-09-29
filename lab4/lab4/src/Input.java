import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	
	public void inputPoints(Polyline polyline)
	{
		int n;
		System.out.println("»звестно кол-во точек? 1-да, 2-нет!");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		if (n==1)
		{
			System.out.println("¬ведите кол-во точек:");
			n=in.nextInt();
		}
		else 
		{
			n=0;
		}
		String str=null;
		str=in.nextLine();
		if (n==0)
		{
			while (true)
			{
				System.out.println("¬ведите stop, если достаточно, иначе введите кооординаты точки");
				
				str=in.nextLine();
				if (str.equals("stop")) break;
				String[] coord = str.split(" ");
				if (coord.length>1) polyline.addPoint(new Point(Double.parseDouble(coord[0]),Double.parseDouble(coord[1])));
			}
		}
		else 
		{
			for (int i=0;i<n;i++)
			{
				System.out.println("¬ведите кооординаты "+i+"ой точки");
				str=in.nextLine();
				String[] coord=str.split(" ");
				if (coord.length>1) polyline.addPoint(new Point(Double.parseDouble(coord[0]),Double.parseDouble(coord[1])));
			}
		}
	}
	
	ArrayList<Point> requestPoint(Polyline polyline)
	{
		System.out.println("¬ведите координаты точки, с которой хотите сравнить вершины ломаной:");
		String str=null;
		
		Scanner in = new Scanner(System.in);
		str=in.nextLine();
		String[] coord = str.split(" ");
		
		Point point=new Point(Double.parseDouble(coord[0]),Double.parseDouble(coord[1]));
		ArrayList<Point> points=polyline.searchPoints(point);
		return points;
	}
}
