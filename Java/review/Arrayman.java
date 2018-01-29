import java.util.*;

public class Arrayman {

 public static int deleteDuplicates(List < Integer > A) {
  if (A.isEmpty()) {
   return 0;
  }

  int writeIndex = 1;
  for (int i = 1; i < A.size(); ++i) {
   if (!A.get(writeIndex - 1).equals(A.get(i))) {
    A.set(writeIndex++, A.get(i));
   }
  }
     return writeIndex;

 }

 public static void main(String args[]) {
  Arrayman am = new Arrayman();
  List < Integer > stanList = new ArrayList < Integer > ();

  stanList.add(1);
  stanList.add(2);
  stanList.add(2);
  stanList.add(4);
  stanList.add(5);
  stanList.add(6);
  stanList.add(7);
  stanList.add(8);
  stanList.add(9);

  int    retVal;

  //int[] A  = new int[]{2,3,4,5,6,6,6,7,9};  you have commented this line

   /*  Calling the method without object name, for you have
       define the method as "static"; when method is "static
      you can call it without object name.

   */



    retVal = deleteDuplicates(stanList); // As the method has data type "int", you should
                                        // call it, with an arrangement, so that it can collect
                                        // the returned value;  you need to provide an "integer variable"
                                        // to hold the value. Here returned value will be in "retVal"
    System.out.println("retVal =" +retVal);

    /* In the input, I put 2 two times, so it returns index = 8       */


 }

}
