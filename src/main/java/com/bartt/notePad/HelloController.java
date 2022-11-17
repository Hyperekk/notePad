package com.bartt.notePad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HelloController {
    public TextArea txt2;
    public TextField txt1;
    public DatePicker date1;
    @FXML
    private Label welcomeText;

    public String[] haslo = new String[9];

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void menuOption1Clck(ActionEvent actionEvent)
    {
//
    }

    public void menuOption1_1Clck(ActionEvent actionEvent)
    {
        txt2.clear();

        List<String> fileContent = FileHelper.loadFileContent(txt1.getText());
        if (fileContent == null)
            return;

        fileContent.forEach(line -> txt2.appendText(line + "\n"));
    }

    public void menuOption1_2Clck(ActionEvent actionEvent)
    {
        boolean saveResult = FileHelper.saveFile(txt1.getText(), txt2.getText());
        if (!saveResult)
            return;

        txt2.clear();
    }

    public void menuOption2Clck(ActionEvent actionEvent)
    {
//
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
//
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

    public void menuOption3_3Clck(ActionEvent actionEvent)// nie działa i tutaj nie wiem czemu
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("widok2.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            Stage stage = new Stage();
            stage.setTitle("Hello 2!");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LocalDate date = date1.getValue();

        String content = txt2.getText();
        content = String.format("%s \n: %s", content, date.plusDays(5));
        txt2.setText(content);
    }

    public void menuOption3_4Clck(ActionEvent actionEvent) // nie działa
    {
        Random random = new Random();

        int dlugosc = random.nextInt(9)+1;
        int i = random.nextInt(89) + 33;

        for (int x = 0;x>=dlugosc;x++)
        {
            haslo[dlugosc] =  ""+ (char) i;
            System.out.println(haslo);
        }

        String content = txt2.getText();
        content = String.format("%s \nHasło: %s", content, Arrays.toString(haslo));
        txt2.setText(content);
    }
}