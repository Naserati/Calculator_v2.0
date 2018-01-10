package sample;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button zero;
    public Button point;
    public Button equals;
    public Button plus;
    public Button minus;
    public Button multiply;
    public Button divide;
    public Button procent;
    public Button plusminus;
    public Button clear;
    public TextField input;
    public Label prom;

    private boolean start;
    private double fnumber;
    private double snumber;
    private String operation;
    @FXML
    public void point_click(){
        String oldvalue = input.getText();
        String set = ".";
        input.setText(oldvalue + set);
    }
    public void one_click(){
        if(start == true){
            input.setText("");
            start = false;
        }
        String oldvalue = input.getText();
        String set = "1";
        input.setText(oldvalue + set);
    }
    public void two_click(){
        if(start == true){
            input.setText("");
            start = false;
        }
        String oldvalue = input.getText();
        String set = "2";
        input.setText(oldvalue + set);
    }
    public void three_click(){
        if(start == true){
            input.setText("");
            start = false;
        }
        String oldvalue = input.getText();
        String set = "3";
        input.setText(oldvalue + set);
    }
    public void four_click(){
        if(start == true){
            input.setText("");
            start = false;
        }
        String oldvalue = input.getText();
        String set = "4";
        input.setText(oldvalue + set);
    }
    public void five_click(){
        if(start == true){
            input.setText("");
            start = false;
        }
        String oldvalue = input.getText();
        String set = "5";
        input.setText(oldvalue + set);
    }
    public void six_click(){
        if(start == true){
            input.setText("");
            start = false;
        }
        String oldvalue = input.getText();
        String set = "6";
        input.setText(oldvalue + set);
    }
    public void seven_click(){
        if(start == true){
            input.setText("");
            start = false;
        }
        String oldvalue = input.getText();
        String set = "7";
        input.setText(oldvalue + set);
    }
    public void eight_click(){
        if(start == true){
            input.setText("");
            start = false;
        }
        String oldvalue = input.getText();
        String set = "8";
        input.setText(oldvalue + set);
    }
    public void nine_click(){
        if(start == true){
            input.setText("");
            start = false;
        }
        String oldvalue = input.getText();
        String set = "9";
        input.setText(oldvalue + set);
    }
    public void zero_click(){
        if(start == true){
            input.setText("");
            start = false;
        }
        String oldvalue = input.getText();
        String set = "0";
        input.setText(oldvalue + set);
    }
    public void plus_click(){
        try {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            this.fnumber = valuenumber;
            input.setText("");
            prom.setText(valuenumber + "+");
            operation = "+";
        }
        catch(Exception e){}
    }
    public void minus_click(){
        try {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            this.fnumber = valuenumber;
            input.setText("");
            prom.setText(valuenumber + "-");
            operation = "-";
        }
        catch(Exception e){}
    }
    public void multiply_click(){
        try {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            this.fnumber = valuenumber;
            input.setText("");
            prom.setText(valuenumber + "×");
            operation = "*";
        }
        catch(Exception e){}
    }
    public void divide_click(){
        try {
            String value = input.getText();
            double valuenumber = Double.parseDouble(value);
            this.fnumber = valuenumber;
            input.setText("");
            prom.setText(valuenumber + "÷");
            operation = "/";
        }
        catch(Exception e){}
    }
    public void procent_click(){
        try {
            String value = input.getText();
            double valueprocent = Double.parseDouble(value);
            input.setText(String.valueOf(valueprocent / 100));
            start = true;
        }
        catch(Exception e){}
    }
    public void plusminus_click(){
        try {
            String value = input.getText();
            double num = Double.parseDouble(value) * (-1);
            input.setText(String.valueOf(num));
        }
        catch(Exception e){}
    }
    public void clear_click(){
        input.setText("");
        prom.setText("");
        this.fnumber = 0;
        this.snumber = 0;

    }
    public void equals_click(){
        start = true;
    try {
        switch (operation) {
           case "+":
            String valuep = input.getText();
            this.snumber = Double.parseDouble(valuep);
            double systemp = this.fnumber + this.snumber;
            input.setText(String.valueOf(systemp));
            String oldpromp = prom.getText();
            prom.setText(oldpromp + snumber);
            break;
          case "-":
            String valuem = input.getText();
            this.snumber = Double.parseDouble(valuem);
            double systemm = this.fnumber - this.snumber;
            input.setText(String.valueOf(systemm));
            String oldpromm = prom.getText();
            prom.setText(oldpromm + snumber);
            break;
          case "*":
            String valuemu = input.getText();
            this.snumber = Double.parseDouble(valuemu);
            double systemmu = this.fnumber * this.snumber;
            input.setText(String.valueOf(systemmu));
            String oldprommu = prom.getText();
            prom.setText(oldprommu + snumber);
            break;
          case "/":
            String valued = input.getText();
            this.snumber = Double.parseDouble(valued);
            double systemd = this.fnumber / this.snumber;
            input.setText(String.valueOf(systemd));
            String oldpromd = prom.getText();
            prom.setText(oldpromd + snumber);
            break;
         }
    }
        catch (Exception e){}

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

