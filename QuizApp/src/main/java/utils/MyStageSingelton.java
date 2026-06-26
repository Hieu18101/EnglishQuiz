/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.tmh.quizapp.App;
import com.tmh.quizapp.themes.ThemeManager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStageSingelton {
    public static MyStageSingelton instance;
    private final Stage stage;
    
    private MyStageSingelton(){
        this.stage= new Stage();
        this.stage.setTitle("Quiz App");
    }
    public static MyStageSingelton getInstance(){
        if(instance== null)
            instance = new MyStageSingelton();
        
        return instance;
    }
    public void showStage(String fxml){
        if(!this.stage.isShowing()) {
            Scene scene;
            try {
                scene= new Scene(new FXMLLoader(App.class.getResource(fxml + ".fxml")).load());
                
                ThemeManager.applyTheme(scene);
                
                this.stage.setScene(scene);
                this.stage.show();
            } catch (IOException ex) {
                Logger.getLogger(MyStageSingelton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
