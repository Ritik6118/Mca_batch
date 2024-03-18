package HashMap;

import java.util.HashSet;

public class Longest_consecutive_Sequence {
	public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int ans=0;
        for(int i: set){
            if(set.contains(i-1)==false){
                int c=0;
                int n=i;
                while(set.contains(n)){
                    c++;
                    n++;
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}
