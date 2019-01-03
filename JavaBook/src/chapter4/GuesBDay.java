package chapter4;

import java.util.Scanner;

public class GuesBDay {
	public static void main(String[] args) {
		String set1 = "1 3 5 7\n"+"9 11 13 15\n"+"17 19 21 23\n"+"25 27 29 31";
		String set2 = "2 3 6 7\n"+"10 11 14 15\n"+"18 19 22 23\n"+"26 27 30 31";
		String set3 = "4 5 6 7\n"+"12 13 14 15\n"+"20 21 22 23\n"+"28 29 30 31";
		String set4 = "8 9 10 11\n"+"12 13 14 15\n"+"24 25 26 27\n"+"28 29 30 31";
		String set5 = "16 17 18 19\n"+"20 21 22 23\n"+"24 25 26 27\n"+"28 29 30 31";
		
		Scanner sc = new Scanner(System.in);
		int day = 0;
		
		System.out.print("Is your birth day in this set??\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 if found and 1 if not\n");
		int ans = sc.nextInt();
		
		if(ans==1) {
			day+=1;
		}
		
		System.out.print("Is your birth day in this set??\n");
		System.out.print(set2);
		System.out.print("\nEnter 0 if found and 1 if not\n");
		ans = sc.nextInt();
		
		if(ans==1) {
			day+=2;
		}
		
		System.out.print("Is your birth day in this set??\n");
		System.out.print(set3);
		System.out.print("\nEnter 0 if found and 1 if not\n");
		 ans = sc.nextInt();
		
		if(ans==1) {
			day+=4;
		}
		
		System.out.print("Is your birth day in this set??\n");
		System.out.print(set4);
		System.out.print("\nEnter 0 if found and 1 if not\n");
		ans = sc.nextInt();
		
		if(ans==1) {
			day+=8;
		}
		
		System.out.print("Is your birth day in this set??\n");
		System.out.print(set5);
		System.out.print("\nEnter 0 if found and 1 if not\n");
		ans = sc.nextInt();
		
		if(ans==1) {
			day+=16;
		}
		System.out.println(day);
	}
}
