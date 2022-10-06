package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner;

import static java.sql.DriverManager.getConnection;

public class ContactProgram {
    public static void Connection(String login, String password) {

        StringBuilder jdbcURL = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\sTUDENT\\Desktop\\ggg.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jdbcURL.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(jdbcURL);

        try (Connection connection = getConnection("jdbc:postgresql://46.229.214.241:5432/postgres", login, password)) {
            System.out.println("Connected to post");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }



}
