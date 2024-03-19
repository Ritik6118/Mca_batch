package Trees;

public class preOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<Integer> li=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return li;
    }
    public void preorder(TreeNode root){
        if(root==null){
            return;
        }
        li.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

}
