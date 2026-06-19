package com.tmh.quizapp;

import com.tmh.quizapp.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import utils.MyAlertSingleton;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void manageQuestions(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("Comingsoon...");
    }
    
    public void praticeQuestions(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("Comingsoon...");
    }
    
    public void takeExam(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("Comingsoon...");
    }
    
    public void changeTheme(ActionEvent e){
        switch(this.cbThemes.getSelectionModel().getSelectedItem()){
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
                break;
            case LIGHT:
                                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                break;
            default:
                                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("Style.css").toExternalForm());
                    break;
        }
    }

    
}
