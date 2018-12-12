package p1;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SchoolFinder extends Application {
	private Set<String> schoolNameSet = new HashSet<>();
	private Set<String> chosenNameSet;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() {
		fillSchoolSet();
	}

	private void fillSchoolSet() {
		schoolNameSet.add("Suffolk County Community College");
		schoolNameSet.add("Nassau Community College");
		schoolNameSet.add("Stony Brook University");
		schoolNameSet.add("Suffolk University");
		schoolNameSet.add("New York University");
		schoolNameSet.add("Columbia University");
		schoolNameSet.add("Suffolk County Community College");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField nameField = new TextField();
		nameField.setPrefSize(300, 40);
		TextArea outputArea = new TextArea();
		outputArea.setPrefSize(300, 300);

		// nameField.textProperty().addListener(new MyChangeListener());
		nameField.textProperty().addListener((observable, oldValue, newValue) -> {
			findChosenOnes(nameField.getText());
			outputArea.clear();
			chosenNameSet.stream().forEach(one -> outputArea.appendText(one + "\n"));
		}
		);

		VBox root = new VBox(30);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(40));
		root.getChildren().addAll(nameField, outputArea);
		Scene scene = new Scene(root, 400, 450);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void findChosenOnes(String text) {
		chosenNameSet = schoolNameSet
				.stream().filter(school -> school.startsWith(text))
				.collect(Collectors.toSet());
	}

}
