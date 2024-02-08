package Implementations;

import java.util.Stack;

public class My_Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		My_Stack st=new My_Stack();
		st.push(1);
//		System.out.println(st.pop());
//		st.peek();
		st.push(1);
		st.push(1);
		st.push(1);
		st.push(1);
		System.out.println(st);
		Stack<Integer> stc=new Stack<>();
	}

}
