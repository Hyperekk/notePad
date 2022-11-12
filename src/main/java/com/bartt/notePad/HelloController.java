package com.bartt.notePad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.LocalTime;

public class HelloController {
    public TextArea txt2;
    public TextField txt1;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void menuOption1Clck(ActionEvent actionEvent) {
    }

    public void menuOption1_1Clck(ActionEvent actionEvent)
    {

    }

    public void menuOption1_2Clck(ActionEvent actionEvent)
    {

    }

    public void menuOption2Clck(ActionEvent actionEvent)
    {

    }

    public void menuOption2_1Clck(ActionEvent actionEvent)
    {
        String content = txt2.getText();
        content = content.toUpperCase();
        txt2.setText(content);
    }

    public void menuOption2_2Clck(ActionEvent actionEvent)
    {
        String content = txt2.getText();
        content = content.toLowerCase();
        txt2.setText(content);
    }

    public void menuOption3Clck(ActionEvent actionEvent)
    {

    }

    public void menuOption3_1Clck(ActionEvent actionEvent)
    {
        String content = txt2.getText();
        content = String.format("%s \nGodzina: %s", content, LocalTime.now());
        txt2.setText(content);
    }

    public void menuOption3_2Clck(ActionEvent actionEvent)
    {
        String content = txt2.getText();
        content = String.format("%s \nData: %s", content, LocalDate.now());
        txt2.setText(content);
    }

    public void menuOption3_3Clck(ActionEvent actionEvent)
    {

    }

    public void menuOption3_4Clck(ActionEvent actionEvent)
    {

    }
}