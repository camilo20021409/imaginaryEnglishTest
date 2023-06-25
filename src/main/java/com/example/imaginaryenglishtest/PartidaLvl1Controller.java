package com.example.imaginaryenglishtest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.Random;

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

    String nombre;

    PrincipalController controller = new PrincipalController();

    public void initialize() {
        Random random = new Random();

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
        Image signo1Image = new Image(getClass().getResourceAsStream(path1));
        Image signo2Image = new Image(getClass().getResourceAsStream(path2));
        setTexImageText(name1);

        // Establecer las imágenes en los ImageView
        signo1.setImage(signo1Image);
        signo2.setImage(signo2Image);
    }

    public void accionBoton1() {
        seleccion = 1;
        System.out.println("Seleccion " + seleccion);
    }

    public void accionBoton2() {
        seleccion = 2;
        System.out.println("Seleccion " + seleccion);
    }
    public void setTexImageText(String text) {
        TexImage.setText(text);
    }

}
