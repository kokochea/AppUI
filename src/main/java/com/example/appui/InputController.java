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


    public void ingresarButton(ActionEvent e) throws IOException {
        if(usuarioField.getText().equals(user) && passwordField.getText().equals(password)){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("creacionEntidad.fxml"));
            root = loader.load();
            System.out.println("if");


        }else{
            errorLabel.setText("Usuario o Contrasena incorrectos");
            errorLabel.setTextFill(Color.RED);
            System.out.println("else");
        }
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("nada");
    }
}
