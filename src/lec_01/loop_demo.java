package lec_01;

import java.util.Scanner;

public class loop_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>=1) {
//			sum+=n;
			sum=sum+n;
//			System.out.println(n);
			n--;
		}
		System.out.println(sum);
	}

}
