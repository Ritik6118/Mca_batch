package HashMap;

import java.util.HashMap;

public class INtersection_of_two_arrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i:nums1){
            map.put(i,false);
        }
        int n=0;
        for(int i:nums2){
            if(map.containsKey(i) && map.get(i)==false){
                n++;
                map.put(i,true);
            }
        }
        int[] arr=new int[n];
        int idx=0;
        for(int i:map.keySet()){
            if(map.get(i)==true){
                arr[idx++]=i;
            }
        }
        return arr;
    }
}
