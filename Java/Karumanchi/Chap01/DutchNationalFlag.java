// dutch national flag problem using the Russian flag

public class DutchNationalFlag {

	public static void main( String[] args )
  	{

		public static enum Color { RED, WHITE, BLUE }

			public static void dutchFlagPartition( int pivotIndex, List<Color> A) {
				Color pivot = A.get(pivotIndex);
				// First pass: group elements smaller than pivot.
				for ( int = 0; i < A.size(); ++i ) {
					// look for the smaller element
					for ( int j = i + 1; < A.size(); ++j ) {
						if (A.get(j).ordinal() < pivot.ordinal()) {
							Collections.swap( A, i, j );
						}

					}
				}
				// Second pass: group elements larger than pivot
				for ( int i = A.size() - 1; i >= 0 )


			}


	}

}