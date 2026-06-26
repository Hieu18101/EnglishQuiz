package com.tmh.quizapp;

import com.tmh.quizapp.themes.DefaultFactory;
import com.tmh.quizapp.themes.LightFactory;
import com.tmh.quizapp.themes.ThemeManager;
import com.tmh.quizapp.themes.ThemeTypes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import utils.MyAlertSingleton;
import utils.MyStageSingelton;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void manageQuestions(ActionEvent e){
        MyStageSingelton.getInstance().showStage("question");
    }
    
    public void praticeQuestions(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("Comingsoon...");
    }
    
    public void takeExam(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("Comingsoon...");
    }
    
    public void changeTheme(ActionEvent e){
        this.cbThemes.getSelectionModel().getSelectedItem().updateTheme(this.cbThemes.getScene());
    }

    
}
