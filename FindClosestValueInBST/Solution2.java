import java.util.*;

class Program {

  public static int findClosestValueInBst(BST tree, int target) {
    return findClosestValueInBst(tree, target, tree.value);
  }
	
	public static int findClosestValueInBst(BST tree, int target, int currentClosest) {
		if(Math.abs(target - tree.value) < Math.abs(target - currentClosest)){
			 currentClosest = tree.value;
		}
		
		if(tree.value > target && tree.left !=null){
      return findClosestValueInBst(tree.left, target, currentClosest);
		} else if(tree.value < target && tree.right !=null){
	    return findClosestValueInBst(tree.right, target, currentClosest);
		} else {
			return currentClosest;
		}
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
