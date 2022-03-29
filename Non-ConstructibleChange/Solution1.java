import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
		Arrays.sort(coins);
		int maximumSum = 0;
		for(int i=0; i<coins.length; i++){
			maximumSum +=coins[i];
		}
		int currentSum = 0;
		for(int sum=1; sum < maximumSum; sum++){
			currentSum = sum;
			for(int j=coins.length-1; j>=0; j--){
				 if(coins[j] <= currentSum) {
					 currentSum -= coins[j];
				 }
			   if(currentSum == 0){
					 break;
				 }
			}
			if(currentSum > 0){
				return sum;
			}
		}
		return maximumSum + 1;
  }
}
