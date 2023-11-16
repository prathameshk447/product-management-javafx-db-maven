package project_adduser;




import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import project_usermanagement_screen.ProjectUsermanagementScreen;


public class ProjectAddUserScreenController  {
	
	@FXML
	private TextField UserName;
	

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
	private Button Save;
	
	
	
	public void showClose (ActionEvent event) throws Exception {
		ProjectUsermanagementScreen.showUsermanagementScreen ( );
		
	}
	
public void showSave(ActionEvent event) throws Exception {
	String query = "INSERT INTO project4(UserName,Email,MobileNo,confirmPassword,Roll,Password)VALUES('"+UserName.getText()+"','"+Email.getText()+"','"+MobileNo.getText()+"','"+confirmPassword.getText()+"','"+Roll.getText()+"','"+Password.getText()+"')";

	DBUtils.executeQuery(query);
	 

	user.setText("user Informatrion Updated Successfully");
	
	
}
	
}


	

