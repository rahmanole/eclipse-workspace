package chapter6;

import java.util.Scanner;

public class PrintCalender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter year");
		int year = sc.nextInt();
		printMonth(month, year);
	}
	
	//print calendar
	
	//print name of the month
	public static void printMonth(int month,int year) {
		System.out.println("     "+getMonthName(month)+" "+year);
		System.out.println("--------------------------------");
		System.out.println(" Sun Mon Tue Wed Thur Fri Sat ");
		printDays(month, year);
	}
	
	//finding name of the month
	public static String getMonthName(int month) {
		String monthName = "";
		switch(month){
			case 1: monthName = "January";break;
			case 2: monthName = "February";break;
			case 3: monthName = "March";break;
			case 4: monthName = "April";break;
			case 5: monthName = "May";break;
			case 6: monthName = "June";break;
			case 7: monthName = "Jyly";break;
			case 8: monthName = "August";break;
			case 9: monthName = "September";break;
			case 10: monthName = "October";break;
			case 11: monthName = "November";break;
			case 12: monthName = "December";break;
		}
		
		return monthName;
	}
	
	//print full month
	public static void printDays(int month,int year) {
		int startDay = startDay(month, year);
		int daysInMonth = getDaysOfMonth(month, year);
		int i = 0;
		for(i=0;i<=startDay;i++) {
			System.out.print("   ");
		}
		for(i=1;i<=daysInMonth;i++) {
			System.out.printf("%4d",i);
			if((i+startDay)%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	//Find starting day
	public static int startDay(int month,int year) {
		final int FIRST_DAT_OF_1_1_1800 = 3;
		
		int totalNumberOfDays = getTotalDays(month, year);
		
		return (totalNumberOfDays+FIRST_DAT_OF_1_1_1800)%7;
		
	}
	
	public static int getTotalDays(int month,int year) {
		int totalDays = 0;
		
		for(int i=1800;i<year;i++) {
			if(isLeapYear(i)) {
				totalDays += 366;
			}else{
				totalDays +=365;
			}
		}
		
		for(int i=1;i<month;i++) {
			totalDays += getDaysOfMonth(i, year);
		}
		return totalDays;
	}
	
	//Find Days in months
	public static int getDaysOfMonth(int month,int year) {
		if(month==1 || month==3 || month==5 || 
				month==7 || month==8 || month==10 || month==12 ) {
			return 31;
		}
		if(month==4 || month==6 ||month==9 ||month==11) {
			return 30;
		}
		if(month==2) return isLeapYear(year)?29:28;
		
		return 0;
	}
	
	public static  boolean isLeapYear(int year) {
		return year%400==0 || (year%4==0 && year%100!=0);
	}
}









