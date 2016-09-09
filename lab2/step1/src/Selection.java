public class Selection {
	public static void main(String[] args)
	{
		String[] types=new String [args.length];
		long tmpLong;
		int tmpInt;
		short tmpShort;
		byte tmpByte;
		
		for (int i=0;i<args.length;i++)
		{
			try
			{
			tmpLong=Long.parseLong(args[i]);
			types[i]="long";
			
			tmpInt=Integer.parseInt(args[i]);
			types[i]="int";
			
			tmpShort=Short.parseShort(args[i]);
			types[i]="short";
			
			tmpByte=Byte.parseByte(args[i]);
			types[i]="byte";
			}
			catch (Exception e)
			{
			}
			System.out.println(args[i]+" - "+types[i]);
		}
	}
}
