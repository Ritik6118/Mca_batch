package Implementations;

public class d_array_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Array li=new Dynamic_Array (5);
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
		li.sort();
		li.remove(99);
//		try {
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(li.size());
		System.out.println(li);
		
	}

}
