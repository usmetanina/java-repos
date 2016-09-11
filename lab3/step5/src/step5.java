
public class step5 {
	public static void main(String[] args)
	{
		float f1 = 0.0f/1.0f;
		float f2 = 0.0f/-1.0f;

		System.out.println(compare(f1,f2));//false
		System.out.println(compare(f1,0f));//true
	}

	public static boolean compare(float firstVal,float secondVal)
	{
		int i1 = Float.floatToIntBits(firstVal);
		int i2 = Float.floatToIntBits(secondVal);
		
		return i1 == i2;
	}
	
}
