package Bst;

public class Search_in_bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public TreeNode searchBST(TreeNode root, int val) {
	        if(root==null){
	            return null;
	        }
	        if(root.val==val){
	            return root;
	        }
	        TreeNode left=null;
	        TreeNode right=null;
	        if(root.val>val){
	            left=searchBST(root.left,val);
	        }
	        if(root.val<val){
	            right=searchBST(root.right,val);
	        }
	        if(left!=null){
	            return left;
	        }
	        return right;
	    }
	}

}
