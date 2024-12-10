package org.example.jfxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.TriangleMesh;

public class FXController{

    @FXML
    private AnchorPane anchor = new AnchorPane();

    private boolean checkBool = false;

    @FXML
    private Button morph = new Button();

    @FXML
    private CheckBox check = new CheckBox();

    @FXML
    private Polygon triangle = new Polygon();


    @FXML
    public void Checker(ActionEvent e){
        checkBool = !(checkBool);
        check.setSelected(checkBool);
    }

    @FXML
    public void Morph(ActionEvent event) {
        if (check.isSelected()){
            triangle.setFill(Color.color(
                    (double) Math.random(),
                    (double) Math.random(),
                    (double) Math.random())
            );
        }

        triangle.setLayoutX(triangle.getLayoutX() + (Math.random() * 50) * ((Math.random() < 0.5) ? -1 : 1));
        triangle.setLayoutY(triangle.getLayoutY() + (Math.random() * 50) * ((Math.random() < 0.5) ? -1 : 1));
    }


}