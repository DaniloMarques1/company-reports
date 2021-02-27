package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends Report {

    // @@@
    private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();


    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.openConnection();
    }

    @Override
    public void executeDatabaseQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.executeQuery(query);
    }

    @Override
    public void convertToFile() {
        System.out.println("Converting To PDF...");
    }
}
