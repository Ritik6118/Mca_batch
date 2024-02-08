package recursion;

public class coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,5,10};
		int sum=3;
//		infinite(arr,sum,0,"");
//		finite(arr,sum,0,0,"");
		combinations(arr,sum,0,0,"");
	}

	

	private static void combinations(int[] arr, int sum, int amount, int idx, String ans) {
		// TODO Auto-generated method stub
		
		if(amount==sum) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<arr.length;i++) {
			if(amount + arr[i]<=sum) {
				combinations(arr,sum,amount+arr[i],i,ans+arr[i]+" ");
			}
		}
	}



	private static void finite(int[] arr, int sum, int amount, int idx,String ans) {
		// TODO Auto-generated method stub
		if(amount==sum) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<arr.length;i++) {
			if(amount + arr[i]<=sum) {
				finite(arr,sum,amount+arr[i],i+1,ans+arr[i]+" ");
			}
		}
	}

	private static void infinite(int[] arr, int sum, int amount,String ans) {
		// TODO Auto-generated method stub
		if(amount>sum) {
			return;
		}
		if(amount==sum) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(amount + arr[i]<=sum) {
				infinite(arr,sum,amount+arr[i],ans+arr[i]+" ");
			}
		}
	}

}
