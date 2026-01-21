
package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue = "stepsDefinitions",
        tags = "@Pesquisa",
        plugin = {
                "pretty",
                "html:target/cucumber-report",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)
public class CT_PesquisaProdutoTest {
}
