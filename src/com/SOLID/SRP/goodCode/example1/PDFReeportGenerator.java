package com.SOLID.SRP.goodCode.example1;

import com.SOLID.SRP.goodCode.example1.ReportGeneratorService;

public class PDFReeportGenerator implements ReportGeneratorService {
    @Override
    public String generateReport() {
        return "PDF Report";
    }
}
