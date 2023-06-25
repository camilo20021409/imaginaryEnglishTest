package com.example.imaginaryenglishtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ImaginaryEnglishApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ImaginaryEnglishApplication.class.getResource("views/principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch();
        for (int i = 0; i < DataList.dataList.size(); i++) {
            DataList.DataItem item = DataList.dataList.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " - " + item.getPath());
        }


    }
}