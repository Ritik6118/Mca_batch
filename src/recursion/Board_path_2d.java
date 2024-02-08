package recursion;

public class Board_path_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dr=2;
		int dc=2;
		path(0,0,dr,dc,"");
	}

	private static void path(int cr, int cc, int dr, int dc, String ans) {
		// TODO Auto-generated method stub
		if(cr>dr||cc>dc) {
			return;
		}
		if(cr==dr&&cc==dc) {
			System.out.println(ans);
			return;
		}
		path(cr+1,cc,dr,dc,ans+"V");
		path(cr,cc+1,dr,dc,ans+"H");
		
	}

}
