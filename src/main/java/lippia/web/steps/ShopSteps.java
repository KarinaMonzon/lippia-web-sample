package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;
import org.openqa.selenium.WebDriver;

public class ShopSteps extends PageSteps {

    @Given("the client is in practice")
    public void theClientIsInPractice() {
        ShopService.go();
    }

    @Given("the client tap on Shop menu")
    public void theClientTapOnShopMenu() {
       SuperiorBarNavigationBarService.shopmenu();
    }
    @Then("the client see Filter By Price")
    public void theClientSeeFilterByPrice() {
        ShopService.verifyPage();
    }

    @When("the client click any of the product available in the product category")
    public void theClientClickAnyOfTheProductAvailableInTheProductCategory() {
        ShopService.categoryProducto();

    }

    @Then("the client can view only see particular product")
    public void theClientCanViewOnlySeeParticularProduct() {
        ShopService.verifyProducto();
    }

    @When("the user click (.*)")
    public void theUserClickDefaultSorti(String optionSelecc){
        ShopService.dropdownsalec(optionSelecc);
    }

    @Then("the user can views the popular products only")
    public void theUserCanViewsThePopularProductsOnly(){
        ShopService.validacioncategory();
    }
}
