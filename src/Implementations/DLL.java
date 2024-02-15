package Implementations;

public class DLL {
	Node head;
	Node tail;
	int size;
	
	public void addFirst(int n) {
		Node nn=new Node(n);
		if(size==0) {
			head=nn;
			tail=nn;
		}
		else {
			head.prev=nn;
			nn.next=head;
			head=nn;
		}
		size++;
	}
	public void addLast(int n) {
		Node nn=new Node(n);
		if(size==0) {
			addFirst(n);
		}
		else {
			tail.next=nn;
			nn.prev=tail;
			tail=nn;
		}
		size++;
	}
	public void AddAtIndex(int idx,int n) {
		if(idx==0) {
			addFirst(n);
		}
		if(idx==size) {
			addLast(n);
		}
		Node nn=new Node(n);
		Node temp=getNode(idx);
		Node prev=temp.prev;
		prev.next=nn;
		nn.prev=prev;
		nn.next=temp;
		temp.prev=nn;
		size++;
	}
	public int removeFirst() {
		Node temp=head;
		head=head.next;
		head.prev=null;
		temp.next=null;
		return temp.data;
	}
	public int removeLast() {
		Node temp=tail;
		tail=tail.prev;
		temp.prev=null;
		tail.next=null;
		return temp.data;
		
	}
	public int removeAtIndex(int idx) {
		if(idx==0) {
			return removeFirst();
		}
		else if(idx==size-1) {
			return removeLast();
		}
		else {
			Node temp=getNode(idx);
			Node pv=temp.prev;
			Node nx=temp.next;
			pv.next=nx;
			nx.prev=pv;
			temp.next=null;
			temp.prev=null;
			return temp.data;
		}
	}
	
	
	private Node getNode(int idx) {
		// TODO Auto-generated method stub
		Node temp=head;
		while(idx-->1) {
			temp=temp.next;
		}
		return temp;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -->");
			temp=temp.next;
		}
		System.out.println(".");
	}
	class Node {
		Node prev;
		int data;
		Node next;
		Node(int n){
			this.data=n;
		}
	}
	

}
