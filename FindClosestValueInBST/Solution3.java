import java.util.*;

class Program {

  public static int findClosestValueInBst(BST tree, int target) {
    return findClosestValueInBst(tree, target, tree.value);
  }
	
	public static int findClosestValueInBst(BST tree, int target, int currentClosest) {
		 BST currentNode = tree; 
		 while(currentNode !=null){
			  if(Math.abs(target - currentNode.value) < Math.abs(target - currentClosest)){
			 			currentClosest = currentNode.value;
				}
				if(target < currentNode.value){
           currentNode = currentNode.left;
				} else if(currentNode.value < target){
	          currentNode = currentNode.right;
				} else{
					break;
				}
		 }
		 return currentClosest;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
