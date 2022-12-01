package com.example.swingtest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloApplication extends Application {
    private Label label;

    @Override
    public void start(Stage stage){
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setResizable(false);
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setHeight(420);
        stage.setX(50);
        stage.setY(50);

        stage.setScene(scene);
        stage.show();*/
        label = new Label("Welcome");
        label.setTextFill(Color.BLACK);
        Button btn1 = new Button("Say, Hello World");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label.setText("Hello World");
            }
        });

        //StackPane root = new StackPane();
        VBox vBox = new VBox();
        vBox.getChildren().add(label);
        vBox.getChildren().add(btn1);
        vBox.setSpacing(10);

        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox, 300, 300);
        stage.setScene(scene);
        stage.setTitle("First JavaFX Application");
        stage.show();
    }




    public static void main(String[] args) {
        launch();
    }
}