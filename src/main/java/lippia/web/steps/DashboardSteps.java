package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.DashboardService;
import lippia.web.services.LoginService;

public class DashboardSteps extends PageSteps {
    @When("The client logs in with (.*) and (.*) valid")
    public void theClientLogsInWithAndValid(String user, String pass) {
        LoginService.login(user, pass);
    }

    @And("The client successfully login to the web page")
    public void theClientSuccesgullyLoginToTheWebPage() {
        LoginService.verifiedLogin();
    }

    @And("The client click on {string}")
    public void theClientClickOn(String arg0) {
        DashboardService.account();
    }

    @Then("the client can view account details where he can change his password also")
    public void theClientCanViewAccountDetailsWhereHeCanChangeHisPasswordAlso() {
        DashboardService.modifyPassword();
    }

    @And("The client clicked on (.*)")
    public void theClientClickedOn(String arg0) {
        DashboardService.logoutSite();
    }


    @Then("The client successfully to logout the web page")
    public void theClientSuccessfullyToLogoutTheWebPage() {
        DashboardService.confirmationLogout();
    }
}
