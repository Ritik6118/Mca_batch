package Implementations;

public class Stack_Using_Linked_List {
	private Linked_List ll;
	Stack_Using_Linked_List(){
		ll=new Linked_List();
	}
	public void push(int n) {
		ll.Add_Last(n);
	}
	public int pop() {
		return ll.remove_Last();
	}
	public int peek() {
		return ll.get_Last();
	}
	public boolean isEmpty() {
		return ll.size==0;
	}
	public int size() {
		return ll.size;
	}
}
