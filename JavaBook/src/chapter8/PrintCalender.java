package chapter8;

public class PrintCalender {
	public static void main(String[] args) {
		
	}
	
	public void printCalendar(int month,int year) {
		printMonthTitle(month, year);
	}
	
	//Printing name of a month
	public static void printMonthTitle(int month,int year) {
		System.out.println("      "+getMonthName(month)+" "+year+"      ");
		System.out.println("------------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");
	}
	
	//Find the name of the month
	public static String getMonthName(int month) {
		String monthName = "";
		switch(month) {
			case 1: monthName = "January";break;
			case 2: monthName = "February";break;
			case 3: monthName = "March";break;
			case 4: monthName = "April";break;
			case 5: monthName = "May";break;
			case 6: monthName = "June";break;
			case 7: monthName = "July";break;
			case 8: monthName = "August";break;
			case 9: monthName = "September";break;
			case 10: monthName = "October";break;
			case 11: monthName = "November";break;
			case 12: monthName = "December";break;
		}
		return monthName;
	}
	
	//Printing calendar body
	public static void printMonthBody(int month,int year) {
		//int startday = getstartDay(month,year);
	}
	
	//Find total number of days
	
	public static int totalNumberOfDays(int month,int year) {
		int total = 0;
		
		for(int i=1800;i<year;i++) {
			if(isLeapYear(year)) {
				
			}
		}
		
		return total;
	}
	
	//Count number of years
	public static int getNumberOfDayInMonth(int month,int year) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8|| month == 10 || month == 12 ) {
			return 31;
		}
		
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			return 31;
		}
		
		if(month == 2) {
			return isLeapYear(year)? 29:28;
		}
		
		return 0;
	}
	
	//Checking leapyear
	
	public static boolean isLeapYear(int year) {
		return ( year/400 == 0 || (year%4 == 0 && year%100!=0)); 
	}
	
	
	
}
