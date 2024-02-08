package Implementations;

public class LinkedList_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List ll=new Linked_List();
		ll.Add_First(0);
		ll.Add_First(5);
		ll.Add_Last(99);
		ll.remove_Last();
		ll.remove_Last();
		ll.remove_Last();
//		ll.remove_Last();
//		ll.remove_Last();
//		ll.remove_Last();
		System.out.println(ll);
		
	}

}
