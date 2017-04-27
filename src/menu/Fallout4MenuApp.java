package menu;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Fallout4MenuApp extends Application {
	
	private Parent createContent() {
		Pane root = new Pane();
		
		ImageView imageView = new ImageView(new Image(getClass()
				.getResource("res/Fallout4_bg.jpg").toExternalForm()));
		
		imageView.setFitWidth(1280);
		imageView.setFitHeight(720);
		
		SepiaTone tone = new SepiaTone(0.85);
		imageView.setEffect(tone);
		
		root.getChildren().addAll(imageView);
		return root;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(createContent());
		primaryStage.setTitle("Fallout4 Menu");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
