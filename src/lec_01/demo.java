package lec_01;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(Math.max(a,Math.max(c,b)));
		
	}

}
