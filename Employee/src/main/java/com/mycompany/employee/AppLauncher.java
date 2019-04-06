/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employee;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Menna Helmy
 */
public class AppLauncher extends Application{
    
    
    
    public static void main(String args[]){
        launch(args);
    
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLBase root = new FXMLBase();
       
        
        Scene scene = new Scene(root, 700, 500);
        
        primaryStage.setTitle("Empolyee Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
