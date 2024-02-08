package lec_01;

import java.util.Scanner;

public class Grading_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=40) {
			System.out.println("pass");
			if(marks<=100 && marks>=90) {
				System.out.println("A+");
			}
			else if(marks<=89 && marks>=80) {
				System.out.println("A");
			}
			else if(marks<=79 && marks>=70) {
				System.out.println("B");
			}
			else if(marks<=69 && marks>=60) {
				System.out.println("C");
			}
			else if(marks<=59 && marks>=40) {
				System.out.println("D");
			}
		}
		else {
			System.out.println("fail");
		}
	}

}
