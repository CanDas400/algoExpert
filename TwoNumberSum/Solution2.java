import java.util.*;

// O(n) time | O(n) space 
class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
		 Set<Integer> nums = new HashSet<>();
		 for(int num: array){
			   int expectedValue = targetSum - num;
			   if(nums.contains(expectedValue)){
					 return new int[]{expectedValue, num};
				 }else{
					 nums.add(num);
				 }
		 }

    // Write your code here.
    return new int[0];
  }
}
