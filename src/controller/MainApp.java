package controller;
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import view.ScreenManager;


public class MainApp extends Application{

	public static Stage mainWindow;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		// Start login screen
		mainWindow = window;
		ScreenManager manager = new ScreenManager();
		LoginController controller = (LoginController) manager.replaceSceneContent("LoginView.fxml");
		
		mainWindow.show();
		
	}

}
