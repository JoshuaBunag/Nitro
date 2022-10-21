package com.zure.nitro;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Stop;

public class MainController {
    @FXML
    private Label welcomeText;
    private Button close;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onCloseApp() {
       Platform.exit();
    }
}