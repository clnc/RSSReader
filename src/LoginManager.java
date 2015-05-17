import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.*;
 
/** Manages control flow for logins */
public class LoginManager {
  private Scene scene;
 
  public LoginManager(Scene scene) {
    this.scene = scene;
  }
  
  
  public void showLoginScreen() {
	try {
	  FXMLLoader loader = new FXMLLoader(
	    getClass().getResource("LoginView.fxml")
	  );
	  scene.setRoot((Parent) loader.load());
	
	} catch (IOException ex) {
	  
	}
  }
 
  
}