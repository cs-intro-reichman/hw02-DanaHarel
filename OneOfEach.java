
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach 
{
	public static void main (String[] args) 
	{
		int x1 = ((int)(Math.random()*2));
		int x2 = x1;
		int sum = 1;
		String s = "";

		  if(x1==0)
		   {
			 s = ("g ");
		   }

		  if(x1==1)
		  {
			s = ("b ");
		  }

		      while (x1==x2)
		      {
		      	x2= ((int)(Math.random()*2));
		     	if(x2==0)
		        {
			     sum ++;
			     s = s + ("g ");
		        }

		        if(x2==1)
		        {
			     sum++;
			     s = s +("b ");
                }
		      }
		      
		      System.out.println(s);
              System.out.println("You made it... and now you have " + sum + " children");
		   
          }
          
        }


 