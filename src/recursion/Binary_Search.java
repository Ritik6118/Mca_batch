package recursion;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,8,10};
		
//		System.out.println(bin(arr,7));
		System.out.println(recbin(arr,0,arr.length-1,1));
		
	}

	private static int recbin(int[] arr, int lo, int hi, int t) {
		// TODO Auto-generated method stub
		if(lo>hi) {
			return -1;
		}
		int mid=(lo+hi)/2;
		if(arr[mid]==t) {
			return mid;
		}
		if(arr[mid]<t) {
			return recbin(arr,mid+1,hi,t);
		}
		else {
			return recbin(arr,lo,mid-1,t);
		}
	}

	private static int bin(int[] arr, int t) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==t) {
				return mid;
			}
			else if(arr[mid]<t) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return -1;
	}

}
