package project_deleteuser;

import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import project_edituser.ProjectEditUserScreen;
import project_usermanagement_screen.ProjectUsermanagementScreen;


public class ProjectDeleteUserScreenController  {
	
	
	@FXML
	private TextField EmailToDelete;
	@FXML
	private TextField user;
	

	

	
	
	
	@FXML
	private Button Close;
	
	@FXML
	private Button Delete;
	
	@FXML
	private Button Edit;
	
	@FXML
	private Button Search;
	
	
	
	
	
	public void showClose (ActionEvent event) throws Exception {
		ProjectUsermanagementScreen.showUsermanagementScreen ( );
		
	}
	
public void showSearch(ActionEvent event) {
	boolean status = Delete(EmailToDelete.getText());
	if (status) {
		Delete(null);
	}else {
		
	}
	
}
public void showDelete(ActionEvent event) {
	
}
public void showEdit (ActionEvent event) throws Exception {
	ProjectEditUserScreen.showEditUserScreen ( );
}
public  boolean Delete(String Email) {

	String query = "DELETE FROM project4 WHERE Email = '"+Email+"'";

	DBUtils.executeQuery(query);

	int rowsDeleted = DBUtils.getRowsDeleted();

	if(rowsDeleted > 0) {
		user.setText("user email has been deleted");
	}
	else {
		user.setText("Emailname not found");
    }
	return false;
}




	
}
