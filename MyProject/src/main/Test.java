package main;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

public class Test {
	public static void main(String[] args) throws IOException {

		long startTime = System.currentTimeMillis();
		ProthomAlo palo = new ProthomAlo();
//		List<Post> posts = palo.createPsot();
//		System.out.println(posts.size());
//		posts.forEach(post->{
//			
//			System.out.println(post.getCat());
//			System.out.println(post.getHeading());
//			System.out.println(post.getFtrImg());
//			System.out.println(post.getUrl());
//			System.out.println(post.getDateTime());
//			System.out.println(post.getPublisher());
//			
//			post.getPostBody().forEach(para->{
//				if(para.getImgUrl() == null) {
//					System.out.println(para.getDescription());
//				}else {
//					System.out.println(para.getImgUrl());
//					System.out.println(para.getImgCaption());
//					System.out.println(para.getDescription());
//				}
//			});
//
//		});
		

		
		System.out.println(System.currentTimeMillis() - startTime);
	}
}
