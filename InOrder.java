/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) 
	{
		int a1 = ((int)(Math.random() * 10));
		int a2 = ((int)(Math.random() * 10));


		if(a1>=a2)
		{
			System.out.print(a1);

		}

		else
		{
			System.out.print(a1 + " " + a2);
		

		int a3 = ((int)(Math.random() * 10));
		if (a3>=a2)
		{
			System.out.print(" " + a3);
			a2=a3;
		}


		a3 = ((int)(Math.random() * 10));
		while (a3>=a2)
		{
			{
				System.out.print(" " + a3);
				a2=a3;
			}
			a3= ((int)(Math.random() * 10));
		}
		
	}
}
}

