package project_searchuser;






import java.sql.ResultSet;
import java.sql.SQLException;

import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import project_deleteuser.ProjectDeleteUserScreen;
import project_edituser.ProjectEditUserScreen;
import project_usermanagement_screen.ProjectUsermanagementScreen;


public class ProjectSearchUserScreenController  {
	
	@FXML
	private  TextField UserName;
	
	@FXML
	private  TextField EmailToSearch;
	

	@FXML
	private TextField Email;
	
	@FXML
	private TextField MobileNo;
	
	@FXML
	private TextField Roll;
	
	@FXML
	private TextField Password;
	
	@FXML
	private TextField confirmPassword;
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
	
public void showSearch(ActionEvent event) throws Exception {
	boolean status = Search(EmailToSearch.getText());
	if (status) {
		Search(null);
	}else {
		
	}
	
	
	
}
public boolean Search(String EmailToSearch) throws Exception {
	String query = "SELECT * FROM project4 WHERE Email = '"+EmailToSearch+"'";

	ResultSet rs = DBUtils.executeQueryGetResult(query);
	try {
		if(rs.next()) {
			user.setText("user  Found");
			UserName.setText(rs.getString("UserName"));
			Email.setText(rs.getString("Email"));
			MobileNo.setText(rs.getString("MobileNo"));
			Roll.setText(rs.getString("Roll"));
			Password.setText(rs.getString("Password"));
			confirmPassword.setText(rs.getString("confirmPassword"));
		}else {
			user.setText("user not Found");
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}



	
	return false;
}

public void showDelete(ActionEvent event) throws Exception {
	ProjectDeleteUserScreen.showDeleteUserScreen ( );	
}
public void showEdit (ActionEvent event) throws Exception {
	ProjectEditUserScreen.showEditUserScreen ( );
}




	
}
