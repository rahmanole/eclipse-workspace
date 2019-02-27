package main;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		String url = "https://www.prothomalo.com/international/article/";
		try {
			ProthomAlo.postEtractor(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
