import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		double T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
        Random generator = new Random(seed);  
		
		int i = 0;
		double masterSum = 0;
		double avg = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;

	while (i< T)
	  {
	    int x1 = (generator.nextint(2));
		int x2 = x1;
		double sum = 1;

		      while (x1==x2)
		      {
		      	x2= (generator.nextint(2));
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
