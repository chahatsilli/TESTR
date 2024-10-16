package com.example.test1b;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {



    public TextField usernamesss;
    public TextField userpasswordsss;
    public Label welcomeText;


    private int failedAttempts=0;

    public void login(ActionEvent actionEvent) {
        String username = usernamesss.getText();
        String password = userpasswordsss.getText();

        // Implement authentication logic here

        if (username.isEmpty() || password.isEmpty()) {
            showAlert("enter Username and Password");
        }

            if (failedAttempts >= 5) {
                showAlert("Sorry, Your Account is Locked!!!");
                return;

        } else if (username.equals("YOUR_NAME") && password.equals("456")) {
            showAlert("Success!!!");
                failedAttempts = 0;
        } else {
            failedAttempts++;
            showAlert("Sorry, Invalid Username or Password");
        }

        // Implement account locking logic if needed
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.showAndWait();
    }

}