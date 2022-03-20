import java.util.*;

// O(n) time | O(n) space
class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    List<Integer> result = new ArrayList<>();
		
    // Write your code here.
		for(int i=0; i<array.size(); i++){
			  if(sequence.contains(array.get(i)) 
					  && result.size() < sequence.size()){
					 result.add(array.get(i));
				}
		}
		
		if(result.equals(sequence)){
			 return true;
		}
		
    return false;
  }
}
