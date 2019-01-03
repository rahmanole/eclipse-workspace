package chapter7;

public class ArrayShuffling {
	public static void main(String[] args) {
		int arr[] = {25,26,27,28,29,30,31,32,33,34};
//		int[] arr1 = arr;
		shuffleArray(arr);
		for(int i:arr) {
			System.out.println(i);
		}
		
//		for(int i:arr1) {

		
//			System.out.println(i);
//		}
		
		int x = 2;
		int y = x;
		x = 3;
		System.out.println(x+" "+y);
		
	}
	
	public static int[] shuffleArray(int[] arr) {
		int arrSize = arr.length;
		int index = (int)(Math.random()*arrSize);
		int indexForValue = (int)(Math.random()*arrSize);
		int temp = arr[index];
		arr[index] = arr[indexForValue];
		arr[indexForValue] = temp;
		return arr;
	}
}
