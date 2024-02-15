package Implementations;

public class DLL_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL ll=new DLL();
		ll.addFirst(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.AddAtIndex(2, 8);
		ll.AddAtIndex(2, 9);
		ll.AddAtIndex(3, 10);
//		ll.removeFirst();
//		ll.removeLast();
//		ll.removeAtIndex(2);
		ll.display();
	}

}
