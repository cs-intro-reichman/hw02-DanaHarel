/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		
			int i = 2;
			int x = 1;
			String s = ("1");
		

		while (i<n)
		{
			if((n%i) == 0)
			{
				s = (s + " + " + i);
				x = x + i;
			}

			i ++;
		}

		if((x==n)&&(n!=0)&&(n!=1))
		{
			System.out.print(n + " is a perfect number since " + n + " = " + s);

		}

		else
		{
			System.out.print(n + " is not a perfect number");
		}
		
	}
}
