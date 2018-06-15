import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtractAnonInnerClass extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}
	
	Button btnAdd;
	Button btnSubtract;
	Label lbl;
	int iCounter = 0;
	
	@Override public void start(Stage primaryStage)
	{	
		// Create Add button
		btnAdd = new Button();
		btnAdd.setText("Add");
		btnAdd.setOnAction(
				new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent e)
					{
						iCounter++;
						lbl.setText(Integer.toString(iCounter));
					}
				});
		
		// Create Subtract button
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");
		btnSubtract.setOnAction(
				new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent e)
					{
						iCounter--;
						lbl.setText(Integer.toString(iCounter));
					}
				});
		
		// Create Label
		lbl = new Label();
		lbl.setText(Integer.toString(iCounter));
		
		// Add buttons and label to HBox Pane
		HBox pane = new HBox(25);
		pane.getChildren().addAll(btnAdd, lbl, btnSubtract);
		
		// Add layout pane to a scene
		Scene scene = new Scene(pane, 200,75);
		
		// Add scene to stage and set title
		// Then show stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Sub");
		primaryStage.show();
	}
}