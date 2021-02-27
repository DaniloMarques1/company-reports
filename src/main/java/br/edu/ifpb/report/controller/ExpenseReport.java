package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends Report {

    // factory
    @Override
    protected DatabaseConnector getConnector() {
        return new PostgreSQLDatabaseConnector();
    }

    @Override
    public void runDatabaseQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.runQuery(query);
    }

    @Override
    public void convertToFile() {
        System.out.println("Converting To XLS...");
    }

}
