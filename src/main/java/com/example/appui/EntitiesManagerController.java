package com.example.appui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EntitiesManagerController {

    public void crearEmpresa(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("empresaCreation.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void modificarEmpresa(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("empresaModification.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void eliminarEmpresa(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("empresaDeletion.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void crearCentroDeportivo(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("centroDeportivoCreation.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void modificarCentroDeportivo(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("centroDeportivoModification.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void eliminarCentroDeportivo(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("centroDeportivoDeletion.fxml"));
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
