package main;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProthomAlo {

	public static void postEtractor(String url) throws IOException {
		
		Document document = Jsoup.connect(url).get();
		Element body = document.body();
		
		Elements posts = body.getElementsByTag("each");
		//Elements postUrls = posts.select("a[href]");
		//System.out.println("sdjfkjk");
		for(Element post:posts) {
			
			String imgSrc = post.attr("a[href]");
			System.out.println("sdjfkjk");
			
			Elements imageUrls = post.getElementsByClass("image");
			for(Element eachImgUrl:imageUrls) {
				System.out.println(imgSrc);
			}
			
		}
	}
}
