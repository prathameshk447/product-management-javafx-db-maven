package project_home_screen;

import java.net.URL;

import common.StageFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public abstract class ProjectHomeScreen extends Application {
	

	
	public static void showHomeScreen ( ) throws Exception {
		try {
			
			@SuppressWarnings("deprecation")
			Parent actorGroup = FXMLLoader.load(new URL("file:///C|//Users//user//eclipse-workspace//ShopManagementJavaFxDBProject2//src//project_home_screen//HomeScreen.fxml"));
			
			Scene scene = new Scene(actorGroup, 1310, 775);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

}
