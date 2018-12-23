package chapter_8;
import java.util.*;

import javax.swing.text.html.MinimalHTMLWriter;

public class NearestDistance {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter number of points:");
		int m = sc.nextInt();
		int n = 2;
		int[][] points = new int[m][n];
		insertPoints(points);
		//printPoints(points);
		
		double distance = findNearestDistance(points);
		System.out.println(distance);
	}
	
	public static void insertPoints(int[][] arr) {		
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter value of x"+ (i+1) +":" );
			arr[i][0] = sc.nextInt();
			System.out.print("Enter value of y"+ (i+1)+":" );
			arr[i][1] = sc.nextInt();
		}
	}
	
	public static void printPoints(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("X:"+arr[i][0]+" Y:"+arr[i][1]);
		}
	}
	
	//For distance
	public static double distance(int x1,int y1,int x2,int y2) {
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
	
	static int p1 = 0;
	static int p2 = 1;
	
	//for finding nearest distance
	public static double findNearestDistance(int[][] arr) {
		double minDist = distance(arr[p1][0],arr[p1][1],arr[p2][0],arr[p2][1]);
		//System.out.println(minDist);
		double dist = 0;
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				dist = distance(arr[i][0],arr[i][1],arr[j][0],arr[j][1]);
				//System.out.println(minDist);
				if(minDist>dist) {
					minDist = dist;
					p1 = i;
					p2 = j;
					// System.out.println(minDist);
				}
			}
		}
		return minDist;
	}
}
