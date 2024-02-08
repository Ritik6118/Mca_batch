package Implementations;

public class Linked_List {
	Node head;
	Node tail;
	int size;
	Linked_List(){
	}
	public void Add_First(int n){
		Node nn=new Node(n);
		if(size==0) {
			head=nn;
			tail=nn;
		}
		else {
			nn.next=head;
			head=nn;
		}
		size++;
	}
	public void Add_Last(int n) {
		if(size==0) {
			Add_First(n);
		}
		else {
			Node nn=new Node(n);
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	public void Add_At_Index(int n,int idx) {
		if(idx==0) {
			Add_First(n);
		}
		else if(idx==size) {
			Add_Last(n);
		}
		else {
			Node nn=new Node(n);
			Node prev=getNode(idx-1);
			Node nextNode=prev.next;
			prev.next=nn;
			nn.next=nextNode;
			size++;
		}
		
	}
	private Node getNode(int idx) {
		Node temp=head;
		for(int i=0;i<idx;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public int get_First() {
		return head.data;
	}
	public int get_Last() {
		return tail.data;
	}
	public int get_At_Index(int idx) {
		return getNode(idx).data;
	}
	public int remove_First() {
		Node temp=head;
		head=head.next;
		temp.next=null;
		size--;
		return temp.data;
	}
	public int remove_Last() {
		Node prev=getNode(size-2);
		Node temp=tail;
		tail=prev;
		prev.next=null;
		return temp.data;
	}
	public int remove_At_Index(int idx) {
		if(idx==0) {
			return remove_First();
		}
		if(idx==size-1) {
			return remove_Last();
		}
		Node prev=getNode(idx-1);
		Node temp=prev.next;
		Node next=temp.next;
		prev.next=next;
		temp.next=null;
		size--;
		return temp.data;
	}
	@Override
	public String toString() {
		String s="";
		Node temp=head;
		while(temp!=null) {
			s+=temp.data+"--> ";
			temp=temp.next;
		}
		s+='.';
		return s;
	}
	
	
	class Node{
		int data;
		Node next;
		Node(int n){
			this.data=n;
		}
		Node(){
			
		}
	}
}
