package controller;

import javafx.scene.control.Label;


public class HomeController {

	private static Label lblName = new Label();

	public static void setLabelName(String name){
		lblName.setText(name);
	}
	
	
}
