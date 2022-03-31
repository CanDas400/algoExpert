import java.util.*;

class Program {

	static int currentClosest;
	
  public static int findClosestValueInBst(BST tree, int target) {
		currentClosest = tree.value;
    findClosestValueInBst1(tree, target);
		return currentClosest;
  }
	
	public static void findClosestValueInBst1(BST tree, int target) {
		if(tree.value == target){
			 currentClosest = tree.value;
			 return;
		}
		if(Math.abs(target - tree.value) < Math.abs(target - currentClosest)){
			 currentClosest = tree.value;
		}
		
		if(tree.left !=null){
      findClosestValueInBst1(tree.left, target);
		}  
		if(tree.right !=null){
	    findClosestValueInBst1(tree.right, target);
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
