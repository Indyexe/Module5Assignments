package com.example.module5assignments;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ColorMouse extends Application {
    @Override
    public void start(Stage mainStage) {
        Circle circle = new Circle(40, Color.WHITE); // creates a circle with a radius of 40

        //Sets the circle in the middle of the screen
        circle.setCenterX(150);
        circle.setCenterY(150);


        /* This portion of code uses the OnMousePressed Method to change the color of the circle
        I used the following pdf to help me with this portion of code https://www3.cs.stonybrook.edu/~pfodor/courses/CSE114/L15-EventDrivenProgrammingInJavaFX.pdf
         */
        circle.setOnMousePressed(event -> circle.setFill(Color.BLACK));
        circle.setOnMouseReleased(event -> circle.setFill(Color.WHITE));

        Pane root = new Pane(circle); // Use Pane to position the circle
        Scene scene = new Scene(root, 300, 300); // Create a scene with size 300x300

        mainStage.setTitle("Color Mouse On Off");
        mainStage.setScene(scene);
        mainStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

