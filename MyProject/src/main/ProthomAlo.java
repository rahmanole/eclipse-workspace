package main;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProthomAlo {

	public void createPsot() throws IOException {
		String newPaperUrl = "https://www.prothomalo.com";
		HashSet<String> postId = findPostIds();
		System.out.println("Number of posts:"+postId.size());

		for (String id : postId) {
			String completeArticleUrl = newPaperUrl + id;
			Document document = Jsoup.connect(completeArticleUrl).get();
			Element body = document.body();
			System.out.println(completeArticleUrl);

			// Finding header of the post
			Elements heading = body.getElementsByTag("h1");
			System.out.println(heading.text());

			// ---------end-------

			Elements articleParas = body.getElementsByTag("p");
			articleParas.outerHtml();
			for (int i = 0; i < articleParas.size() - 2; i++) {

				findImgUrlAndCaption(articleParas.get(i));
				String articleBody = articleParas.get(i).text();
				System.out.println(articleBody);

			}

			System.out.println("------------end------------------");
			// break;

		}

	}

	// method for finding image url
	private String findImgUrl(Element articleParas) {
		String imgUrl = null;
		String caption = null;

		// start and end index for image url
		int startIndex = articleParas.outerHtml().indexOf("src=") + 5;
		int endIndex = articleParas.outerHtml().indexOf('>', startIndex) - 1;
		imgUrl = articleParas.outerHtml().substring(startIndex, endIndex);
		if (startIndex > 5) {
			//System.out.println(imgUrl);
			System.out.println(findImgUrlAndCaption(articleParas));
		}

		return imgUrl;
	}
	// ---------------end-----------
	
	//---------------Finding image caption--------
	private HashMap<String, String> findImgUrlAndCaption(Element articleParas) {
		HashMap<String, String> imgUrlAndCaptin = new HashMap<String, String>();
		Element imgTag = articleParas.select("img").first();
		if(imgTag != null) {
			imgUrlAndCaptin.put(imgTag.attr("src"), imgTag.attr("alt"));
			System.out.println(imgTag.attr("src"));
			System.out.println(imgTag.attr("alt"));
		}
		return imgUrlAndCaptin;
	}
	//----------------end--------------
	
	// method for finding artcile url
	public static HashSet<String> findPostIds() throws IOException {
		HashSet<String> postId = new HashSet<String>();
		Document document = Jsoup.connect("https://www.prothomalo.com/archive").get();
		Element body = document.body();
		
		Element posts = body.getElementById("widget_56292");
		Elements postUrls = posts.getElementsByTag("a");
		for (Element post : postUrls) {
			String link = post.attr("href");
			if (link.length() > 100)
				postId.add(link.substring(0, link.indexOf('%')));
		}

		return postId;
	}

}
