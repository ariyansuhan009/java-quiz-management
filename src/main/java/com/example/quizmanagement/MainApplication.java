package com.example.quizmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
		Scene scene = new Scene(fxmlLoader.load(), 520, 340);
		stage.setTitle("Online java quiz management system");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}