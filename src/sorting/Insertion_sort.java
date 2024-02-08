package sorting;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,5,6,7,1,2,3,8,9};
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int val=arr[i];
			while(j>=0 && val<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=val;
		}
		System.out.println(Arrays.toString(arr));
	}

}
