package org.example.jfxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CalcController {

    private Stage stage;
    private Parent root;
    private Scene scene;

    private Integer prevVal = null;
    private boolean ad,mi,di,mu;

    @FXML
    private Button Scene2Switch;

    public void SwitchScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Button plus,minus,divide,multiply,equal;
    @FXML
    private TextField field;
    @FXML
    private Label ErrorText,val;

    public void Add(ActionEvent event){
        String temp = field.getText();
        if (temp.isEmpty()){
            return;
        }
        else if (prevVal == null){
            prevVal = Integer.parseInt(temp);
            val.setText(String.valueOf(prevVal));
            ad = true;
            field.setText("");
        }
        else{
            field.setText(String.valueOf(prevVal + Integer.parseInt(temp)));
            val.setText(String.valueOf(prevVal + Integer.parseInt(temp)));
            prevVal = null;
        }
    }

    public void Minus(ActionEvent event){
        String temp = field.getText();
        if (temp.isEmpty()){
            return;
        }
        else if (prevVal == null){
            prevVal = Integer.parseInt(temp);
            val.setText(String.valueOf(prevVal));
            mi = true;
            field.setText("");
        }
        else{
            field.setText(String.valueOf(prevVal - Integer.parseInt(temp)));
            val.setText(String.valueOf(prevVal - Integer.parseInt(temp)));
            prevVal = null;
        }
    }

    public void Divide(ActionEvent event){
        String temp = field.getText();
        if (temp.isEmpty()){
            return;
        }
        else if (prevVal == null){
            prevVal = Integer.parseInt(temp);
            val.setText(String.valueOf(prevVal));
            di = true;
            field.setText("");
        }
        else if (prevVal != 0){
            if (temp.equals("0")){
                ErrorText.setText("Cannot divide by 0");
                prevVal = null;
                field.setText("");
                return;
            }
            field.setText(String.valueOf(prevVal / Integer.parseInt(temp)));
            val.setText(String.valueOf(prevVal / Integer.parseInt(temp)));
            prevVal = null;
        }
        else{
            ErrorText.setText("Cannot divide by 0");
            prevVal = null;
            field.setText("");
        }
    }

    public void Multiply(ActionEvent event){
        String temp = field.getText();
        if (temp.isEmpty()){
            return;
        }
        else if (prevVal == null){
            prevVal = Integer.parseInt(temp);
            mu = true;
            field.setText("");
            val.setText(String.valueOf(prevVal));
        }
        else{
            field.setText(String.valueOf(prevVal * Integer.parseInt(temp)));
            val.setText(String.valueOf(prevVal * Integer.parseInt(temp)));
            prevVal = null;
        }
    }

    public void Equal(ActionEvent event){
        String temp = field.getText();
        if (temp.isEmpty()){
            return;
        }
        else if (prevVal == null){
            ErrorText.setText("No values given");
            field.setText("");
        }
        else{
            ErrorText.setText("");
            if (ad){
                prevVal = prevVal + Integer.parseInt(temp);
                field.setText(String.valueOf(prevVal));
                ad = false;
                prevVal = null;
            }
            else if (mi){
                prevVal = prevVal - Integer.parseInt(temp);
                field.setText(String.valueOf(prevVal));
                mi = false;
                prevVal = null;
            }
            else if (di){
                if (temp.equals("0") && prevVal != null){
                    ErrorText.setText("Cannot divide by 0");
                    prevVal = null;
                    field.setText("");
                }
                else{
                    prevVal = prevVal / Integer.parseInt(temp);
                    field.setText(String.valueOf(prevVal));
                    di = false;
                    prevVal = null;
                }
            }
            else if (mu){
                prevVal = prevVal * Integer.parseInt(temp);
                field.setText(String.valueOf(prevVal));
                mu = false;
                prevVal = null;
            }
            else{
                return;
            }
            prevVal = null;
            val.setText("");
        }

    }
}
