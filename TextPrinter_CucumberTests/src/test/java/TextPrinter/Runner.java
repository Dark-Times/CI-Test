package TextPrinter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:format"},
        features = "src/test/resources/TextPrinter/default_response.feature",
        glue = {"TextPrinter"})
public class Runner {


}
