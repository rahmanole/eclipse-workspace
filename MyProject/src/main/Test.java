package main;

import java.io.IOException;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) throws IOException {

		long startTime = System.currentTimeMillis();
		ProthomAlo palo = new ProthomAlo();
		palo.createPsot();
		System.out.println(System.currentTimeMillis() - startTime);
		
//		for(String p:palo.findPostIds()) {
//			System.out.println(p);
//		}

	}
}
