package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public abstract class Report {
    public void generate() {
        createDatabaseConnection();
        executeDatabaseQuery();
        convertToFile();
    }

    public abstract void createDatabaseConnection();
    // @@@
    //public void createDatabaseConnection() {
    //    System.out.println("Creating Database Connection...");
    //    connector.createConnection();
    //}

    public abstract void executeDatabaseQuery();

    public abstract void convertToFile();
}
