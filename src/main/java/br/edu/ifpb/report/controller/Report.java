package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;

public abstract class Report {
    abstract protected DatabaseConnector getConnector();
    protected DatabaseConnector connector;

    public void generate() {
        createDatabaseConnection();
        runDatabaseQuery();
        convertToFile();
    }

    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        this.connector = this.getConnector();
        connector.openConnection();
    }

    abstract public void runDatabaseQuery();

    abstract public void convertToFile();
}
