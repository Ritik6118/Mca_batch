package Trees;

public class inOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<Integer>ans=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        iot(root);
        return ans;
    }
    public void iot(TreeNode root){
        if(root==null){
            return;
        }
        iot(root.left);
        ans.add(root.val);
        iot(root.right);
    }

}
