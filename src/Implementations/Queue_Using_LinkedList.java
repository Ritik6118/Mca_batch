package Implementations;

public class Queue_Using_LinkedList {
	private Linked_List ll;
	Queue_Using_LinkedList(){
		this.ll=new Linked_List();
	}
	public void enque(int n) {
		ll.Add_Last(n);
	}
	public int deque() {
		return ll.remove_First();
	}
	public int peek() {
		return ll.get_First();
	}
	public int size() {
		return ll.size;
	}
	public boolean isEmpty() {
		return ll.size==0;
	}
	
}

