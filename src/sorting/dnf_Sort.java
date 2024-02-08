package sorting;

import java.util.Arrays;

public class dnf_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {0,0,1,1,1,1,2,2,2,2,0,0,0,2,2,2,1,1,1,1,0,0,0,0,2,2,1,1};
		int i=0;
		int j=0;
		int k=arr.length-1;
		while(i<=k) {
			if(arr[i]==0) {
				swap(arr,i,j);
				i++;
				j++;
			}
			else if(arr[i]==1) {
				i++;
			}
			else {
				swap(arr,k,i);
				k--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
