package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import static java.sql.DriverManager.getConnection;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input login");
        String login = scanner.nextLine();

        System.out.println("Input password");
        String password = scanner.nextLine();

        ContactProgram.Connection(login, password);

    }


}
