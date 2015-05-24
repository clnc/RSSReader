package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import view.ScreenManager;

public class LoginController implements Initializable{

	@FXML
	private VBox root;
	
	@FXML
	private TextField txtEmail;
	
	@FXML
	private TextField txtPassword;
	
	@FXML
	private Label lblMessage;
	
	@FXML
	private void handleLogin(){
		if("test@test.com".equals(txtEmail.getText()) && "test".equals(txtPassword.getText())){
			goToStart();
		}else{
			lblMessage.setText("Invalid user and/or password!");
		}
		
	}
	
	private void goToStart(){
		
		StartController sc;
		try {
			ScreenManager manager = new ScreenManager();
			sc = (StartController) manager.replaceSceneContent("HomeView.fxml");
			sc.setLblName("Bogdan");
		} catch (Exception e) {
			System.err.println("Error loading HomeView.fxml: "+e.getMessage());
		}
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}
