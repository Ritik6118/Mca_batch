package Implementations;

public class My_Queue {
	private int[] arr;
	private int size;
	private int front;
	My_Queue() {
		this.arr = new int[10];
	}
	My_Queue(int n) {
		this.arr = new int[n];
	}
	public void enque(int n) {
		int idx=size+front;
		idx%=arr.length;
		arr[idx]=n;
		size++;
	}
	public int deque() {
		int val=arr[front];
		front++;
		front%=arr.length;
		size--;
		return val;
	}
	public int peek() {
		return arr[front];
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public boolean isEmpty() {
		return size==0;
	}
	@Override
	public String toString() {
		int idx=front;
		String s="";
		for (int i = 0; i < size; i++) {
			s+=arr[idx]+" ";
			idx++;
			idx%=arr.length;
		}
		return s;
	}
}
