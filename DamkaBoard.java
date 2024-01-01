/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		int i = 1;

		while (i<=n)
		{
			int j = 0;

			if((i%2)!=0)
			{
				while (j<n)
			{
				System.out.print("* ");
				j ++;
			}
			    System.out.println();
			    i++;

			}
			
			else
			{
				while (j<n)
			{
				System.out.print(" *");
				j ++;
			}
			    System.out.println();
			    i++;
			}

		}
		
	}
}
