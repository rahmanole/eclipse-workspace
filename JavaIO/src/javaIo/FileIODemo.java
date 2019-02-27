package javaIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIODemo {
	public static void main(String[] args) {
		String str = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like";
		File file = new File("test.txt");
		try (FileOutputStream output = new FileOutputStream(file)) {

			byte[] contentsInBytes = str.getBytes();
			
			output.write(contentsInBytes);
			byte[] b = new byte[10];
			    
			FileInputStream input = new FileInputStream(file);
			int values = 0;
			//input.skip(20);
			//int available = input.available();
			input.read(b,3,5);
			for(byte by:b) {
				System.out.println(by);
			}
			
			while ((values = input.read()) != -1) {
				System.out.print((char) values);
				//System.out.print(input.available());
			}
			
			System.out.println(input.markSupported());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
