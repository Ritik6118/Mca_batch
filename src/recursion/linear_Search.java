package recursion;

public class linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		search(arr,0,12);
	}

	private static void search(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i>=arr.length) {
			System.out.println(-1);
			return;
		}
		if(arr[i]==j) {
			System.out.println(i);
			return;
		}
		search(arr,i+1,j);
		
	}

}
