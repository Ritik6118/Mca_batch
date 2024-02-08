package Implementations;

public class Dynamic_Array {
	private int[] arr;
	private int size;
	
	Dynamic_Array(){
		this.arr=new int[10];
		this.size=0;
	}
	Dynamic_Array(int n){
		this.arr=new int[n];
		this.size=0;
	}
	public void add(int n) {
		arr[size]=n;
		size++;
		if(size==arr.length) {
			grow();
		}
	}
	private void grow() {
		// TODO Auto-generated method stub
		int[] arr2=new int[arr.length*2];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		this.arr=arr2;
	}
	public void remove(int idx) {
		for(int i=idx;i<size-1;i++) {
			arr[i]=arr[i+1];
		}
		size--;
		if(size<=arr.length/4) {
			shrink();
		}
	}
	private void shrink() {
		// TODO Auto-generated method stub
		int[] arr2=new int[arr.length/2];
		for(int i=0;i<size;i++) {
			arr2[i]=arr[i];
		}
		this.arr=arr2;
	}
	public int size() {
		return this.size;
	}
	public void sort() {
		quickSort(arr,0,size-1);
	}
	private void quickSort(int[] arr, int lo, int hi) {
		// TODO Auto-generated method stub
		if(hi<=lo) {
			return;
		}
		int idx=partition(arr,lo,hi);
		quickSort(arr,lo,idx-1);
		quickSort(arr,idx+1,hi);
	}

	private int partition(int[] arr, int lo, int hi) {
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

	private void swap(int[] arr, int idx, int i) {
		// TODO Auto-generated method stub
		int temp=arr[idx];
		arr[idx]=arr[i];
		arr[i]=temp;
	}
	@Override
	public String toString() {
		String s="";
		for(int i=0;i<size;i++) {
			s+=arr[i]+" ";
		}
		return s;
	}
}
