//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report"},
        features = {"classpath:features/"},
        glue = {"stepsDefinitions"},
        tags = "@LoginSite",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)
class CT_Login_Sucesso {
}
