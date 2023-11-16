package project_usermanagement_screen;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import project_adduser.ProjectAddUserScreen;
import project_deleteuser.ProjectDeleteUserScreen;
import project_edituser.ProjectEditUserScreen;
import project_home_screen.ProjectHomeScreen;
import project_searchuser.ProjectSearchUserScreen;


public class ProjectUsermanagementScreenController  {
	
	@FXML
	private Button AddUser;
	
	@FXML
	private Button EditUser;
	
	@FXML
	private Button DeleteUser;
	
	@FXML
	private Button SearchUser;
	
	@FXML
	private Button BackToHome;
	
	public void showAddUser(ActionEvent event) throws Exception {
		ProjectAddUserScreen.showAddUserScreen ( );
		
	}
public void showEditUserScreen(ActionEvent event) throws Exception {
	ProjectEditUserScreen.showEditUserScreen ( );
	}
public void showDeleteUser(ActionEvent event) throws Exception {
	ProjectDeleteUserScreen.showDeleteUserScreen ( );	
}
public void showSearchUser(ActionEvent event) throws Exception {
	ProjectSearchUserScreen.showSearchUserScreen ( );
	
}public void ShowBackToScreen(ActionEvent event) throws Exception {
	ProjectHomeScreen.showHomeScreen ( );
	
}


	
}
