package project_home_screen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import project_productmanagement_Screen.ProjectProductmanagementScreen;
import project_usermanagement_screen.ProjectUsermanagementScreen;
import projectlogin.ProjectLoginScreen;


public class ProjectHomeScreenController {
	
	@FXML
	private Button userManagement;
	
	@FXML
	private Button productManagement;
	
	@FXML
	private Button backToHome;
	
	public void showUserManagementScreen(ActionEvent event) throws Exception {
		ProjectUsermanagementScreen.showUsermanagementScreen ( );
	}
public void showProductManagementScreen(ActionEvent event) throws Exception {
	ProjectProductmanagementScreen.showProductmanagementScreen ( );
	}
public void backToHomeScreen(ActionEvent event) throws Exception {
        ProjectLoginScreen.showLoginScreen ( );
	
}
	
	

	
}
