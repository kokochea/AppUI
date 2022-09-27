package com.example.appui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class FitnessAppUIApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("appUI.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setTitle("FitnessApp");
        stage.setScene(scene);
        stage.show();
    }

}
