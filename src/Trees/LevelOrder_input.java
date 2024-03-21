package Trees;
import java.util.*;

import Trees.Tree.TreeNode;

public class LevelOrder_input {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(){
			
		}
		TreeNode(int n){
			this.val=n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root;
		Queue<TreeNode> q=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==-1) {
			root=null;
			return;
		}
		TreeNode tn=new TreeNode(n);
		q.add(tn);
		root=tn;
		while(!q.isEmpty()) {
			TreeNode node=q.poll();
			int left=sc.nextInt();
			if(left!=-1) {
				node.left=new TreeNode(left);
				q.add(node.left);
			}
			int right=sc.nextInt();
			if(right!=-1) {
				node.right=new TreeNode(right);
				q.add(node.right);
			}
		}
		preorder(root);
		
	}
	public static void preorder(TreeNode n){
        if(n==null){
            return;
        }
        System.out.println(n.val);
        preorder(n.left);
        preorder(n.right);
    }

}
//5 4 4 3 -1 3 3 -1 -1 2 -1 -1 -1 -1 -1