package chapter9;

public class TotalArea {
	public static void main(String[] args) {
		CircleWithPrivateDataFields[] circleArray;
		circleArray = createCircleArray();
		printCircleArray(circleArray);
	}
	
	//Creating object array
	public static CircleWithPrivateDataFields[] createCircleArray() {
		CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
		
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i] = new CircleWithPrivateDataFields(Math.random()*100);
		}
		return circleArray;
	}
	
	//printing radius and area
	public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for(int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].area());
		}
	}
}
