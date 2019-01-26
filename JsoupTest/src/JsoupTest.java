import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
   public static void main(String[] args) throws IOException{
      //forProthomAlo();
      //forKalerKontho();
	   forJugantor();
	   
	   String s = "5454";
	      s+=41;
	      System.out.println(s);
   }
   
   //For prothom alo
   static void forProthomAlo() throws IOException{
	   Document document = Jsoup.connect("https://www.prothomalo.com/technology/article/").get();
	      Element body = document.body();
	      Element posts = document.getElementById("widget_52794");
	      Elements post = posts.select("a[href]");
	      int count = 0;
	      for(Element link:post) {
	    	  String url = link.attr("href");
	    	  System.out.println(url);
	    	  count++;
	      }
   }
   
 //For kalerkontho
   static void forKalerKontho() throws IOException{
	   Document document = Jsoup.connect("http://www.kalerkantho.com/online/national/").get();
	      Element body = document.body();
	      Elements  posts = document.getElementsByClass("print_edition_left");
	      Elements post = posts.select("a[href]");
	      int count = 0;
	      for(Element link:post) {
	    	  String url = link.attr("href");
	    	  System.out.println(url);
	    	  count++;
	      }
	      
	      
   }
   
   //
   static void forJugantor() throws IOException{
	   Document document = Jsoup.connect("https://www.jugantor.com/national").get();
	      Element body = document.body();
	      Element  posts = document.getElementById("latest_list_block");
	      Elements post = posts.select("a[href]");
	      int count = 0;
	      for(Element link:post) {
	    	  String url = link.attr("href");
	    	  System.out.println(url);
	    	  count++;
	      }
   }
   
   
}
