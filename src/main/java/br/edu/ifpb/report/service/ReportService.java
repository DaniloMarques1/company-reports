package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.Report;

public class ReportService {

    public void generateReport(Report report) {
        report.generate();
    }

}
