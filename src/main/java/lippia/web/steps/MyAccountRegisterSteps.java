package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MyAccountRegisterService;
import lippia.web.services.ShopService;
import org.testng.Assert;

import static lippia.web.constants.MyAccountConstants.*;


public class MyAccountRegisterSteps extends PageSteps {
    @When("the client registered (.*) and (.*) correct")
    public void theClientRegisteredAndCorrect(String email, String pass) {
        MyAccountRegisterService.Registration(email,pass);
    }

    @When("the client registered (.*) and (.*) incorrect")
    public void theClientRegisteredAndIncorrect(String email, String pass) {
        MyAccountRegisterService.Registration(email, pass);
    }

    @Then("the client must visualize a warning (.*)")
    public void theClientMustVisualizeAWarning(String error) {
        MyAccountRegisterService.invalidmMssageRegitration(error);
    }
}
