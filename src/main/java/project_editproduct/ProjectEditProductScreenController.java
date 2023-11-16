package project_editproduct;








import java.sql.ResultSet;
import java.sql.SQLException;

import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import project_deleteproduct.ProjectDeleteProductScreen;
import project_productmanagement_Screen.ProjectProductmanagementScreen;

public class ProjectEditProductScreenController  {
	
	@FXML
	private TextField NewProductName;
	
	@FXML
	private TextField user;


	@FXML
	private TextField ProductIDToEdit;
	
	@FXML
	private TextField NewProductPrice ;
	

	@FXML
	private TextField NewProductCategory;
	
	@FXML
	private TextField NewProductQuantity;
	
	@FXML
	private TextField NewProductID;
	
	
	
	@FXML
	private Button Close;
	
	@FXML
	private Button Delete;
	
	@FXML
	private Button Save;
	
	@FXML
	private Button Search;
	
	
	
	
	public void showClose (ActionEvent event) throws Exception {
		ProjectProductmanagementScreen.showProductmanagementScreen ( );
	}
	
public void showSearch(ActionEvent event) throws Exception{
	boolean status = Edit(ProductIDToEdit.getText());
	if (status) {
		Edit(null);
	}else {
		
	}
}
public void showDelete(ActionEvent event) throws Exception {
	ProjectDeleteProductScreen.showDeleteProductScreen ( );
}
public void showSave (ActionEvent event) throws Exception {
	String Query = "UPDATE Project8 SET ProductName = '"+NewProductName.getText()+"', "
		    + "ProductID = '" + NewProductID.getText() + "', " 
		    + "ProductPrice = '"+NewProductPrice.getText()+"', "
		    + "ProductCategory = '"+NewProductCategory.getText()+"',"
		    + "ProductQuantity = '"+NewProductQuantity.getText()+"'"
		    + "WHERE ProductID = '"+ProductIDToEdit.getText()+"'";

	DBUtils.executeQuery(Query);
	
}
public boolean Edit(String ProductIDToEdit) throws Exception {
	String query = "SELECT * FROM project8 WHERE ProductID = '"+ProductIDToEdit+"'";
    
	ResultSet rs = DBUtils.executeQueryGetResult(query);
	try {
		if(rs.next()) {
			
			
			
			
			
			user.setText("product Found");
			
			
		}else {
			user.setText("product not Found");
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}



	
	return false;
}





	
}
