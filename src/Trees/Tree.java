package Trees;
import java.util.*;

import Trees.Tree.TreeNode;

public class Tree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){
			
		}
		TreeNode(int n){
			this.val=n;
		}
	}
	TreeNode root;
	public void input() {
		this.root=CreateTree();
	}
	Scanner sc=new Scanner(System.in);
	private TreeNode CreateTree() {
		int n=sc.nextInt();
		TreeNode nn=new TreeNode(n);
		boolean hlc=sc.nextBoolean();
		if(hlc) {
			nn.left=CreateTree();
		}
		boolean hrc=sc.nextBoolean();
		if(hrc) {
			nn.right=CreateTree();
		}
		System.out.print(nn.val+" --");
		return nn;
	}
	public void preorder(TreeNode n){
        if(n==null){
            return;
        }
        System.out.println(n.val);
        preorder(n.left);
        preorder(n.right);
    }
	
}
