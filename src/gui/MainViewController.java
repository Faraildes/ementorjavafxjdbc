package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemStudent;
	
	@FXML
	private MenuItem menuItemTeacher;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemStudentAction() {
		System.out.println("onMenuItemStudentAction");		
	}
	
	@FXML
	public void onMenuItemTeacherAction() {
		System.out.println("onMenuItemTeacherAction");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("onMenuItemAboutAction");
	}
	
		@Override
	public void initialize(URL url, ResourceBundle rb) {
				
	}
}
