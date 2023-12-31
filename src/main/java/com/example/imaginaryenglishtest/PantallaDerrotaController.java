package com.example.imaginaryenglishtest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PantallaDerrotaController {
    @FXML
    Button botonSigueIntentando;

    @FXML
    private void cargarPantallaInicio() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("views/principal.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage stage = (Stage) botonSigueIntentando.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }





}
