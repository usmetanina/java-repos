import java.util.Scanner;
public class TextInterface {
	public static void main(String[] args)
	{
		int n=10;
		Input input=new Input();
		Output output=new Output();
		Polyline polyline=null;
		Scanner in = new Scanner(System.in);
		while (n!=5)
		{
		System.out.println("0. ������� �������");//creator
		System.out.println("1. ������ ����� �����");//input
		System.out.println("2. �������� ���������� � �������");//output
		System.out.println("3. ������ ����� �������");//output
		System.out.println("4. ��������� �������, ����������� � ������");//output
		System.out.println("5. �����");
		System.out.println("��� �����:");
		n=in.nextInt();
		if (n==0) polyline=new Polyline();
		if (polyline!=null)
		{
			if (n==1) input.inputPoint(polyline);
			if (n==3) output.outputLength(polyline);
			if (n==2) output.outputInfoCoord(polyline);
			if (n==4) output.outputTops(polyline);
		}
		}
	}
}
