package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.SuperiorBarNavigationBarService;
import lippia.web.services.MyAccountService;

public class MyAccountSteps  extends PageSteps {


    @When("the client click on My Account menu")
    public void theClientClickOnMyAccountMenu() {
        SuperiorBarNavigationBarService.myAccountmenu();
    }

    @When("the client logs in with (.*) and (.*) valid credentials")
    public void theClientLogsInWithAndValidCredentials(String user, String pass){
        MyAccountService.login(user,pass);
    }

    @Then("the client is successfully logged in to the website")
    public void theClientIsSuccessfullyLoggedInToTheWebsite() {
        MyAccountService.verifiedLogiValid();
    }

    @When("the client logs in with  (.*) and (.*) invalid credentials")
    public void theClientLogsInWithAndInvalidCredentials(String user, String pass) {
        MyAccountService.login(user,pass);
    }

    @Then("the client must visualize (.*)d will be prompted to enter again")
    public void theClientMustVisualizeAndWillBePromptedToEnterAgain(String message) {
        MyAccountService.invalidMessagerLogin(message);
    }
}

