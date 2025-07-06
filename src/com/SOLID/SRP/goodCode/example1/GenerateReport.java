package com.SOLID.SRP.goodCode.example1;

import com.SOLID.SRP.goodCode.example1.ReportGeneratorService;

public class GenerateReport {
    ReportGeneratorService report;

    GenerateReport(ReportGeneratorService report) {
        this.report = report;
    }

    public  void generateReport() {
        System.out.println(report.generateReport());
    }
}
