package recursion;

public class lexico_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		count(n,0);
	}

	private static void count(int n, int ans) {
		// TODO Auto-generated method stub
		if(ans>n) {
			return;
		}
		System.out.println(ans);
		for(int i=0;i<=9;i++) {
			if(ans==0) {
				i++;
			}
			count(n,(ans*10)+i);
		}
	}

}
