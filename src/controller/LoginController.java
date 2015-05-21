package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

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
		if("test".equals(txtEmail.getText()) && "test".equals(txtPassword.getText())){
			Scene scene = new Scene(new StackPane());
			LoginManager loginManager = new LoginManager(scene);
		    loginManager.showHomeScreen("Bogdan");
		}else{
			lblMessage.setText("Invalid user and/or password!");
		}
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}
