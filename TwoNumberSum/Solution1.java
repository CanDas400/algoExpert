import java.util.*;

// O(n^2) time | O(1) space 
class Program {
	
  public static int[] twoNumberSum(int[] array, int targetSum) {
		for(int i=0; i<array.length-1; i++){
			for(int j=i+1; j<array.length; j++){
				  if(array[i] + array[j] == targetSum){
						  return new int[]{array[i],array[j]};
					}
			}
		}
		
		
    // Write your code here.
    return new int[0];
  }
}
