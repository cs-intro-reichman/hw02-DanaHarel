/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int i = 0;

		while (i<x)
		{
			int d = i+1;
			if (x%d == 0) 
			{
				System.out.println(i+1);
				i ++;
			}
			else 
				{ i++; }
		}

		
		
	}
}
