package project_deleteuser;






import java.net.URL;

import common.StageFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public abstract class ProjectDeleteUserScreen extends  Application {
	

	
	public static void showDeleteUserScreen ( ) throws Exception {
		try {
			
			@SuppressWarnings("deprecation")
			Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//user//eclipse-workspace//ShopManagementJavaFxDBProject2//src//project_deleteuser//DeleteUser.fxml"));
			
			Scene scene = new Scene(actorGroup, 1310, 775);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	

}


