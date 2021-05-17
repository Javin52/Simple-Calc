/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

/**
 *
 * @author Javin
 */
public class CalculatorController implements Initializable {
    
    Calculator calcwindow;
    
    String screenClear;
    String screenTwo;
    Double numberOne;
    String function = "";
    double total;
    double clearCount;
    String totalWord = "";
    
    @FXML
    private Label screen;
    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button multiply;
    @FXML
    private Button divide;
    @FXML
    private Button addition;
    @FXML
    private Button subtraction;
    @FXML
    private Button clear;
    @FXML
    private Button decimal;
    
    @FXML 
    private void clear (ActionEvent event){
        calcwindow = Calculator.getWindow();
        function = "";
        screen.setText("");
        total = 0;
        totalWord="";
        screenTwo = "";
        numberOne = 0.;
        screenClear = calcwindow.clear();
    }
    
    @FXML 
    private void zero (ActionEvent event){
        screenTwo = calcwindow.variable('0');
        screen.setText(screenTwo);
    }
    
    @FXML 
    private void one (ActionEvent event){
        screenTwo = calcwindow.variable('1');
        screen.setText(screenTwo);
    }
    
    @FXML 
    private void two (ActionEvent event){
        screenTwo = calcwindow.variable('2');
        screen.setText(screenTwo);
    }
    
    @FXML 
    private void three (ActionEvent event){
        screenTwo = calcwindow.variable('3');
        screen.setText(screenTwo);
    }
    
    @FXML 
    private void four (ActionEvent event){
        screenTwo = calcwindow.variable('4');
        screen.setText(screenTwo);
    }
    
    @FXML 
    private void five (ActionEvent event){
        screenTwo = calcwindow.variable('5');
        screen.setText(screenTwo);
    }
    
    @FXML 
    private void six (ActionEvent event){
        screenTwo = calcwindow.variable('6');
        screen.setText(screenTwo);
    }
    
    @FXML 
    private void seven (ActionEvent event){
        screenTwo = calcwindow.variable('7');
        screen.setText(screenTwo);
    }
    
    @FXML 
    private void eight (ActionEvent event){
        screenTwo = calcwindow.variable('8');
        screen.setText(screenTwo);
    }
    
    @FXML 
    private void nine(ActionEvent event){
        screenTwo = calcwindow.variable('9');
        screen.setText(screenTwo);
    }
    
    @FXML 
    private void decimal(ActionEvent event){
        screenTwo = calcwindow.variable('.');
        screen.setText(screenTwo);
        }
    
    @FXML
    private void addition(ActionEvent event){
        numberOne = Double.parseDouble(screenTwo);
        screenClear = calcwindow.clear();
        screen.setText("+");
        function = "add";
        
    }
    
    @FXML 
    private void subtract (ActionEvent event){
        numberOne = Double.parseDouble(screenTwo);
        screenClear = calcwindow.clear();
        screen.setText("-");
        function = "subtract";
    }
    
    @FXML
    private void multiply (ActionEvent event){
        numberOne = Double.parseDouble(screenTwo);
        screenClear = calcwindow.clear();
        screen.setText("x");
        function = "multiply";
    }
    
    @FXML 
    private void divide (ActionEvent event){
        numberOne = Double.parseDouble(screenTwo);
        screenClear = calcwindow.clear();
        screen.setText("÷");
        function = "divide";
        
    }
    
    @FXML
    private void equal (ActionEvent event){
      if (function.equals("add")){
        total = numberOne + Double.parseDouble(screenTwo); 
        totalWord = Double.toString(total);
        screen.setText(totalWord);
      }
      
      else if (function.equals("subtract")){
        total = numberOne - Double.parseDouble(screenTwo);  
        totalWord = Double.toString(total);
        screen.setText(totalWord);
      }  
      
      else if (function.equals("multiply")){
        total = numberOne * Double.parseDouble(screenTwo);  
        totalWord = Double.toString(total);
        screen.setText(totalWord);
      }
      
      else if (function.equals("divide")){
        total = numberOne / Double.parseDouble(screenTwo); 
        totalWord = Double.toString(total);
        screen.setText(totalWord);
      } 
    }
    
    @FXML
    private void percent (ActionEvent event){
        
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        screen.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
