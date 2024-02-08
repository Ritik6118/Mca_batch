package Implementations;

public class Queue_Using_LinkedLIst_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_Using_LinkedList q=new Queue_Using_LinkedList();
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		while(!q.isEmpty()) {
			System.out.println(q.deque());
		}
		System.out.println("size==" + q.size());
		
		
	}

}
