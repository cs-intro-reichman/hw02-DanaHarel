/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args)

	{
		String s = args[0];
		int l = s.length()-1;

		while ( l >= 0)
		{
			System.out.print(s.charAt(l));
			
			    l--;

		}

		int x = s.length();
		System.out.println("");

		if ((x%2)==0)
		{
			System.out.println("The middle character is " + s.charAt((x/2)-1));
		}
		
		else
		{
			System.out.println("The middle character is " + s.charAt((x-1)/2));
		}
	}
}