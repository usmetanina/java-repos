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
		System.out.println("0. Создать ломаную");//creator
		System.out.println("1. Ввести новые точки");//input
		System.out.println("2. Просмотр информации о ломаной");//output
		System.out.println("3. Узнать длину ломаной");//output
		System.out.println("4. Запросить вершины, совпадающие с точкой");//output
		System.out.println("5. Выход");
		System.out.println("Ваш выбор:");
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
