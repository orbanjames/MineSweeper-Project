package com.jamesorban.javafxprojectminesweeper.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ButtonController {

    @FXML// fx:id="Cancel"
    private Button cancelButton;

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'BoardView.fxml'.";
    }

    public void cancelButtonOnAction(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
