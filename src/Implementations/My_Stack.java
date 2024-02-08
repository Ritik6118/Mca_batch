package Implementations;

import java.util.ArrayList;

public class My_Stack {
//	private int[] arr;
	private ArrayList<Integer> arr;
	private int top;
	My_Stack(){
		this.arr=new ArrayList<>();
		this.top=0;
	}
	My_Stack(int n){
		this.arr=new ArrayList<>(n); 
		this.top=0;
	}
	public void push(int n) throws Exception  {
//		if(isFull()) {
//			throw new Exception ("Stack is Full");
//		}
		arr.add(n);
		top++;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception ("Stack is Empty");
		}
		top--;
		return arr.get(top);
	}
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception ("Stack is Empty");
		}
		return arr.get(top-1);
	}
	public boolean isEmpty() {
		return top==0;
	}
//	public boolean isFull() {
//		return top==arr.length;
//	}
	public int size() {
		return top;
	}
	
	@Override
	public String toString() {
		String s="";
		for( int i=0;i<top;i++) {
			s+=arr.get(i)+" ";
		}
		return s;
	}
}
