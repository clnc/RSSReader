package controller;
import java.io.IOException;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.entities.New;
import model.parser.RSSParser;


public class MainViewController extends Application{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RSSParser rss = new RSSParser();
		List<New> feeds = rss.parseFeed("http://rss.realitatea.net/actual.xml");
		System.out.println("Start...");
		for(New e : feeds){
			System.out.println("Title: "+e.getTitle());
			System.out.println("Description: "+e.getDescription());
			System.out.println("URL: "+e.getGuid());
			System.out.println("------------------");
		}
		System.out.println("End...");
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		// Start login screen
		Scene scene = new Scene(new StackPane());
		LoginManager loginManager = new LoginManager(scene);
	    loginManager.showLoginScreen();
	 
	    window.setScene(scene);
	    window.show();
		
	}

}
