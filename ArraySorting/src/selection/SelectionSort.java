package selection;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		double list[] = {7, 5, 4, 9, 6, 3, 3};
//		 selecSort(list);
//		Arrays.fill(list, 0, 5, 2);
//		 System.exit(1);
//		for (double d : list) {
//			System.out.println(d);
//		}
		
		int x = smallestIndex(list);
		System.out.println(x);
	}

	public static void selecSort(double arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			double currentMin = arr[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (currentMin > arr[j]) {
					currentMin = arr[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				arr[currentMinIndex] = arr[i];
				arr[i] = currentMin;
			}
		}

	}

	public static int smallestIndex(double arr[]) {
		int currentIndex = 0;
		double currentMin = arr[0];
		for(int i = 0;i<arr.length-1;i++) {
			if(currentMin>=arr[i+1]) {
				currentMin = arr[i+1];
				currentIndex = i+1;
			}
		} 
		
		return currentIndex;
	}
}
