public class Euler1
{
	public static void main(String[] args)
	{
		int n, x;
		
		x = 0;
		
		for ( n = 0; n < 1000; n++ )
		{
			if ( n % 3 == 0 )
			{
				x = x + n;
			}
			else if ( n % 5 == 0 )
			{
				x = x + n;
			}
			else
			{
				System.out.println("not a multiple of 3 or 5");
			}
		}
		
		System.out.println( "Sum is: " + x );
		
	}
}