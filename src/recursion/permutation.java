package recursion;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abca";
		perm(s,"");
	}

	private static void perm(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
		}
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			String l=s.substring(0,i);
			String r=s.substring(i+1);
			perm(l+r,ans+ch);				
		}
	}

}
