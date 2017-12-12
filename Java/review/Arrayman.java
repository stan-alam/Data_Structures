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

  //int[] A  = new int[]{2,3,4,5,6,6,6,7,9};
  am.deleteDuplicates(stanList);
 }

}