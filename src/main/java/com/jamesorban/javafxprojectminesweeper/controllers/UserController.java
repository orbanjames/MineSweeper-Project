package com.jamesorban.javafxprojectminesweeper.controllers;

import com.jamesorban.javafxprojectminesweeper.models.DbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UserController {

    @FXML
    private Button submitButton;
    @FXML
    private TextField email;
    @FXML
    private TextField name;
    @FXML
    private PasswordField password;
 public void getData(ActionEvent actionEvent){
    System.out.println(name.getText());
    System.out.println(email.getText());
    System.out.println(password.getText());
    DbConnection.writeToDatabase(name.getText(), email.getText(), password.getText());
 }

}
