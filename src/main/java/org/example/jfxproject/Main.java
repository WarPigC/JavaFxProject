package org.example.jfxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();       // root node
        int width = 420, height = 420;
        Scene scene = new Scene(root, width,height,Color.LIGHTSKYBLUE);       //width, height and color can be set seperately as well

        stage.setTitle("Epic and Peak Title");
        Image icon = new Image("car.png");
        stage.getIcons().add(icon);

        //stage.setResizable(false);
        Text txt = new Text("Testing text");

        txt.setX(width/2);
        txt.setY(height/2);
        txt.setFont(Font.font(20));
        txt.relocate(width - txt.getBoundsInParent().getCenterX(),height/2);
        txt.setFill(Color.color(           // random color
                (double) Math.random(),
                (double) Math.random(),
                (double) Math.random())
        );



        // random triangle generation

//        double x1 = (Math.random() * 420) % 420;
//        double x2 = (Math.random() * 420) % 420;
//        double x3 = (Math.random() * 420) % 420;
//        double y1 = (Math.random() * 420) % 420;
//        double y2 = (Math.random() * 420) % 420;
//        double y3 = (Math.random() * 420) % 420;
//
//        Line v1 = new Line();
//        v1.setStartX(x1); v1.setStartY(y1); v1.setEndX(x2); v1.setEndY(y2);
//
//        Line v2 = new Line();                                                   // check out other methods for Line
//        v2.setStartX(x2); v2.setStartY(y2); v2.setEndX(x3); v2.setEndY(y3);
//
//        Line v3 = new Line();
//        v3.setStartX(x3); v3.setStartY(y3); v3.setEndX(x1); v3.setEndY(y1);
//


        Polygon triangle = new Polygon();

        for(int i = 0; i < 6; ++i){             // random location
            triangle.getPoints().add(i,(double) (Math.random() * 420) % 420);
        }

        triangle.setFill(Color.color(
                (double) Math.random(),
                (double) Math.random(),
                (double) Math.random())
        );



       // image node

       Image img = new Image("dreamybull.jpg");
       ImageView view = new ImageView(img);

       view.setX(100);
       view.setY(100);
       view.setFitHeight(420 - view.getX());
       view.setFitWidth(420 - view.getY());






        var nodes = root.getChildren();
////        nodes.add(v1);
////        nodes.add(v2);
////        nodes.add(v3);
        nodes.add(view);
        nodes.add(triangle);
        nodes.add(txt);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}