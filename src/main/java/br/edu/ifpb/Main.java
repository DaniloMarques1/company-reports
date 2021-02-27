package br.edu.ifpb;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;
import br.edu.ifpb.report.service.ReportService;

public class Main {

    public static void main(String[] args) {
        ReportService reportService = new ReportService();
        reportService.generateReport(new ExpenseReport());
        reportService.generateReport(new TaxReport());
    }

}
