package sorting;

import java.util.Arrays;

public class lexico_smallest_permu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="deaabcaf";
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
		}
//		System.out.println(Arrays.toString(arr));
		String ans="";
		for(int i=0;i<arr.length;i++) {
			while(arr[i]>0) {
				ans+=(char)(i+'a');
				arr[i]--;
				
			}
		}
		System.out.println(ans);
	}

}
