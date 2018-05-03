// compute the summer of the array

public class SumArray {

 	public static void main( String[] args)
 	{
 		int[] array = { 10, 20, 30, 40, 50 };
 		int total = 0;

 		// now add each element's value to the total

 		for ( int counter = 0; counter < array.length; counter++ )
 			total += array[counter];

 		System.out.printf("Total of array elements: %d%n", total);
 	}
}
