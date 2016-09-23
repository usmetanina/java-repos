import java.util.Scanner;

public class Input {
	
	public void inputPoint(Polyline polyline)
	{
		int n;
		System.out.println("�������� ���-�� �����? 1-��, 2-���!");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		if (n==1)
		{
			System.out.println("������� ���-�� �����:");
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
				System.out.println("������� stop, ���� ����������, ����� ������� ����������� �����");
				
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
				System.out.println("������� ����������� "+i+"�� �����");
				str=in.nextLine();
				String[] coord=str.split(" ");
				if (coord.length>1) polyline.addPoint(new Point(Double.parseDouble(coord[0]),Double.parseDouble(coord[1])));
			}
		}
	}
}
