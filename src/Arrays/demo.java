package Arrays;

import java.util.Arrays;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		swap(arr[0],arr[1]);
		System.out.println(Arrays.toString(arr));
		swap(0,1,arr);
		System.out.println(Arrays.toString(arr));
		int [] arr2=arr;
		
	}

	private static void swap(int i, int j, int[] arr) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp=i;
		i=j;
		j=temp;
	}

}
