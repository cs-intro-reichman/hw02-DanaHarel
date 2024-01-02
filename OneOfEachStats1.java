/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 
{
	public static void main (String[] args) 
	{
		int T = Integer.parseInt(args[0]);
		int i = 0;
		double masterSum = 0;
		double avg = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;

	while (i< T)
	  {
	    int x1 = ((int)(Math.random()*2));
		int x2 = x1;
		double sum = 0;

		      while (x1==x2)
		      {
		      	x2= ((int)(Math.random()*2));
		      	sum ++;  	
		      }

		masterSum = (masterSum + sum);
		if (sum == 2)
			{f2++;}
		if (sum == 3)
			{f3++;}
		if (sum >= 4)
			{f4++;}

		i++;

		}
          avg = (masterSum/T);

          System.out.println("Average: " + avg + " children to get at least on of each gender.");
          System.out.println("Number of families with 2 children: " + f2);
          System.out.println("Number of families with 3 children: " + f3);
          System.out.println("Number of families with 4 or more children: " + f4);

          if((f2>f3)&&(f2>f4))
          	{System.out.println("The most common number of children is 2.");}

          if((f3>f2)&&(f3>f4))
          	{System.out.println("The most common number of children is 3.");}

          if((f4>f2)&&(f4>f3))
          	{System.out.println("The most common number of children is 4 or more.");}


		
	}
}
