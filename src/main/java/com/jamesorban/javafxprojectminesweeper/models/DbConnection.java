package com.jamesorban.javafxprojectminesweeper.models;


import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    public PasswordField password;
    public TextField email;
    public TextField name;

    public static void writeToDatabase(String userName, String userEmail, String userPassword){
        String url = "jdbc:postgresql://localhost:5433/minesweeper";
        String user = "postgres";
        String password = "postgres";

        String name = userName;
        String email = userEmail;
        String pass = userPassword;

        String query = "INSERT INTO users(id, username, email, password) VALUES(?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement(query)){
            pst.setString(1, userName);
            pst.setString(2, email);
            pst.setString(3, pass);
            pst.executeUpdate();
            System.out.println("successfully created");
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(DbConnection.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

    }

    public void getData(ActionEvent actionEvent) {
    }
}
