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

    @When("The client click on (.*)check item with price")
    public void theClientClickOnAndNowClickOn(String buttonName) {
        HomeService.viewBasket(buttonName);
    }

    @And("The client now click on {string} aot payment")
    public void theClientNowClickOnAotPayment(String buttonName) {
        HomeService.getInformationCheckout();
        HomeService.proceedCheck(buttonName);
    }

    @Then("The client has the feasibility to add coupon in the payment and see additional details")
    public void theClientHasTheFeasibilityToAddCouponInThePaymentAndAdditionalDetails() {
        HomeService.feasibilityAddCoupon();
        HomeService.textCoupon();
    }

    @And("The client enter (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) and can choose any means of payment")
    public void theClientEnter(String name, String last, String company, String email, String phone, String country, String adress, String city, String state, String postcode) {
        HomeService.billingDetails(name, last, company, email, phone, country, adress, city, state, postcode);
        HomeService.metohodPayment();
    }

    @Then("The client on clicking {string} and navigate to the order confirmation pag")
    public void theClientOnClickingAndNavigateToTheOrderConfirmationPag(String arg0) {
        HomeService.placeOrder();
    }
}
