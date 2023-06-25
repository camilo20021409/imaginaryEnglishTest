package com.example.imaginaryenglishtest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PartidaLvl1Controller extends PrincipalController{
    @FXML
    private Button boton1, boton2;

    @FXML
    private Label labelNombreUsuario, labelContadorVidas, labelContadorPuntos;

    Integer seleccion;

    String nombreUsuario = nombre;

    Integer vidas = 3;

    Integer puntos = 0;


    public void accionBoton1(){
        seleccion = 1;
        System.out.println("Seleccion " + seleccion );
    }

    public void accionBoton2(){
        seleccion = 2;
        System.out.println("Seleccion " + seleccion );
    }

    public void initialize() {
         // Replace with the actual value
        labelNombreUsuario.setText(nombreUsuario);
        labelContadorVidas.setText(String.valueOf(vidas));
        labelContadorPuntos.setText(String.valueOf(puntos));

    }






}
