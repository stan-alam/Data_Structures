public class Example01 {



		public static void thisMethod( int n) {
			int i = 1;
		    int s = 1;

		    while( s <= n ) {
		    	i++;
		    	s = s + i;
		    	System.out.println("*");
		    }
		}

	public static void main( String[] args )
	{
		thisMethod();


	}

}