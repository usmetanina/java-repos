import java.math.BigDecimal;
public class step6 {
	public static void main(String[] args)
	{
		float summa = 500; // 500 ���. �� �����
		float per = 0.00000001f; // 0.000001% ����������
		
		float tmpSumma=0;
		float tmpRise=0;
		float compens=0;
		float rise=summa*per;
		
		// ������� �������� �� ���
		for(int i = 1; i <= 12; i++)
		{
			tmpRise=rise+compens;
			tmpSumma=summa+tmpRise;
			compens=(summa-tmpSumma)+tmpRise;
			summa += tmpRise;
		}
		System.out.println("����� �� ����� ����� ��� � ����� float: " + summa);
		
		BigDecimal sum = new BigDecimal(500.00000000f); // 500 ���. �� �����
		BigDecimal percent = new BigDecimal(0.00000001f); // 0.000001% ����������
		for(int i = 1; i <= 12; i++)
		{
			sum=sum.add(sum.multiply(percent));
		}
		System.out.println("����� �� ����� ����� ��� � ����� BigDecimal: " + sum.setScale(20,BigDecimal.ROUND_HALF_UP));
	}
}
