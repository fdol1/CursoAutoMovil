package curso.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/resources/features/AbrirApp.feature"},
        tags = {"@AbrirApp"},
        glue = {"curso.stepsdefinitions"},
        snippets = SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerAbrirApp { }