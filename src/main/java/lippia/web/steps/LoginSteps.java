package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.SuperiorBarNavigationBarService;
import lippia.web.services.LoginService;


public class LoginSteps extends PageSteps {

    @Given("The client click on My Account")
    public void theClientClickOnMyAccount() {
        SuperiorBarNavigationBarService.myAccountMenu();
    }

    @When("The client logs in with (.*) and (.*) changed")
    public void theClientLogsInWithAndChanged(String username, String password) {
        LoginService.login(username,password);
    }

    @Then("The client must visualize a warning (.*)")
    public void theClientMustVisualize(String message) {
        LoginService.messegeLogin(message);
    }

    @And("The client logged in and is heading to another tab")
    public void theClientLoggedInAndIsHeadingToAnotherTab() {
        LoginService.verifiedLogin();
        LoginService.nextTab();
    }
    @Then("The client presses the back button should not log in then he can view the general page")
    public void theClientPressesTheBackButtonShouldNotLogInThenHeCanViewTheGeneralPage(String message) {
    }


}
