/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Menna Helmy
 */
public class DatabaseConfig {

      public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("db.properties");
            
            properties.setProperty("MYSQL_DB_URL", "jdbc:mysql://localhost:3306/schema_arafa");
            properties.setProperty("MYSQL_DB_USERNAME", "root");
            properties.setProperty("MYSQL_DB_PASSWORD", "root");
            
            properties.store(outputStream, null);
        } catch (IOException io) 
        {
            io.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
