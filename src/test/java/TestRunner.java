import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "Utils",
        plugin = {"pretty","html:target/reports.html","json:target/cucumber-json/cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"},
        tags = "@TestSample"
)
public class TestRunner {

}
