public class Calc {
	public static void main(String[] args)
	{
		long firstNum=Long.parseLong(args[0]);
		long secondNum=Long.parseLong(args[2]);
		long answer=0;
		if (args[1].equals("+")) answer=firstNum+secondNum;
		if (args[1].equals("-")) answer=firstNum-secondNum;
		if (args[1].equals("*")) answer=firstNum*secondNum;
		if (args[1].equals("/")) answer=firstNum/secondNum;

		System.out.println(answer);
	}
}
