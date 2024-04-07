package Bst;

public class Insert_Into_Bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public TreeNode insertIntoBST(TreeNode root, int val) {
	        if(root==null){
	            return new TreeNode(val);
	        }
	        if(root.val>val){
	            root.left= insertIntoBST(root.left,val);
	        }
	        if(root.val<val){
	            root.right= insertIntoBST(root.right,val);
	        }
	        return root;
	    }
	}

}
