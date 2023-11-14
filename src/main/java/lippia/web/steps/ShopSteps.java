package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;


public class ShopSteps extends PageSteps {


    @Given( "The client click on Shop menu" )
    public void theClientTapOnShop() {
        SuperiorBarNavigationBarService.shopMenu();
    }

    @When("The client add any of the product available")
    public void theClientAddAnyOfTheProductAvailable() {
        ShopService.addProductoShopping();
        
    }

    @And("The client clicked in link {string} to go payment page")
    public void theClientClickedInLinkToGoPaymentPage(String arg0) {
        SuperiorBarNavigationBarService.ShoppingMenu();
    }
}
