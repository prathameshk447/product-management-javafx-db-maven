package project_addproduct;




import db_oprations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import project_productmanagement_Screen.ProjectProductmanagementScreen;


public class ProjectAddProductScreenController  {
	
	@FXML
	private TextField ProductName;
	

	@FXML
	private TextField ProductID;
	
	@FXML
	private TextField ProductPrice;
	
	@FXML
	private TextField ProductQuantity;
	
	@FXML
	private TextField ProductCategory;

	@FXML
	private TextField product;
	
	
	
	
	
	@FXML
	private Button Close;
	
	@FXML
	private Button Save;
	
	
	
	public void showClose (ActionEvent event) throws Exception {
		ProjectProductmanagementScreen.showProductmanagementScreen ( );
		
	}
	
public void showSave(ActionEvent event) {
	String query = "INSERT INTO project8(ProductName,ProductID,ProductPrice,ProductQuantity,ProductCategory)VALUES('"+ProductName.getText()+"','"+ProductID.getText()+"','"+ProductPrice.getText()+"','"+ProductQuantity.getText()+"','"+ProductCategory.getText()+"')";

	DBUtils.executeQuery(query);
	 
	product.setText("Produc Informatrion Updated Successfully");
}


	
}
