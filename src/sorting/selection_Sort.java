package sorting;

import java.util.Arrays;

public class selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,3,5,6,7,1,2,3,8,9};
		for(int i=0;i<arr.length;i++) {
			int idx=min(arr,i);
			swap(arr,i,idx);
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int idx) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[idx];
		arr[idx]=temp;
	}

	private static int min(int[] arr, int i) {
		// TODO Auto-generated method stub
		int minidx=i;
		int min=arr[i];
		for(;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				minidx=i;
			}
		}
		return minidx;
	}

}
