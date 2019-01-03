package chapter9;

/**
 * @author ccsl-pc
 *
 */
public class CircleWithPrivateDataFields {
	private double radius = 1;
	private static int numberOfObj = 0;
	
	public CircleWithPrivateDataFields() {
		numberOfObj++;
	}
	
	public CircleWithPrivateDataFields(double radius) {
		numberOfObj++;
		this.radius = radius; 
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static int getNumberOfObj() {
		return numberOfObj;
	}

	public static void setNumberOfObj(int numberOfObj) {
		CircleWithPrivateDataFields.numberOfObj = numberOfObj;
	} 
	
	
}
