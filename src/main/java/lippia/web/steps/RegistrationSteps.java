package lippia.web.steps;


import com.crowdar.core.PageSteps;
import io.cucumber.java.en.When;
import lippia.web.services.RegistrationService;


public class RegistrationSteps extends PageSteps {

    @When("The client registered (.*) and (.*) incorrect")
    public void theClientRegisteredAndIncorrect(String email, String pass) {
        RegistrationService.registration(email,pass);
    }
}
