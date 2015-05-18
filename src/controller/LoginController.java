package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

public class LoginController implements Initializable{

	@FXML
	private TextField txtEmail;
	
	@FXML
	private TextField txtPassword;
	
	@FXML
	private void handleLogin(){
		if("test".equals(txtEmail.getText()) && "test".equals(txtPassword.getText())){
			Scene scene = new Scene(new StackPane());
			LoginManager loginManager = new LoginManager(scene);
		    loginManager.showHomeScreen("Bogdan");
		}else{
			System.out.println("Invalid user and password!");
		}
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
}
