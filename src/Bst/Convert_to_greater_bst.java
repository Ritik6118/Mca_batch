package Bst;

public class Convert_to_greater_bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    int sum=0;
	    public TreeNode convertBST(TreeNode root) {
	        if(root==null){
	            return null;
	        }
	        convertBST(root.right);
	        root.val=sum+root.val;
	        sum=root.val;
	        convertBST(root.left);
	        return root;
	    }
	}

}
