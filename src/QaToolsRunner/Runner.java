package QaToolsRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"pretty"},
		features= "src/QaToolsfeatures")
		
		
public class Runner {

}
		



