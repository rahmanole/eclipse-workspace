package javaIo;

import java.io.*;
import java.util.Scanner;

public class PWDemo {
	static int id;
	static String name;
	static int age;
	static String ss;
	public static void main(String[] args) {
		File inputFile = new File("test.txt");
		Scanner input;
		try {
			input = new Scanner(inputFile);

			while (input.hasNext()) {
				id = input.nextInt();
				System.out.println(id);
				input.nextLine();
				name = input.nextLine();
				System.out.println(name);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
