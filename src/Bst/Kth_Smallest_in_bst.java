package Bst;

public class Kth_Smallest_in_bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    int c=0;
	    public int kthSmallest(TreeNode root, int k) {
	        if(root==null){
	            return 0;
	        }
	        int a=kthSmallest(root.left,k);
	        c++;
	        if(c==k){
	            return root.val;
	        }
	        int b=kthSmallest(root.right,k);
	        return a+b;
	    }
	}

}
