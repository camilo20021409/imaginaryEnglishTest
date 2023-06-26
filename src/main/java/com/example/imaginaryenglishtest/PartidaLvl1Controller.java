package com.example.imaginaryenglishtest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
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
    Button boton1;

    @FXML
    Button boton2;

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
    int condicion;

    PrincipalController controller = new PrincipalController();

    public void initialize() throws IOException {
        condicion = random.nextInt(2) + 1;

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
        boton1.setOnAction(event -> {
            try {
                accionBoton1();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        boton2.setOnAction(event -> {
            try {
                accionBoton2();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });



    }

    public void accionBoton1() throws IOException {
        seleccion = 1;
        System.out.println("Seleccion " + seleccion);
        if (seleccion == condicion) {
            System.out.println("Correcto");
            puntos += 1;
        } else {
            System.out.println("Incorrecto");
            vidas -= 1;
        }

        //CHEQUEA LAS VIDA Y CARGA PANTALLA DERROTA
        if(vidas <= 0){
            cargarPantallaDerrota();
        } else if (puntos >10){
            cargarPantallaVictoria();

        } else {
            // Volver a cargar y actualizar la pantalla
            initialize();
        }
        System.out.println(condicion);
    }



    public void accionBoton2 () throws IOException{
        seleccion = 2;
        System.out.println("Seleccion " + seleccion);
        if (seleccion == condicion) {
            System.out.println("Correcto");
            puntos += 1;
        } else {
            System.out.println("Incorrecto");
            vidas -= 1;
        }

        //CHEQUEA LAS VIDA Y CARGA PANTALLA DERROTA
        if(vidas <= 0){
            cargarPantallaDerrota();
        } else if (puntos >10){
            cargarPantallaVictoria();
        }
        else {
            // Volver a cargar y actualizar la pantalla
            initialize();
        }

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
