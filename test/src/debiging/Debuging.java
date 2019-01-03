package debiging;
import java.util.*;
public class Debuging {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		double sum = 0;
		double data = sc.nextDouble();
		while(data !=0) {
			sum+=data;
			data = sc.nextDouble();
		}
		
		System.exit(1);
		System.out.println(sum);
		
	}
}
 