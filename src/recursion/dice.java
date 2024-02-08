package recursion;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int d=3;
//		dice(d,"",n);
		dice(d,"");
	}
	
	private static void dice(int d, String s, int n) {
		// TODO Auto-generated method stub
		if(d<0){
			return;
		}
		if(d==0) {
			System.out.println(s);
			return;
		}
		for(int i=1;i<=n;i++) {
//			d-=i;
			dice(d-i,s+" "+i,n);
		}
	}

	private static void dice(int d, String s) {
		// TODO Auto-generated method stub
		if(d<0){
			return;
		}
		if(d==0) {
			System.out.println(s);
			return;
		}
		
		dice(d-1,s+" "+1);
		dice(d-2,s+" "+2);
		dice(d-3,s+" "+3);
	}

	

}
