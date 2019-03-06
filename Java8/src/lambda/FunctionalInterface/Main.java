package lambda.FunctionalInterface;


/*
Functional Interface: which contains exactly one abstract method and can
contain one or more default or static method.
@FunctionalInterface annotation is used to explicitly specify a function interface 
*/
@FunctionalInterface //It is optional.If i declare one annotation then definitely i have to
//take one method
interface FI1{
	void m1();
}

interface FI2{
	void add(int a,int b);
}

public class Main {
	public static void main(String[] args) {
		//without taking implementation class directly we can implement interface methods
		//java8 
		
		FI1 i = ()->System.out.println("Hey this is java 8 FI");
		i.m1();
		
		FI2 i2 = (a,b)->System.out.println("The sum of a and b is:"+(a+b));
		i2.add(10,20);
		i2.add(30,40);
		
		//We can use lambda expression only for FI
	}
}
