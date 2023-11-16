package project_searchproduct;






import java.sql.ResultSet;
import java.sql.SQLException;

import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import project_deleteproduct.ProjectDeleteProductScreen;
import project_productmanagement_Screen.ProjectProductmanagementScreen;


public class ProjectSearchProductScreenController  {
	
	@FXML
	private TextField ProductName;
	@FXML
	private TextField ProductIDToSearch;
	
	@FXML
	private TextField user;
	
	
	
	@FXML
	private TextField ProductPrice;
	

	@FXML
	private TextField ProductCategory;
	
	@FXML
	private TextField ProductQuantity;
	
	@FXML
	private TextField ProductID;
	
	
	
	
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
	
public void showSearch(ActionEvent event) throws Exception {
	boolean status = Search(ProductIDToSearch.getText());
	if (status) {
		Search(null);
	}else {
		
	}
	
}
public boolean Search(String ProductIDToSearch) throws Exception {
	String query = "SELECT * FROM project8 WHERE ProductID = '"+ProductIDToSearch+"'";

	ResultSet rs = DBUtils.executeQueryGetResult(query);
	try {
		if(rs.next()) {
			user.setText("Product Found");
			ProductName.setText(rs.getString("ProductName"));
			ProductID.setText(rs.getString("ProductID"));
			ProductPrice.setText(rs.getString("ProductPrice"));
			ProductCategory.setText(rs.getString("ProductCategory"));
			ProductQuantity.setText(rs.getString("ProductQuantity"));
			
		}else {
			user.setText("Product not Found");
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}



	
	return false;
}
public void showDelete(ActionEvent event) throws Exception {
	ProjectDeleteProductScreen.showDeleteProductScreen ( );
}
public void showSave (ActionEvent event) {
	
}




	
}
