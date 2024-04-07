package Bst;

public class min_absolute_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    int min=999999;
	    TreeNode prev=new TreeNode(9999999);
	    public int getMinimumDifference(TreeNode root) {
	        if (root==null){
	            return 0;
	        }
	        getMinimumDifference(root.left);
	        min=Math.min(Math.abs(prev.val-root.val),min);
	        prev=root;
	        getMinimumDifference(root.right);
	        return min;
	    }

	}

}
