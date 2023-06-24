package com.example.imaginaryenglishtest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class PrincipalController {
    @FXML
    private TextField campoNombre;

    @FXML
    private TextField campoEdad;

    @FXML
    private TextField nivelJuego;

    @FXML
    Button btnScene1;

    public PrincipalController(){

    }


    public void handleBtn1() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("views/PartidaLvL1.fxml"));
        Stage window = (Stage) btnScene1.getScene().getWindow();
        window.setScene(new Scene(root, 700,500));

        System.out.println("Nombre, " + this.campoNombre.getText());
        System.out.println("Edad, " + this.campoEdad.getText());
        System.out.println("Nivel, " + this.campoEdad.getText());


    }


}


