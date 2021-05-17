/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;

/**
 *
 * @author Javin
 */
public class Calculator extends Application {
    
    public static Calculator window;
    
    private Label screen;
    String screenOne ="";
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CalcScreen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        window = this;
    }

    public static Calculator getWindow(){
        return window;
    }
    
    public String variable (char number){
        screenOne = screenOne + number;
        return screenOne;
    }
    
    public String clear (){
        screenOne = "";
        return screenOne;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
