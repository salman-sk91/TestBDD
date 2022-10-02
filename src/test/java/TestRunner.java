import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/htmlFile/result.html","json:jsonFiles/cucumber-json-report.json"},
        features = "src/test/resources/features",
        glue = {"steps"},
        dryRun = false,
        tags = "@L2"
)
public class TestRunner {


}

