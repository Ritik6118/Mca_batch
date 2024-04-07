package Trees;

public class diameter_of_a_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);
        int sd=ht(root.left)+ht(root.right)+2;
        return Math.max(rd,Math.max(ld,sd));
    }
    public int ht(TreeNode root){
        if(root==null){
            return -1;
        }
        int lh=ht(root.left);
        int rh=ht(root.right);
        return Math.max(lh,rh)+1;
    }

}
