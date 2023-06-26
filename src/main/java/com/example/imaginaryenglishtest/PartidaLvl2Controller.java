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

public class PartidaLvl2Controller {

    @FXML
    private Text TexImage;

    @FXML
    private ImageView signo1;

    @FXML
    private ImageView signo2;

    @FXML
    private ImageView signo3;

    @FXML
    private Button boton1;

    @FXML
    private Button boton2;

    @FXML
    private Button boton3;

    @FXML
    private Label labelNombreUsuario;

    @FXML
    private Label labelContadorVidas;

    @FXML
    private Label labelContadorPuntos;

    private Integer seleccion;

    private String nombreUsuario = nombre;

    private Integer vidas = 3;

    private Integer puntos = 0;

    private Random random = new Random();

    private int condicion;

    private PrincipalController controller = new PrincipalController();

    public void initialize() throws IOException {
        condicion = random.nextInt(3) + 1;

        int number1 = random.nextInt(30) + 1;
        int number2;
        int number3;

        do {
            number2 = random.nextInt(30) + 1;
        } while (number2 == number1);

        do {
            number3 = random.nextInt(30) + 1;
        } while (number3 == number1 || number3 == number2);

        ArrayList<DataList.DataItem> dataList = DataList.dataList;

        DataList.DataItem dataItem1 = dataList.get(number1 - 1);
        String name1 = dataItem1.getName();
        String path1 = dataItem1.getPath();

        DataList.DataItem dataItem2 = dataList.get(number2 - 1);
        String name2 = dataItem2.getName();
        String path2 = dataItem2.getPath();

        DataList.DataItem dataItem3 = dataList.get(number3 - 1);
        String name3 = dataItem3.getName();
        String path3 = dataItem3.getPath();

        System.out.println("Primer número: " + number1);
        System.out.println("Nombre 1: " + name1);
        System.out.println("Path 1: " + path1);

        System.out.println("\nSegundo número: " + number2);
        System.out.println("Nombre 2: " + name2);
        System.out.println("Path 2: " + path2);

        System.out.println("\nTercer número: " + number3);
        System.out.println("Nombre 3: " + name3);
        System.out.println("Path 3: " + path3);

        if (condicion == 1) {
            setTexImageText(name1);
        } else if (condicion == 2) {
            setTexImageText(name2);
        } else {
            setTexImageText(name3);
        }

        Image signo1Image = new Image(getClass().getResourceAsStream(path1));
        Image signo2Image = new Image(getClass().getResourceAsStream(path2));
        Image signo3Image = new Image(getClass().getResourceAsStream(path3));

        signo1.setImage(signo1Image);
        signo2.setImage(signo2Image);
        signo3.setImage(signo3Image);

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
                e.printStackTrace();
            }
        });

        boton3.setOnAction(event -> {
            try {
                accionBoton3();
            } catch (IOException e) {
                e.printStackTrace();
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

        // CHEQUEA LAS VIDAS Y CARGA PANTALLA DERROTA
        if (vidas <= 0) {
            cargarPantallaDerrota();
        } else if (puntos > 10) {
            cargarPantallaVictoria();
        } else {
            // Volver a cargar y actualizar la pantalla
            initialize();
        }
    }

    public void accionBoton2() throws IOException {
        seleccion = 2;
        System.out.println("Seleccion " + seleccion);
        if (seleccion == condicion) {
            System.out.println("Correcto");
            puntos += 1;
        } else {
            System.out.println("Incorrecto");
            vidas -= 1;
        }

        // CHEQUEA LAS VIDAS Y CARGA PANTALLA DERROTA
        if (vidas <= 0) {
            cargarPantallaDerrota();
        } else if (puntos > 10) {
            cargarPantallaVictoria();
        } else {
            // Volver a cargar y actualizar la pantalla
            initialize();
        }
    }

    public void accionBoton3() throws IOException {
        seleccion = 3;
        System.out.println("Seleccion " + seleccion);
        if (seleccion == condicion) {
            System.out.println("Correcto");
            puntos += 1;
        } else {
            System.out.println("Incorrecto");
            vidas -= 1;
        }

        // CHEQUEA LAS VIDAS Y CARGA PANTALLA DERROTA
        if (vidas <= 0) {
            cargarPantallaDerrota();
        } else if (puntos > 10) {
            cargarPantallaVictoria();
        } else {
            // Volver a cargar y actualizar la pantalla
            initialize();
        }
    }

    public void setTexImageText(String text) {
        TexImage.setText(text);
    }

    // CARGAR PANTALLA DERROTA Y VICTORIA
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
