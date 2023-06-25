package com.example.imaginaryenglishtest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;

import static com.example.imaginaryenglishtest.PrincipalController.nombre;

public class PartidaLvl1Controller {
    @FXML
    private Text TexImage;
    @FXML
    private ImageView signo1;

    @FXML
    private ImageView signo2;

    @FXML
    private Button boton1;

    @FXML
    private Button boton2;

    @FXML
    private Text text1;

    @FXML
    private Text text2;

    private Integer seleccion;
    @FXML
    private Label labelNombreUsuario, labelContadorVidas, labelContadorPuntos;

    String nombreUsuario = nombre;

    Integer vidas = 3;

    Integer puntos = 0;
    Random random = new Random();
    int condicion = random.nextInt(2) + 1;

    PrincipalController controller = new PrincipalController();

    public void initialize() {

        int number1 = random.nextInt(30) + 1;
        int number2;

        do {
            number2 = random.nextInt(30) + 1;
        } while (number2 == number1);

        ArrayList<DataList.DataItem> dataList = DataList.dataList;

        DataList.DataItem dataItem1 = dataList.get(number1 - 1);
        String name1 = dataItem1.getName();
        String path1 = dataItem1.getPath();

        DataList.DataItem dataItem2 = dataList.get(number2 - 1);
        String name2 = dataItem2.getName();
        String path2 = dataItem2.getPath();

        System.out.println("Primer número: " + number1);
        System.out.println("Nombre 1: " + name1);
        System.out.println("Path 1: " + path1);

        System.out.println("\nSegundo número: " + number2);
        System.out.println("Nombre 2: " + name2);
        System.out.println("Path 2: " + path2);
        if (condicion == 1) {
            setTexImageText(name1);
        } else if (condicion == 2) {
            setTexImageText(name2);
        }


        Image signo1Image = new Image(getClass().getResourceAsStream(path1));
        Image signo2Image = new Image(getClass().getResourceAsStream(path2));


        // Establecer las imágenes en los ImageView
        signo1.setImage(signo1Image);
        signo2.setImage(signo2Image);
        labelNombreUsuario.setText(nombreUsuario);
        labelContadorVidas.setText(String.valueOf(vidas));
        labelContadorPuntos.setText(String.valueOf(puntos));
    }

    public void accionBoton1() {
        seleccion = 1;
        System.out.println("Seleccion " + seleccion);
        System.out.println("Seleccion " + seleccion );
        if (seleccion == condicion) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

    public void accionBoton2() {
        seleccion = 2;
        System.out.println("Seleccion " + seleccion);
        if (seleccion == condicion) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    public void setTexImageText(String text) {
        TexImage.setText(text);
    }






}
