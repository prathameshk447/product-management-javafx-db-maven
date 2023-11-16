package project_edituser;








import java.sql.ResultSet;
import java.sql.SQLException;

import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import project_usermanagement_screen.ProjectUsermanagementScreen;


public class ProjectEditUserScreenController  {
	
	@FXML
	private TextField NewUserName;
	
	@FXML
	private TextField EmailToEdit;
	

	@FXML
	private TextField NewEmail;
	
	@FXML
	private TextField NewMobileNo;
	
	@FXML
	private TextField NewRoll;
	
	@FXML
	private TextField NewPassword;
	
	@FXML
	private TextField NewconfirmPassword;
	@FXML
	private TextField user;
	
	
	
	@FXML
	private Button Close;
	
	@FXML
	private Button Save;
	
	@FXML
	private Button Edit;
	
	@FXML
	private Button Search;
	
	
	
	
	public void showClose (ActionEvent event) throws Exception {
		ProjectUsermanagementScreen.showUsermanagementScreen ( );
		
	}
	
public void showSearch(ActionEvent event) throws Exception {
	boolean status = Edit(EmailToEdit.getText());
	if (status) {
		Edit(null);
	}else {
		System.out.println("user not found");
	}
}
public void showSave(ActionEvent event) throws Exception {
	
	String Query = "UPDATE Project4 SET UserName = '"+NewUserName.getText()+"', "
		    + "Email = '" + NewEmail.getText() + "', " 
		    + "MobileNo = '"+NewMobileNo.getText()+"', "
		    + "Password = '"+NewPassword.getText()+"',"
		    + "confirmPassword = '"+NewconfirmPassword.getText()+"',"
		    + "Roll = '"+NewRoll.getText()+"'"
		    + "WHERE Email = '"+EmailToEdit.getText()+"'";

	DBUtils.executeQuery(Query);
	
	
	
}
public void showEdit (ActionEvent event) throws Exception {
	
	
}
public boolean Edit(String EmailToEdit) throws Exception {
	String query = "SELECT * FROM project4 WHERE Email = '"+EmailToEdit+"'";
    
	ResultSet rs = DBUtils.executeQueryGetResult(query);
	try {
		if(rs.next()) {
			
			
			
			
			
			user.setText("user Found");
			
			
			
		}else {
			user.setText("user not Found");
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}



	
	return false;
}




	
}
