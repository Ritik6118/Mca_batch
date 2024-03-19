package Trees;

public class postOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 List<Integer> li=new ArrayList<>();
	    public List<Integer> postorderTraversal(TreeNode root) {
	        if(root == null){
	            List<Integer> li2=new ArrayList<>();
	            return  li2 ;
	        }
	        postorderTraversal(root.left);
	        // System.out.println(root.val);
	        postorderTraversal(root.right);
	        li.add(root.val);
	        return li;
	    }

}
