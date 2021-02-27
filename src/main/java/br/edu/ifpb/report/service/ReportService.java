package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;

public class ReportService {

    // @@@ apenas Report?
    //ExpenseReport expenseReport = new ExpenseReport();
    //TaxReport taxReport = new TaxReport();

    //public void generateReport(String type) {
    public void generateReport(Report report) {
        report.generate();
        //if (type.equals("expense")) {
        //    expenseReport.generate();
        //} else {
        //    taxReport.generate();
        //}
    }

}
