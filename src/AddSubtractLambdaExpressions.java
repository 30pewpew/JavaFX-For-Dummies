import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class AddSubtractLambdaExpressions extends Application
{
	public static void main(String[] args)
	{
		launch (args);
	}
	
	Button btnAdd;
	Button btnSubtract;
	Label lbl;
	int iCounter = 0;
	
	@Override public void start (Stage primaryStage)
	{
		// Create Add button
		btnAdd = new Button();
		btnAdd.setText("Add");
		btnAdd.setOnAction(e -> btnAdd_Click());
		
		// Create Subtract button
		btnSubtract = new Button();
		btnSubtract.setText("Subtract");
		btnSubtract.setOnAction(e -> btnSubtract_Click());
		
		// Create Label
		lbl = new Label();
		lbl.setText(Integer.toString(iCounter));
		
		// Add buttons and label to HBox pane
		HBox pane = new HBox(10);
		pane.getChildren().addAll(btnAdd, lbl, btnSubtract);
		
		// Add layout pane to a scene
		Scene scene = new Scene (pane, 200, 75);
		
		// Add scene to stage, set title
		// and show stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add/Sub");
		primaryStage.show();
	}
	
	private void btnAdd_Click()
	{
		iCounter++;
		lbl.setText(Integer.toString(iCounter));
	}
	
	private void btnSubtract_Click()
	{
		iCounter--;
		lbl.setText(Integer.toString(iCounter));
	}
}