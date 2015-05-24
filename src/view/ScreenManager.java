package view;
import java.io.IOException;

import controller.MainApp;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ScreenManager {

	public Initializable replaceSceneContent(String fxml) throws Exception {

		FXMLLoader loader = new FXMLLoader();
		try {
			loader = new FXMLLoader(getClass().getResource(fxml));
			Scene scene = new Scene((Parent) loader.load(), 500, 500);
			
			MainApp.mainWindow.setScene(scene);
		} catch (IOException e) {
			System.err.println("Error: "+e.getMessage());
		}

		return (Initializable) loader.getController();

	}
}
