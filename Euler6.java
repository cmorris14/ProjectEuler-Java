public class Euler6
{
	public static void main(String[] args)
	{
		int x, y, n = 0;
		int a, b = 0, c;
		int d;
		
		for ( x = 0; x <= 100; x++ )
		{
			y = x * x;
			n = n + y;
		}
		
		System.out.println( "The sum of squares is " + n + "." );
		
		for ( a = 0; a <= 100; a++ )
		{
			b = b + a;
		}
		
		c = b * b;
		
		System.out.println( "The square of the sum is " + c + "." );
		
		d = c - n;
		
		System.out.println( "The difference is " + d + "." );
	}
}