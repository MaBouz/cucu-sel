package sesame.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		//strict = true,
        features = {"src/test/java"},
        glue = {""},
        plugin = {"json:target/cucumber.json"}
)
public class TpCucumberSeleniumApplicationTests {



}
