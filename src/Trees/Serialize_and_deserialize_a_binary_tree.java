package Trees;

public class Serialize_and_deserialize_a_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class Codec {
	    
	    StringBuilder sb=new StringBuilder();
	    // Encodes a tree to a single string.
	    // String s="";
	    public String serialize(TreeNode root) {
	        ser(root);
	        // System.out.println(s);
	        // return s;
	        return sb.toString();
	    }
	    public void ser(TreeNode root){
	        if(root==null){
	            return;
	        }
	        sb.append(root.val);
	        sb.append(" ");
	        // s+=root.val+" ";
	        if(root.left==null){
	            sb.append("false ");
	            // s+="false ";
	        }
	        else{
	            // s+="true ";
	            sb.append("true ");
	        }
	        ser(root.left);
	        if(root.right==null){
	            sb.append("false ");
	            // s+="false ";
	        }
	        else{
	            sb.append("true ");
	            // s+="true ";
	        }
	        ser(root.right);
	    }
	    // Decodes your encoded data to tree.
	    public TreeNode deserialize(String data) {
	        if(data.equals("")){
	            return null;
	        }
	        String [] arr=data.split(" ");
	        // System.out.println(data);
	        // System.out.println(Integer.parseInt(arr[0]));
	        // System.out.println(Boolean.parseBoolean(arr[1]));
	        return CreateTree(arr);
	    }
	    int i=0;
	    public TreeNode CreateTree(String [] arr){
	        TreeNode nn=new TreeNode(Integer.parseInt(arr[i++]));
	        // System.out.println(nn.val);
	        boolean hlc=Boolean.parseBoolean(arr[i++]);
	        // System.out.println(hlc);
	        if(hlc){
	            nn.left=CreateTree(arr);
	        }
	    
	        boolean hrc=Boolean.parseBoolean(arr[i++]);
	        // System.out.println(hrc);
	        if(hrc){
	            nn.right=CreateTree(arr);
	        }
	        return nn;
	    }
	}


}
