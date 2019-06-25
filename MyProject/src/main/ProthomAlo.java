package main;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProthomAlo {

	public void createPsot() throws IOException {
		String publisher = "prothomAlo";
		String newPaperUrl = "https://www.prothomalo.com";
		HashSet<String> postId = findPostIds();
		System.out.println("Number of posts:"+postId.size());

		for (String id : postId) {
			String completeArticleUrl = newPaperUrl + id;
			//Finding post category
			System.out.println("Category:"+findPostCat(id));
			System.out.println("Time:"+new Date());
			System.out.println(completeArticleUrl);
			
			Document document = Jsoup.connect(completeArticleUrl).get();
			Element body = document.body();
			

			// Finding header of the post
			Elements heading = body.getElementsByTag("h1");
			System.out.println("Heading:"+heading.text());

			// ---------end-------
			
			String postFeatureImgUrl = featureImgUrl(body);
			System.out.println("Feature Image:"+postFeatureImgUrl);
			
			
			System.out.println("Publisher:"+publisher);
			
			//This portion for article paras
			Elements articleParas = body.getElementsByTag("p");
			articleParas.outerHtml();

			System.out.println("------------end------------------");
			// break;

		}

	}
	
	//This for finding article body.It would be Map type
	public void psotBody(Elements articleParas) {
		String articleBody = "";
		for (int i = 1; i < articleParas.size() - 2; i++) {

			if(findImgUrlAndCaption(articleParas.get(i)).equals("")){
				articleBody += articleParas.get(i).text()+"newPara";
			}else {
				articleBody += findImgUrlAndCaption(articleParas.get(i))+"desc"+
						articleParas.get(i).text()+"newPara";
			}

		}
		System.out.println(articleBody);
	}
	//----------end-----------
	
	
	public String featureImgUrl(Element body) {
		Elements elements = body.getElementsByClass("col_in");
		String imgWithCaption = elements.select("img").first().attr("src");
		return imgWithCaption;
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
	private String findImgUrlAndCaption(Element articleParas) {
		HashMap<String, String> imgUrlAndCaptin = new HashMap<String, String>();
		Element imgTag = articleParas.select("img").first();
		if(imgTag != null) {
			return (imgTag.attr("src")+"--*--"+imgTag.attr("alt"));
		}else {
			return "";
		}
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
	
	private String findPostCat(String id) {
		
		return id.split("/")[1];
	}

}
