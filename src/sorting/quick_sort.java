package sorting;

import java.util.Arrays;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {8,7,2,3,4,1,5,6,9};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if(hi<=lo) {
			return;
		}
		int idx=partition(arr,lo,hi);
		quickSort(arr,lo,idx-1);
		quickSort(arr,idx+1,hi);
	}

	private static int partition(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		int idx=lo;
		int pivot=arr[hi];
		for(int i=lo;i<=hi;i++) {
			if(arr[i]<pivot) {
				swap(arr,idx,i);
				idx++;
			}
		}
		swap(arr,idx,hi);
		return idx;
	}

	private static void swap(int[] arr, int idx, int i) {
		// TODO Auto-generated method stub
		int temp=arr[idx];
		arr[idx]=arr[i];
		arr[i]=temp;
	}

}
