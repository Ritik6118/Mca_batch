package Trees;

public class right_View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<Integer> li=new ArrayList<>();
    int mh=-1;
    public List<Integer> rightSideView(TreeNode root) {
        trav(root,0);
        return li;
    }
    public void trav(TreeNode root,int h){
        if(root==null){
            return;
        }
        if(h>mh){
            li.add(root.val);
            mh=h;
        }
        trav(root.right,h+1);
        trav(root.left,h+1);
    }

}
