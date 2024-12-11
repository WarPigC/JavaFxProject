package org.example.jfxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;

public class FXController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button goToCalc;
    @FXML
    private Polygon shape;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button randCol;
    @FXML
    private Button randT;
    @FXML
    private Label label;

    public void SwitchScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void SwitchScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void CalculatorScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void fillColor(ActionEvent event){
        shape.setFill(Color.color(
                Math.random(),
                Math.random(),
                Math.random()
        ));
    }

    public void randomText(ActionEvent event){
        String temp = "abcdefghijklmnopqrstuvwxyz",inp = new String();
        for(int i = 0 ; i < 10; ++i){
            int r = (int) ((Math.random() * 100) % 24);
            inp += String.valueOf(temp.charAt(r));
        }
        label.setText(inp);
    }

}