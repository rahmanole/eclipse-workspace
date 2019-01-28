package jsoupTest;

import java.io.IOException;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
	public static void main(String[] args) throws IOException {
		forProthomAlo();
		// forKalerKontho();
		// forJugantor();
	}

	// For prothom alo
	static void forProthomAlo() throws IOException {
		TreeSet<String> linksSet = new TreeSet<>();
		Document document = Jsoup
				.connect("https://www.prothomalo.com/bangladesh/article/")
				.get();
		Element body = document.body();
		Elements posts = document
				.getElementsByClass("each");
		Elements postsUrl = posts.select("a[href]");


		int count = 0;
		for (Element link : postsUrl) {
			String url = link.attr("href");
			Pattern pattern = Pattern.compile("[0-9]+");
			Matcher matcher = pattern.matcher(url);
			if (matcher.find()) {
				if (matcher.group().length() != 7) {
					break;
				} else {
					linksSet.add(matcher.group());
				}
			}
		}

		// System.out.println(linksSet.size());
		for (String s : linksSet) {
			System.out.println(s);
		}

		Elements postImages = document.select("img[src]");
		for (Element link : postImages) {
			String imgUrl = link.attr("src");
			System.out.println(imgUrl);
		}

	}

	// For kalerkontho
	static void forKalerKontho() throws IOException {
		Document document = Jsoup
				.connect("http://www.kalerkantho.com/online/national/").get();
		Element body = document.body();
		Elements posts = document.getElementsByClass("print_edition_left");
		Elements post = posts.select("a[href]");
		int count = 0;
		for (Element link : post) {
			String url = link.attr("href");
			System.out.println(url);
			count++;
		}
	}

	//
	static void forJugantor() throws IOException {
		Document document = Jsoup.connect("https://www.jugantor.com/national")
				.get();
		Element body = document.body();
		Elements posts = document.getElementsByClass("home_page_left");
		Elements post = posts.select("a[href]");
		int count = 0;
		for (Element link : post) {
			String url = link.attr("href");
			System.out.println(url);
			count++;
		}
	}

}
