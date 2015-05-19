package model.parser;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class RSSParser {

		public void parseFeed() throws IOException{
			URL url  = new URL("http://rss.cnn.com/rss/edition.rss");
			XmlReader reader = null;
			
			 
			try {
			  
			  reader = new XmlReader(url);
			  SyndFeed feed = new SyndFeedInput().build(reader);
			  System.out.println("Feed Title: "+ feed.getAuthor());
			 
			     for (Iterator i = feed.getEntries().iterator(); i.hasNext();) {
			    	SyndEntry e = (SyndEntry) i.next();
			        System.out.println(e.getTitle());
			     }
			}catch(Exception e){
				
			} finally {
			    if (reader != null)
			        reader.close();
			}
		}
	

}
