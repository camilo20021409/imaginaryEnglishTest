package com.example.imaginaryenglishtest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import static com.example.imaginaryenglishtest.PrincipalController.nombre;

public class PartidaLvl3Controller {

    @FXML
    private Text TexImage;
    @FXML
    private ImageView signo1;

    @FXML
    private ImageView signo2;

    @FXML
    private ImageView signo3;

    @FXML
    private ImageView signo4;

    @FXML
    Button boton1;

    @FXML
    Button boton2;

    @FXML
    Button boton3;

    @FXML
    Button boton4;

    @FXML
    private Label labelNombreUsuario, labelContadorVidas, labelContadorPuntos;

    String nombreUsuario = nombre;

    Integer vidas = 3;

    Integer puntos = 0;
    Random random = new Random();
    int condicion;

    public void initialize() throws IOException {
        condicion = random.nextInt(4) + 1;

        ArrayList<DataList.DataItem> dataList = DataList.dataList;

        int number1 = random.nextInt(dataList.size());
        DataList.DataItem dataItem1 = dataList.get(number1);
        String name1 = dataItem1.getName();
        String path1 = dataItem1.getPath();

        int number2;
        do {
            number2 = random.nextInt(dataList.size());
        } while (number2 == number1);
        DataList.DataItem dataItem2 = dataList.get(number2);
        String name2 = dataItem2.getName();
        String path2 = dataItem2.getPath();

        int number3;
        do {
            number3 = random.nextInt(dataList.size());
        } while (number3 == number1 || number3 == number2);
        DataList.DataItem dataItem3 = dataList.get(number3);
        String name3 = dataItem3.getName();
        String path3 = dataItem3.getPath();

        int number4;
        do {
            number4 = random.nextInt(dataList.size());
        } while (number4 == number1 || number4 == number2 || number4 == number3);
        DataList.DataItem dataItem4 = dataList.get(number4);
        String name4 = dataItem4.getName();
        String path4 = dataItem4.getPath();

        System.out.println("Primer número: " + number1);
        System.out.println("Nombre 1: " + name1);
        System.out.println("Path 1: " + path1);

        System.out.println("\nSegundo número: " + number2);
        System.out.println("Nombre 2: " + name2);
        System.out.println("Path 2: " + path2);

        System.out.println("\nTercer número: " + number3);
        System.out.println("Nombre 3: " + name3);
        System.out.println("Path 3: " + path3);

        System.out.println("\nCuarto número: " + number4);
        System.out.println("Nombre 4: " + name4);
        System.out.println("Path 4: " + path4);

        if (condicion == 1) {
            setTexImageText(name1);
        } else if (condicion == 2) {
            setTexImageText(name2);
        } else if (condicion == 3) {
            setTexImageText(name3);
        } else {
            setTexImageText(name4);
        }

        Image signo1Image = new Image(getClass().getResourceAsStream(path1));
        Image signo2Image = new Image(getClass().getResourceAsStream(path2));
        Image signo3Image = new Image(getClass().getResourceAsStream(path3));
        Image signo4Image = new Image(getClass().getResourceAsStream(path4));

        // Establecer las imágenes en los ImageView
        signo1.setImage(signo1Image);
        signo2.setImage(signo2Image);
        signo3.setImage(signo3Image);
        signo4.setImage(signo4Image);
        labelNombreUsuario.setText(nombreUsuario);
        labelContadorVidas.setText(String.valueOf(vidas));
        labelContadorPuntos.setText(String.valueOf(puntos));
        boton1.setOnAction(event -> {
            try {
                accionBoton(1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        boton2.setOnAction(event -> {
            try {
                accionBoton(2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        boton3.setOnAction(event -> {
            try {
                accionBoton(3);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        boton4.setOnAction(event -> {
            try {
                accionBoton(4);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void accionBoton(int seleccion) throws IOException {
        System.out.println("Seleccion " + seleccion);
        if (seleccion == condicion) {
            System.out.println("Correcto");
            puntos += 1;
        } else {
            System.out.println("Incorrecto");
            vidas -= 1;
        }

        //CHEQUEA LAS VIDAS Y CARGA PANTALLA DERROTA
        if (vidas <= 0) {
            cargarPantallaDerrota();
        } else if (puntos > 10) {
            cargarPantallaVictoria();
        } else {
            // Volver a cargar y actualizar la pantalla
            initialize();
        }
        System.out.println(condicion);
    }

    public void setTexImageText(String text) {
        TexImage.setText(text);
    }

    //CARGAR PANTALLA DERROTA Y VICTORIA
    private void cargarPantallaDerrota() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("views/PantallaDerrota.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage stage = (Stage) boton1.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    private void cargarPantallaVictoria() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("views/PantallaVictoria.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage stage = (Stage) boton1.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
