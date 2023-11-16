package projectlogin;

import java.net.URL;

import common.StageFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;

public abstract class ProjectLoginScreen extends Application {
	

	
	public static void showLoginScreen ( ) throws Exception {
		try {
			
			@SuppressWarnings("deprecation")
			Parent actorGroup = FXMLLoader.load(new URL("file:///C|/Users//user//eclipse-workspace//ShopManagementJavaFxDBProject2//src//projectlogin//ProjectLogin.fxml"));
			
			
			Scene scene = new Scene(actorGroup, 1325, 775);
			StageFactory.setFullScreen(true);
			StageFactory.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
			StageFactory.stage.setScene(scene);
			StageFactory.stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	


}
