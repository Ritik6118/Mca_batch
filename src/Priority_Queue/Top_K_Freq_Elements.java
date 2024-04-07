package Priority_Queue;

public class Top_K_Freq_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int[] topKFrequent(int[] arr, int k) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i=0;i<arr.length;i++){
	            if(map.containsKey(arr[i])){
	                map.put(arr[i],map.get(arr[i])+1);
	            }
	            else{
	                map.put(arr[i],1);
	            }
	        }
	        PriorityQueue<pair> q=new PriorityQueue<>(new Comparator<pair>() {

					@Override
					public int compare(pair o1, pair o2) {
						// TODO Auto-generated method stub
						return o2.freq-o1.freq;
					}
				});
	        for(int i: map.keySet()){
	            q.add(new pair(i,map.get(i)));
	        }
	        int[] ans=new int[k];
	        while(k-->0){
	            ans[k]=(q.poll().val);
	        }
	        return ans;
	        

	    }

	    class pair{
	        int val;
	        int freq;
	        pair(){};
	        pair(int a,int b){
	            this.val=a;
	            this.freq=b;
	        }
	    }
	}

}
