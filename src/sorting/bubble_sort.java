package sorting;

import java.util.Arrays;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,5,6,7,1,2,3,8,9};
		for(int pass=1;pass<arr.length;pass++) {
			for(int i=0;i<arr.length-pass;i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}

}
