import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class ClickCounter extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	int iClickCount = 0;
	Button btn;
	
	@Override public void start(Stage primaryStage)
	{
		// Create button
		btn = new Button();
		btn.setText("Click me please!");
		btn.setOnAction(e -> buttonClick());
		
		// Add button to layout pane
		BorderPane pane = new BorderPane();
		pane.setCenter(btn);
		
		// Add layout pane to a scene
		Scene scene = new Scene(pane, 250, 150);
		
		// Add scene to stage and set title
		// and show stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Click Counter");
		primaryStage.show();
	}
	
	public void buttonClick()
	{
		iClickCount++;
		if (iClickCount == 1)
		{
			MessageBox.show("You have clicked once.", "Click!");
		}
		else 
		{
			MessageBox.show("You have clicked " + iClickCount + " times.", "Click!");
		}
	}
}