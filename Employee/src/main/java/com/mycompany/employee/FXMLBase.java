package com.mycompany.employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javax.sql.DataSource;

public class FXMLBase extends AnchorPane {

    DataSource dataSource;
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    boolean flag = false;
    boolean lastRow=false;
    
    protected final Pane pane;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final TextField textField;
    protected final TextField textField0;
    protected final TextField textField1;
    protected final TextField textField2;
    protected final TextField textField3;
    protected final TextField textField4;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;

    public FXMLBase() {

        pane = new Pane();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        textField2 = new TextField();
        textField3 = new TextField();
        textField4 = new TextField();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();

        setId("AnchorPane");
        setPrefHeight(472.0);
        setPrefWidth(667.0);

        pane.setPrefHeight(472.0);
        pane.setPrefWidth(667.0);

        label.setLayoutX(32.0);
        label.setLayoutY(49.0);
        label.setPrefHeight(31.0);
        label.setPrefWidth(86.0);
        label.setText("ID");

        label0.setLayoutX(32.0);
        label0.setLayoutY(98.0);
        label0.setPrefHeight(31.0);
        label0.setPrefWidth(86.0);
        label0.setText("First Name");

        label1.setLayoutX(32.0);
        label1.setLayoutY(150.0);
        label1.setPrefHeight(31.0);
        label1.setPrefWidth(86.0);
        label1.setText("Middle Name");

        label2.setLayoutX(32.0);
        label2.setLayoutY(205.0);
        label2.setPrefHeight(31.0);
        label2.setPrefWidth(86.0);
        label2.setText("Last Name");

        label3.setLayoutX(24.0);
        label3.setLayoutY(272.0);
        label3.setPrefHeight(31.0);
        label3.setPrefWidth(86.0);
        label3.setText("Email");

        label4.setLayoutX(32.0);
        label4.setLayoutY(330.0);
        label4.setPrefHeight(31.0);
        label4.setPrefWidth(86.0);
        label4.setText("Phone");

        textField.setLayoutX(118.0);
        textField.setLayoutY(55.0);

        textField0.setLayoutX(118.0);
        textField0.setLayoutY(101.0);

        textField1.setLayoutX(118.0);
        textField1.setLayoutY(153.0);

        textField2.setLayoutX(118.0);
        textField2.setLayoutY(208.0);

        textField3.setLayoutX(118.0);
        textField3.setLayoutY(275.0);

        textField4.setLayoutX(118.0);
        textField4.setLayoutY(333.0);

        button.setLayoutX(118.0);
        button.setLayoutY(411.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(25.0);
        button.setPrefWidth(50.0);
        button.setText("New");

        button0.setLayoutX(184.0);
        button0.setLayoutY(411.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(25.0);
        button0.setPrefWidth(61.0);
        button0.setText("Update");

        button1.setLayoutX(263.0);
        button1.setLayoutY(411.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(25.0);
        button1.setPrefWidth(61.0);
        button1.setText("Delete");

        button2.setLayoutX(344.0);
        button2.setLayoutY(411.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(25.0);
        button2.setPrefWidth(61.0);
        button2.setText("First");

        button3.setLayoutX(419.0);
        button3.setLayoutY(411.0);
        button3.setMnemonicParsing(false);
        button3.setText("Pervious");

        button4.setLayoutX(497.0);
        button4.setLayoutY(411.0);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(25.0);
        button4.setPrefWidth(50.0);
        button4.setText("Next");

        button5.setLayoutX(566.0);
        button5.setLayoutY(411.0);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(25.0);
        button5.setPrefWidth(50.0);
        button5.setText("Last");

        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(label1);
        pane.getChildren().add(label2);
        pane.getChildren().add(label3);
        pane.getChildren().add(label4);
        pane.getChildren().add(textField);
        pane.getChildren().add(textField0);
        pane.getChildren().add(textField1);
        pane.getChildren().add(textField2);
        pane.getChildren().add(textField3);
        pane.getChildren().add(textField4);
        pane.getChildren().add(button);
        pane.getChildren().add(button0);
        pane.getChildren().add(button1);
        pane.getChildren().add(button2);
        pane.getChildren().add(button3);
        pane.getChildren().add(button4);
        pane.getChildren().add(button5);
        getChildren().add(pane);
        
        
    }
}
    
    

