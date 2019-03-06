package lamba.functions;

public class FunctionDemo {
	//e.g:1
	public static void m1() {
		System.out.println("Hello");
	}
	/*
	 above is equivalent to
	()->System.out.println("Hello");
	if function contains single line then we can avoid curly braces.	
	*/
	
	//e.g:2
	public static void m2(int a,int b) {
		System.out.println(a+b);
	}
	/*
	 above is equivalent to
	(a,b)->System.out.println(a+b);
	*/
	
	//e.g:3
	public static int m3(int n) {
		return n*n;
	}
	
	/*
	 above is equivalent to
	 we can remove return statment.
	(int n)->n*n;
	or
	if we use return statement then definitely we have to use curly braces
	(int n)->{return n*n;}
	
	or
	if compiler can guess the data type then we can remove the data type also
	(n)->n*n;
	
	or
	if there is one parameter then we can remove parenthesis of param list
	n->n*n
	*/
	
	//e.g:4
	public int m4(String s) {
		return s.length();
	}
	
	/*
	 so above is equivalent to
	 s->s.lenght();

	*/
	
	

	
	
	
	
	
	
	
	
	
}
