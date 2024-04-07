package Priority_Queue;

public class Kth_Largest_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        // for(int i: nums){
        //     pq.add(i);
        // }
        // while(k-->1){
        //     pq.poll();
        // }
        // return pq.poll();
        PriorityQueue<Integer> data = new PriorityQueue<>();

        for(int i : nums){
            data.add(i);
            if(data.size()>k)   data.poll();
        }
        return data.poll();
    }

}
