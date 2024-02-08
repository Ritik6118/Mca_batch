package sorting;

import java.util.Arrays;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,5,6,7,1,2,3,8,9};
		arr=mergesort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] mergesort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		
		if(lo==hi) {
			int [] ans=new int[1];
			ans[0]=arr[lo];
			return ans;
		}
		int mid=(lo+hi)/2;
		int[] arr1=mergesort(arr,lo,mid);
		int[] arr2=mergesort(arr,mid+1,hi);
		
		return merge(arr1,arr2);
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] ans=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k++]=arr1[i++];
			}
			else {
				ans[k++]=arr2[j++];
			}
		}
		while(i<arr1.length) {
			ans[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			ans[k++]=arr2[j++];
		}
		return ans;
	}

}
