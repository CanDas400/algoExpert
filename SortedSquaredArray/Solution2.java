import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
		int startIdx = 0;
		int endIdx = array.length - 1;
			
		int[] result = new int[array.length];	
			
		for(int i=array.length - 1; i>=0; i--)	{
			  int startElement = array[startIdx];
			  int endElement = array[endIdx];
			  if(Math.abs(startElement) > Math.abs(endElement)){
					 result[i] = startElement * startElement;
					 startIdx++;
				} else{
					  result[i] = endElement * endElement;
					  endIdx--;
				}
		}
		
    return result;
  }
}
