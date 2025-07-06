package com.SOLID.SRP.goodCode.example1;

public class Main {
    public static void main(String[] args) {

        GenerateReport PDFReport = new GenerateReport(new PDFReeportGenerator());
        PDFReport.generateReport();
    }
}
