package Bst;

public class Range_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    int sum=0;
	    public int rangeSumBST(TreeNode root, int low, int high) {
	        if(root==null){
	            return 0;
	        }
	        else if(root.val<=high && root.val>=low){
	            sum+=root.val;
	            rangeSumBST(root.right, low, high);
	            rangeSumBST(root.left, low, high);
	        }
	        else if(root.val<low){
	            rangeSumBST(root.right, low, high);
	        }
	        else if(root.val>high){
	            rangeSumBST(root.left, low, high);
	        }
	        return sum;
	    }
	}

}
