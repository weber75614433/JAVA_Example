package com.example.swingtest;

import javafx.beans.binding.Binding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    public VBox vbox;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }
    @FXML
    public void onColorButtonClick() {
        vbox.setStyle("-fx-background-color: #808080");

    }
}