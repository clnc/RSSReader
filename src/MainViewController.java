import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainViewController extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
