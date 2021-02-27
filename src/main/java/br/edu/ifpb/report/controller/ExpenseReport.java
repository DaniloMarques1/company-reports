package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends Report {

    // @@@
    private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();

    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    @Override
    public void executeDatabaseQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.runQuery(query);
    }

    @Override
    public void convertToFile() {
        System.out.println("Converting To XLS...");
    }

}
