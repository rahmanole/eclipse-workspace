package lambda.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(28);
		l.add(54);
		l.add(21);
		
		Comparator<Integer> c = (l1,l2)->(l1>l2)?-1:(l1<l2)?1:0;
		Collections.sort(l,c);
		l.stream().forEach(System.out::println);
		
	}
}
