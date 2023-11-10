package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;

public class HomeSteps extends PageSteps {

    @Given("The client is in practice")
    public void theClientIsInPractice() {
       HomeService.go();
    }

    @When("The client click on the image in the arrivals")
    public void theClientClickOnTheImageInTheArrivals() {
        HomeService.clickImage();
    }

    @Given("The client adds the book to your basket")
    public void theClientAddsThaBookToYourBasket() {
        HomeService.addBasket();
    }
    @When("The client click on (.*) and now click on (.*)")
    public void theClientClickOnAndNowClickOn(String firstButton, String secondButton) {
        HomeService.procesOrder(firstButton,secondButton);

    }
    @Then("The client has the feasibility to add coupon in the payment and see additional details")
    public void theClientHasTheFeasibilityToAddCouponInThePaymentAndAdditionalDetails() {
    }
    @And("The client can fill his details and can choose any means of payment")
    public void theClientCanFillHisDetailsAndCanChooseAnyMeansOfPayment() {
    }
    @Then("The client on clicking (.*) and navigate to the order confirmation pag")
    public void theClientOnClickingAndNavigateToTheOrderConfirmationPag(String arg0) {

    }

}
