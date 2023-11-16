package project_productmanagement_Screen;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import project_addproduct.ProjectAddProductScreen;
import project_deleteproduct.ProjectDeleteProductScreen;
import project_editproduct.ProjectEditProductScreen;
import project_home_screen.ProjectHomeScreen;
import project_searchproduct.ProjectSearchProductScreen;


public class ProductManagementScreenController  {
	
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
	
	public void showAddProduct(ActionEvent event) throws Exception {
	 ProjectAddProductScreen.showAddProductScreen ( );
	}
public void showEditProduct(ActionEvent event) throws Exception {
	ProjectEditProductScreen.showEditProductScreen ( );
}
	
public void showDeleteProduct(ActionEvent event) throws Exception {
	ProjectDeleteProductScreen.showDeleteProductScreen ( );
}
public void showSearchProduct(ActionEvent event) throws Exception {
	ProjectSearchProductScreen.showSearchProductScreen ( );
}public void ShowBackToScreen(ActionEvent event) throws Exception {
	ProjectHomeScreen.showHomeScreen ( );
	
}


	
}
