package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnector;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends Report {

    // factory
    @Override
    protected DatabaseConnector getConnector() {
        return new MysqlDatabaseConnector();
    }

    @Override
    public void runDatabaseQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.runQuery(query);
    }

    @Override
    public void convertToFile() {
        System.out.println("Converting To PDF...");
    }
}
