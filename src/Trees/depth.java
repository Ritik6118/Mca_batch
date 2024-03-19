package Trees;

public class depth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxDepth(TreeNode root) {
        return depth(root,0);
    }
    public int depth(TreeNode root,int d){
        if(root==null){
            return d;
        }
        return Math.max(depth(root.left,d+1),depth(root.right,d+1));
    }

}
