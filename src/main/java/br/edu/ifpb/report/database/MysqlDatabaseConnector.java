package br.edu.ifpb.report.database;

public class MysqlDatabaseConnector implements DatabaseConnector {

    public void openConnection() {
        System.out.println("Create mysql connetion");
    }

    public void runQuery(String query) {
        System.out.println("Run SQL query");
    }

}
