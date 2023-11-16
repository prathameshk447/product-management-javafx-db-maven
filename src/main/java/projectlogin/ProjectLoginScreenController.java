package projectlogin;





import java.sql.ResultSet;
import java.sql.SQLException;

import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import project_home_screen.ProjectHomeScreen;

public class ProjectLoginScreenController {
	
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField password;
	
	@FXML
	private Button Login;
	
	public  void projectlogin(ActionEvent event) throws Exception {
		
		boolean projectloginstatus = ProjectLoginScreenController.ValidateUserAndPassword(username.getText(),password.getText());
		if(projectloginstatus) {
			ProjectHomeScreen.showHomeScreen ( );
		}else {
			System.out.println("login unsuccessful");
		}
	}
	
	public static boolean ValidateUserAndPassword(String LoginName,String password){
		String query = " Select * from User where LoginName='"+LoginName+"' and password = '"+password+"' ";

		ResultSet rs = DBUtils.executeQueryGetResult(query);

		try {
			if(rs.next()) {
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
