package sorting;

import java.util.Arrays;

public class count_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,1,2,3,4,5,1,2,3,4,1,2,2,1,1,1,2,4,5};
//		given range in 1 to 6;
		int[] arr2= new int[7];
		for(int i=0;i<arr.length;i++) {
			arr2[arr[i]]++;
		}
		int idx=0;
		for(int i=0;i<arr2.length;i++) {
			while(arr2[i]>0) {
				arr[idx++]=i;
				arr2[i]--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
