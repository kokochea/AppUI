package com.example.appui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class InputController {

    @FXML
    TextField usuarioField;

    @FXML
    PasswordField passwordField;

    @FXML
    Label errorLabel;

    private String user = "German";
    private String password = "German123";
    private Parent root;
    private Scene scene;
    private Stage stage;


    public void ingresarButton(ActionEvent e) throws IOException {
        if(usuarioField.getText().equals(user) && passwordField.getText().equals(password)){
            root = FXMLLoader.load(getClass().getResource("entityManager.fxml"));
            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else{
            errorLabel.setText("Usuario y/o contraseña incorrectos");
            errorLabel.setTextFill(Color.RED);
        }
    }

    public void volverButton(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("appUI.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
