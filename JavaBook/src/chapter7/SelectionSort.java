package chapter7;

public class SelectionSort {
	
	public static void main(String[] args) {
		String s1 = "AAEF";
		String s2 = "aaeg";
		System.out.println(s1.compareToIgnoreCase(s2));
		
	}
	
	public static void selectionSord(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			int curMinIndex = i;
			int curMinValue = arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				if(curMinValue > arr[j]) {
					curMinValue = arr[j];
					curMinIndex = j;
				}
			}
			
			if(curMinIndex != i) {
				arr[curMinIndex] = arr[i];
				arr[i] = curMinValue;
			}
		}
	}
}
