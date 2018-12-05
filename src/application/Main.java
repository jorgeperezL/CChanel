package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private AnchorPane mypane;
	public void start(Stage primaryStage) throws IOException {
	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CCchannel.fxml"));
		
		//loader.setController(new SetBlur());
		
		mypane = (AnchorPane) loader.load();
		
		primaryStage.setTitle("Where is the squirrel?");
		primaryStage.setScene(new Scene(mypane));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}