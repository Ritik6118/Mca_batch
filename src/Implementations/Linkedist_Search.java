package Implementations;

import Implementations.Linked_List.Node;

public class Linkedist_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List ll=new Linked_List();
		ll.Add_Last(9);
		ll.Add_Last(3);
		ll.Add_Last(5);
		ll.Add_Last(4);
		ll.Add_Last(0);
		System.out.println(ll);
		int t=4;
		System.out.println(search(ll.head,-1));
		System.out.println(recsrc(ll.head,-1));
		
	}

	private static boolean recsrc(Node head, int i) {
		// TODO Auto-generated method stub
		if(head==null) {
			return false;
		}
		else if(head.data==i) {
			return true;
		}
		return recsrc(head.next,i);
	}

	private static boolean search(Node head, int target) {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null) {
			if(temp.data==target) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	

}
