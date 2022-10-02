import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.presentation.PresentationMode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Reporter {

    public static void main(String[] args) {
        generateReport();
    }
    public static void  generateReport(){
        File reportOutputDirectory = new File("htmlReport");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(System.getProperty("user.dir") + "\\jsonFiles\\cucumber-json-report.json");
        //jsonFiles.add("cucumber-report-2.json");

        String buildNumber = "1";
        String projectName = "cucumberProjectSalman";

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
// optional configuration - check javadoc for details
        configuration.addPresentationModes(PresentationMode.RUN_WITH_JENKINS);
// do not make scenario failed when step has status SKIPPED
        //configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
        configuration.setBuildNumber(buildNumber);
// addidtional metadata presented on main page
        configuration.addClassifications("Platform", "Windows");
        configuration.addClassifications("Browser", "Firefox");
        configuration.addClassifications("Branch", "release/1.0");

// optionally add metadata presented on main page via properties file
       /* List<String> classificationFiles = new ArrayList<>();
        classificationFiles.add("properties-1.properties");
        classificationFiles.add("properties-2.properties");
        configuration.addClassificationFiles(classificationFiles);*/

// optionally specify qualifiers for each of the report json files
 /*       configuration.addPresentationModes(PresentationMode.PARALLEL_TESTING);
        configuration.setQualifier("cucumber-report-1","First report");
        configuration.setQualifier("cucumber-report-2","Second report");*/

        ReportBuilder reportBuilder=new ReportBuilder(jsonFiles,configuration);
        Reportable result=reportBuilder.generateReports();
// and here validate 'result' to decide
        System.out.println(result);
    }
}
