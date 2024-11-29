package org.example.jfxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        stage.setTitle("Epic and Peak Title");
        Image icon = new Image("car.png");
        stage.getIcons().add(icon);

        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);

        stage.setX(50);
        stage.setY(50);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}