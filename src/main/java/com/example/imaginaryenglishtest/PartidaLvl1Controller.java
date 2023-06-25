package com.example.imaginaryenglishtest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.HashMap;

public class PartidaLvl1Controller extends PrincipalController{
    @FXML
    private Button boton1, boton2;

    @FXML
    Label labelNombreUsuario;

     Integer seleccion;

     String nombreUsuario = nombre;





    public void accionBoton1(){
        seleccion = 1;
        System.out.println("Seleccion " + seleccion );
        System.out.println(nombreUsuario);

    }

    public void accionBoton2(){
        seleccion = 2;
        System.out.println("Seleccion " + seleccion );

    }














}
