package com.example.proyecto_final;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;


public class ATableroController {



    @FXML
    private Button volveratras;
    @FXML
    private Button siguiente;






    @FXML
    protected void initialize() {

    }


    @FXML
    protected void clickVolver() {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(AMenu.class.getResource("menuprueba.fxml"));
        try {

            Scene scene = new Scene(fxmlLoader.load(), 800, 500);
            stage.setTitle("Pantalla Inicio");
            stage.setScene(scene);
            stage.show();
            Stage ventanaActual = (Stage) volveratras.getScene().getWindow();
            ventanaActual.close();


        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @FXML
    protected void clickSiguiente() {
        Spinner<Integer> spinnerA = new Spinner<>(1,100,5);
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(AMenu.class.getResource("partida.fxml"));
        try{
            Scene scene = new Scene(fxmlLoader.load(), 800, 500);
            stage.setTitle("Partida");
            stage.setScene(scene);
            stage.show();
            Stage ventanaActual = (Stage) siguiente.getScene().getWindow();
            ventanaActual.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }























}



