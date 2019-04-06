package com.mycompany.employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    protected final TextField txt_id;
    protected final TextField txt_fname;
    protected final TextField txt_mname;
    protected final TextField txt_lname;
    protected final TextField txt_email;
    protected final TextField txt_phone;

    protected final Button btn_new;
    protected final Button btn_update;
    protected final Button btn_delete;
    protected final Button btn_first;
    protected final Button btn_previous;
    protected final Button btn_next;
    protected final Button btn_last;

    public FXMLBase() {

        pane = new Pane();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        txt_id = new TextField();
        txt_fname = new TextField();
        txt_mname = new TextField();
        txt_lname = new TextField();
        txt_email = new TextField();
        txt_phone = new TextField();
        btn_new = new Button();
        btn_update = new Button();
        btn_delete = new Button();
        btn_first = new Button();
        btn_previous = new Button();
        btn_next = new Button();
        btn_last = new Button();

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

        txt_id.setLayoutX(118.0);
        txt_id.setLayoutY(55.0);

        txt_fname.setLayoutX(118.0);
        txt_fname.setLayoutY(101.0);

        txt_mname.setLayoutX(118.0);
        txt_mname.setLayoutY(153.0);

        txt_lname.setLayoutX(118.0);
        txt_lname.setLayoutY(208.0);

        txt_email.setLayoutX(118.0);
        txt_email.setLayoutY(275.0);

        txt_phone.setLayoutX(118.0);
        txt_phone.setLayoutY(333.0);

        btn_new.setLayoutX(118.0);
        btn_new.setLayoutY(411.0);
        btn_new.setMnemonicParsing(false);
        btn_new.setPrefHeight(25.0);
        btn_new.setPrefWidth(50.0);
        btn_new.setText("New");

        btn_update.setLayoutX(184.0);
        btn_update.setLayoutY(411.0);
        btn_update.setMnemonicParsing(false);
        btn_update.setPrefHeight(25.0);
        btn_update.setPrefWidth(61.0);
        btn_update.setText("Update");

        btn_delete.setLayoutX(263.0);
        btn_delete.setLayoutY(411.0);
        btn_delete.setMnemonicParsing(false);
        btn_delete.setPrefHeight(25.0);
        btn_delete.setPrefWidth(61.0);
        btn_delete.setText("Delete");

        btn_first.setLayoutX(344.0);
        btn_first.setLayoutY(411.0);
        btn_first.setMnemonicParsing(false);
        btn_first.setPrefHeight(25.0);
        btn_first.setPrefWidth(61.0);
        btn_first.setText("First");

        btn_previous.setLayoutX(419.0);
        btn_previous.setLayoutY(411.0);
        btn_previous.setMnemonicParsing(false);
        btn_previous.setText("Pervious");

        btn_next.setLayoutX(497.0);
        btn_next.setLayoutY(411.0);
        btn_next.setMnemonicParsing(false);
        btn_next.setPrefHeight(25.0);
        btn_next.setPrefWidth(50.0);
        btn_next.setText("Next");

        btn_last.setLayoutX(566.0);
        btn_last.setLayoutY(411.0);
        btn_last.setMnemonicParsing(false);
        btn_last.setPrefHeight(25.0);
        btn_last.setPrefWidth(50.0);
        btn_last.setText("Last");

        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(label1);
        pane.getChildren().add(label2);
        pane.getChildren().add(label3);
        pane.getChildren().add(label4);
        pane.getChildren().add(txt_id);
        pane.getChildren().add(txt_fname);
        pane.getChildren().add(txt_mname);
        pane.getChildren().add(txt_lname);
        pane.getChildren().add(txt_email);
        pane.getChildren().add(txt_phone);
        pane.getChildren().add(btn_new);
        pane.getChildren().add(btn_update);
        pane.getChildren().add(btn_delete);
        pane.getChildren().add(btn_first);
        pane.getChildren().add(btn_previous);
        pane.getChildren().add(btn_next);
        pane.getChildren().add(btn_last);
        getChildren().add(pane);

        ////////////////////////////////////////////////////////////////////////////////

        try {

            dataSource = DatabaseFactory.getMySQLDataSource();
            connection = dataSource.getConnection();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = statement.executeQuery("select * from clerk");
            resultSet.next();
            if(resultSet.wasNull())
            {
                
            }
            else
            {
            txt_id.setText(resultSet.getInt("id") + "");
            txt_fname.setText(resultSet.getString("fname") + "");
            txt_mname.setText(resultSet.getString("mname") + "");
            txt_lname.setText(resultSet.getString("lname") + "");
            txt_email.setText(resultSet.getString("email") + "");
            txt_phone.setText(resultSet.getInt("phone") + "");  
            }
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        btn_next.setOnAction((event) -> {
            getNext();
        });
        btn_previous.setOnAction((event) -> {
            getPrevious();
        });
        btn_first.setOnAction((event) -> {
            getFirst();
        });
        btn_last.setOnAction((event) -> {
            getLast();
        });
        btn_new.setOnAction((event) -> {
            addNewPerson();
        });
        btn_update.setOnAction((event) -> {
            update();
        });
        btn_delete.setOnAction((event) -> {
            delete();
        });
    }

    ////////////Menna implementation
    private void getNext() 
    {
        try {
            if (resultSet.next()) {
                showData();
            } else {
                resultSet.last();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void getPrevious() 
    {
        try {
            if (resultSet.previous()) {
                showData();
            } else {
                resultSet.first();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void getFirst() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    ////////////////////abdelrahman implementation

    private void getLast() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addNewPerson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void update() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void delete() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    private void showData() {
        try {
            txt_id.setText(resultSet.getInt("id") + "");
            txt_fname.setText(resultSet.getString("fname") + "");
            txt_mname.setText(resultSet.getString("mname") + "");
            txt_lname.setText(resultSet.getString("lname") + "");
            txt_email.setText(resultSet.getString("email") + "");
            txt_phone.setText(resultSet.getInt("phone") + "");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
    
    

