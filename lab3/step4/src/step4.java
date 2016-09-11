
import java.util.Scanner;

public class step4 {
	public static void main (String[] args)
	{
		int parametr; //����������� ����� ������ ����� �������
		System.out.println("������� �������� ���������: ");
		Scanner in = new Scanner(System.in);
		parametr=in.nextInt();
		
		float a = 0.3f;
		float b = 0.4f;
		float sum = a + b;
		float c = 0.7f;
		
		System.out.println(compare(sum,c,parametr));//true
		System.out.println(compare(sum,a,parametr));//false
		
		System.out.println(compare(Float.NEGATIVE_INFINITY,Float.NEGATIVE_INFINITY,parametr));//true
		System.out.println(compare(Float.POSITIVE_INFINITY,Float.NEGATIVE_INFINITY,parametr));//false
		System.out.println(compare(sum,Float.NEGATIVE_INFINITY,parametr));//false
		System.out.println(compare(Float.NaN,Float.NEGATIVE_INFINITY,parametr));//false
		
		System.out.println(compare(Float.NaN,Float.NaN,parametr));//true
		System.out.println(compare(c,Float.NaN,parametr));//false
		System.out.println(compare(0.0f/0.0f,Float.NaN,parametr));//true
	}

	public static boolean compare(float firstVal,float secondVal,int parametr)
	{
		float fV=(float)(Math.round(firstVal * Math.pow(10, parametr)) / Math.pow(10, parametr));
		float sV=(float)(Math.round(secondVal * Math.pow(10, parametr)) / Math.pow(10, parametr));

		return fV == sV;
	}
	
}
