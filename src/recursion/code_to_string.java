package recursion;

import java.util.ArrayList;

public class code_to_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12259;
		String s=""+n;
//		decode(s,"");
		ArrayList<String> li=new ArrayList<>();
		codes(s,"",li);
		System.out.println(li);
	}

	private static void codes(String s, String ans, ArrayList<String> li) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			li.add(ans);
			return;
		}
		codes(s.substring(1),ans+(char)(Integer.parseInt(s.substring(0,1))+'a'-1),li);
		if(s.length()>=2 && Integer.parseInt(s.substring(0,2))<=26) {
			codes(s.substring(2),ans+(char)(Integer.parseInt(s.substring(0,2))+'a'-1),li);
		}
	}

}
