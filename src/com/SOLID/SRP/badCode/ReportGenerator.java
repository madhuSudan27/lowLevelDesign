package com.SOLID.SRP.badCode;

public class ReportGenerator {

    // now suppose i want to generate a xml report

    public String generateReport(String reportType) {
        if(reportType.equals("pdf")) {
            return "PDF Report";
        }
        else if (reportType.equals("html")) {
            return "HTML Report";
        }
        else if(reportType.equals("csv")) {
            return "CSV Report";
        }
        else if (reportType.equals("word")) {
            return "Word Report";
        }
        else {
            return  "Invalid report type";
        }
    }
}
