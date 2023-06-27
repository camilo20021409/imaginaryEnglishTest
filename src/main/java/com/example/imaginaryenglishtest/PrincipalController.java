package com.example.imaginaryenglishtest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class PrincipalController {

    @FXML
    Button btnScene1, botonNivel1, botonNivel2, botonNivel3;

    @FXML
    private TextField campoNombre;

    @FXML
    private TextField campoEdad;

    public static String nombre;
    public String edad;
    public Integer nivel;
    public String pantalla;



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String campoEdad) {
        this.edad = campoEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }


    @FXML
    public void handleBtn1() throws IOException {

        setNombre(campoNombre.getText());


        pantalla = "";

        switch (nivel){
            case 1:
                pantalla = "views/PartidaLvL1.fxml";
                break;
            case 2:
                pantalla = "views/PartidaLvL2.fxml";
                break;
            case 3:
                pantalla = "views/PartidaLvL3.fxml";
                break;
        }

        Parent root = FXMLLoader.load(getClass().getResource(pantalla));
        Stage window = (Stage) btnScene1.getScene().getWindow();
        window.setScene(new Scene(root, 700,500));


        System.out.println("Nombre, " + nombre);
        System.out.println("Edad, " + edad);
        System.out.println("Nivel, " + nivel);
        System.out.println(pantalla);
    }

    public void textoBotonNivel1(){
        nivel = 1;
    }

    public void textoBotonNivel2(){
        nivel = 2;
    }

    public void textoBotonNivel3(){
        nivel = 3;
    }








}


