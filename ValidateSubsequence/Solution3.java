import java.util.*;

// O(n) time | O(1) space
class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int idxSeq = 0;
		
		for(var entry : array){
			 if(idxSeq == sequence.size()){
				   break;
			 }
			 if(entry.equals(sequence.get(idxSeq))){
				  idxSeq++;
			 } 
		}
		
    return idxSeq == sequence.size();
  }
}
