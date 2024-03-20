package Trees;

import Trees.Tree.TreeNode;

public class TreeCLient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t=new Tree();
		t.input();
		System.out.println(t.root.val);
//		preorder(t.root);
		t.preorder(t.root);
		
	}
	public static void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

}
