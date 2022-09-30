package com.example.appui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EmpresaCreationController {

    @FXML
    TextField rutField;

    @FXML
    TextField nombreField;

    @FXML
    TextField direccionField;

    @FXML
    TextField correoField;

    @FXML
    TextField contrasenaField;

    public void crearButton(ActionEvent e){

    }

    public void volverButton(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("entityManager.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
