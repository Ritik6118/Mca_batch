package Arrays;

public class binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(bin_src(arr,0));
	}

	private static int bin_src(int[] arr,int target) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;
	}

}
