package Priority_Queue;

public class Sort_Characters_By_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public String frequencySort(String s) {
	        HashMap<Character,Integer> map=new HashMap<>();
	        for(int i=0;i<s.length();i++){
	            Character ch=s.charAt(i);
	            if(map.containsKey(ch)){
	                map.put(ch,map.get(ch)+1);
	            }
	            else{
	                map.put(ch,1);
	            }
	        }
	        PriorityQueue<pair> pq=new PriorityQueue<>( new Comparator<pair>(){
	            @Override
	            public int compare(pair p1,pair p2){
	                return p2.freq-p1.freq;
	            }
	        });
	        for(char ch:map.keySet()){
	            pq.add(new pair(ch,map.get(ch)));
	        }
	        StringBuilder sb=new StringBuilder();
	        while(!pq.isEmpty()){
	            pair p=pq.poll();
	            while(p.freq!=0){
	                sb.append(p.ch);
	                p.freq-=1;
	            }
	        }
	        return sb.toString();
	    }
	}
	class pair{
	    char ch;
	    int freq;
	    pair(char c,int f){
	        ch=c;
	        freq=f;
	    }
	}
}
