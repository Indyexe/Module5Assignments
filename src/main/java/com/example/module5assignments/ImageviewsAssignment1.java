package com.example.module5assignments;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ImageviewsAssignment1 extends Application {
    public void start(Stage stage) throws IOException {
        Pane pane = new HBox(15);

        Image img = new Image("flag1.gif");
        pane.getChildren().add( new ImageView(img));

        Scene scene = new Scene(pane, 600, 300);
        stage.setTitle("Various Flags");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}