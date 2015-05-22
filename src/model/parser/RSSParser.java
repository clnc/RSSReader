package model.parser;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import model.entities.New;

public class RSSParser {

		public List<New> parseFeed(String rssURL) throws IOException{
			URL url  = new URL(rssURL);
			XmlReader reader = null;
			List<New> feeds = new ArrayList<New>();
			
			try {
				reader = new XmlReader(url);
				SyndFeed feed = new SyndFeedInput().build(reader);
			 
				for (Iterator i = feed.getEntries().iterator(); i.hasNext();) {
					SyndEntry e = (SyndEntry) i.next();
			        New news = new New();
			        news.setTitle(e.getTitle());
			        news.setDescription(e.getDescription().getValue());
			        news.setDate(0);
			        news.setGuid(e.getUri());
			        news.setMedia("");
			        
			        feeds.add(news);
				}
				
			}catch(Exception e){
				System.err.println("Error: "+e.getMessage());
			}finally{
				if (reader != null)
					reader.close();
			}
			
			return feeds;
		}
	

}
