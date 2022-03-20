import java.util.*;

// O(n) time | O(1) space
class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int tempArray = 0;
		int tempSequence = 0;
		
		while(tempArray < array.size() && tempSequence < sequence.size()){
			 if(array.get(tempArray).equals(sequence.get(tempSequence))){
				  tempSequence++;
			 } 
			 tempArray++;
		}
		
	
    return tempSequence == sequence.size();
  }
}
