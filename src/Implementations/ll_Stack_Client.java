package Implementations;

public class ll_Stack_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_Using_Linked_List st= new Stack_Using_Linked_List();
		st.push(10);
		st.push(11);
		st.push(12);
		st.push(13);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		System.out.println("size== "+ st.size());
		
		
	}

}
