package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Blur {
	private AnchorPane mypane1;

	@FXML
	private void handleClose() {
		System.exit(0);
	}
	@FXML
	private void changed() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("CCchannel2.fxml"));

		// loader.setController(new SetBlur());

		mypane1 = (AnchorPane) loader.load();
		// TODO Auto-generated catch block
		Stage SecondStage = new Stage();
		SecondStage.setTitle("Where is the squirrel?");
		SecondStage.setScene(new Scene(mypane1));
		SecondStage.show();
	}
}