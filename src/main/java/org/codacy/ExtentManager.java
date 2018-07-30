package org.codacy;

import com.relevantcodes.extentreports.ExtentReports;


public class ExtentManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            //Set HTML reporting file location
            String workingDir = System.getProperty("/Users/brunomedley/Documents/MedleyTeste/ExtentReport");
            extent = new ExtentReports(workingDir + "\\ExtentReports\\ExtentReportResults.html", true);
        }
        return extent;
    }
}

