public class Translator {
	public static void main(String[] args)
	{
		System.out.println(args[0]+" ("+args[1]+')');
		double toTen=toTen(args[0].toCharArray(),Integer.parseInt(args[1]));
		System.out.println((int)toTen+" (10)");
		String fromTen=Integer.toString((int)toTen, Integer.parseInt(args[2]));
		System.out.println(fromTen+" ("+args[2]+')' );
	}
	
	private static double toTen(char[] number,int base) {
		double result=0;
		String digits="0123456789ABCDEF";
		for (int i=0;i< number.length;i++)
			{
			result=result+digits.indexOf(number[i])*Math.pow(base,number.length-1-i);
			}
		return (int)result;
	}
}
