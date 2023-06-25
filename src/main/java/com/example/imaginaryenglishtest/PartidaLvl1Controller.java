package com.example.imaginaryenglishtest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.HashMap;

public class PartidaLvl1Controller {
    @FXML
    private Button boton1, boton2;

    @FXML
    Label nombreUsuario;

    PrincipalController principalController;

    private Integer seleccion;


    public void accionBoton1(){
        seleccion = 1;
        System.out.println("Seleccion " + seleccion );

    }

    public void accionBoton2(){
        seleccion = 2;
        System.out.println("Seleccion " + seleccion );

    }














}
