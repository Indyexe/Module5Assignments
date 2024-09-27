package com.example.module5assignments;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FlagOutputs extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // This creates a new instance of a gridpane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(15); //This portion of code sets the horizontal and vertical gap for the pane
        gridPane.setVgap(15);

        // This portion of code loads the images from the resource
        Image flag1 = new Image(getClass().getResourceAsStream("/flag1.gif"));
        Image flag2 = new Image(getClass().getResourceAsStream("/flag2.gif"));
        Image flag6 = new Image(getClass().getResourceAsStream("/flag6.gif"));
        Image flag7 = new Image(getClass().getResourceAsStream("/flag7.gif"));

        /* For the following code below I used the following blog to help me with syntax to help me understand more
        about gridpanes
        https://stackoverflow.com/questions/36652453/javafx-inserting-image-into-a-gridpane
         */
        gridPane.add(new ImageView(flag6), 0, 0); // This would be the top left
        gridPane.add(new ImageView(flag7), 1, 0); // This would be the top right
        gridPane.add(new ImageView(flag2), 0, 1); // This would be the bottom left
        gridPane.add(new ImageView(flag1), 1, 1); // This would be the bottom right


        Scene scene = new Scene(gridPane, 500, 250); //creates a new scene
        stage.setTitle("Different Flags");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); //Flag 6 is 145 x 96 pixels that's why the output looks funny
    }
}

