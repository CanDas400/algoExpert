import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
		for(int i=0; i< array.length; i++){
			 array[i] = array[i] * array[i];
		}
		Arrays.sort(array);
    // Write your code here.
    return array;
  }
}
