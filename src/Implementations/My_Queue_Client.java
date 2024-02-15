package Implementations;

public class My_Queue_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My_Queue q=new My_Queue(6);
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
		q.enque(6);
		System.out.println(q.peek());
		System.out.println(q.isFull());
		while(!q.isEmpty()) {
			System.out.println(q.deque());
		}
	}

}
