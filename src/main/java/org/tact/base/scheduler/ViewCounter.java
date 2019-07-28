package org.tact.base.scheduler;



import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ViewCounter {

	public static void main1(String[] args) {
		
		
        //System.out.println(title);
		long sugarViews = getViewCount("https://www.youtube.com/watch?v=Pkh8UtuejGw");
		long rowdyBabyViews = getViewCount("https://www.youtube.com/watch?v=x6Q7c9RyMzk");
		System.out.println(sugarViews);
		System.out.println(rowdyBabyViews);
	}
	
	public static long getViewCount(String url) {
		
		//System.out.println("View Calculator");
		//String url = "https://www.youtube.com/watch?v=09R8_2nJtjg";

        Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
			
			Element images = doc.select("span.view-count").first();
			
			String viewCount = images.html().replace(" views", "");
			
			viewCount = viewCount.replaceAll(",", "");
			
			//System.out.println("["+viewCount+"]");
			
			long views = Long.parseLong(viewCount);
			
			//System.out.println(viewCount);
			
			return views;
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	
	}

}

