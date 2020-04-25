package com.sumofprimenumbers;

import java.util.Scanner;

public class SeriesOfOddNum {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the Integer number");
		 Integer n = scan.nextInt();
		 
		 for (int i = 0; i < (n * 2); i++) {
			 
			 if (i % 2 != 0) {
				 System.out.println(i);
			}
			
		}
	}

}
