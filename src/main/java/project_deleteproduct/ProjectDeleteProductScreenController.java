package project_deleteproduct;

import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import project_editproduct.ProjectEditProductScreen;
import project_productmanagement_Screen.ProjectProductmanagementScreen;



public class ProjectDeleteProductScreenController  {
	
	
	@FXML
	private TextField ProductIDToDelete;
	
	@FXML
	private TextField product;
	

	
	
	
	@FXML
	private Button Close;
	
	@FXML
	private Button Delete;
	
	@FXML
	private Button Edit;
	
	@FXML
	private Button Search;
	
	
	
	
	public void showClose (ActionEvent event) throws Exception {
		ProjectProductmanagementScreen.showProductmanagementScreen ( );
	}
	
public void showSearch(ActionEvent event) {
	boolean status = Delete(ProductIDToDelete.getText());
	if (status) {
		Delete(null);
	}else {
		
	}
}
public void showDelete(ActionEvent event) throws Exception {
	ProjectProductmanagementScreen.showProductmanagementScreen ( );
	
}
public void showEdit (ActionEvent event) throws Exception {
	ProjectEditProductScreen.showEditProductScreen ( );
}
public  boolean Delete(String ProductID) {

	String query = "DELETE FROM project8 WHERE ProductID = '"+ProductID+"'";

	DBUtils.executeQuery(query);

	int rowsDeleted = DBUtils.getRowsDeleted();

	if(rowsDeleted > 0) {
		product.setText("ProducIDt has been deleted");
	}
	else {
		product.setText("ProducIDt not found");
    }
	return false;
}




	
}
