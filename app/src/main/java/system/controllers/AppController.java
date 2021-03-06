package system.controllers;

import java.io.IOException;
import java.sql.Connection;

import application.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Modality;
import javafx.stage.Stage;
import system.jdbc.ConnectionManager;

public class AppController {
	
	@FXML
	private Button customer_btn;

	@FXML
	private Button chemist_btn;
	
	@FXML
	public void onClickCustomer(ActionEvent e) throws IOException {
		System.out.println("Clicked Customer Btn");
		
		// switching to the login page 
		Parent root = FXMLLoader.load(App.class.getResource("/system/fxmls/Customer Login.fxml"));
		
		Scene scene = new Scene(root);
		
		Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		
		stage.setScene(scene);
//		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setResizable(false);
		stage.setTitle("Customer Login");
		
		stage.show();
		
	}
	
	@FXML 
	public void onClickChemist(ActionEvent e) throws IOException {
		System.out.println("Clicked Chemist Button");
		 	
		//initializing new window as modal
		Parent root = FXMLLoader.load(App.class.getResource("/system/fxmls/Chemist Login.fxml"));
	
		Scene scene = new Scene(root);
		
		Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		
		stage.setScene(scene);
//		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setResizable(false);
		stage.setTitle("Chemist Login");
		
	
		stage.show();

	}
	
	
	
	
	
	
	
	
	
}
