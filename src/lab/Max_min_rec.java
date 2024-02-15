package lab;

public class Max_min_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {70, 250, 50, 80, 140, 12, 14 };
		System.out.println(max(arr,0,arr[0]));
		System.out.println(min(arr,0,arr[0]));
	}

	private static int min(int[] arr, int i,int min) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return min;
		}
		return min(arr,i+1,Math.min(arr[i], min));
	}

	private static int max(int[] arr, int i, int max) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return max;
		}
		return max(arr,i+1,Math.max(arr[i], max));
	}
	

}
