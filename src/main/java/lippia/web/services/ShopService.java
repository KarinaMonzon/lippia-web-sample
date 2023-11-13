package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;
import static lippia.web.constants.ShopConstants.*;

public class ShopService {


    private static final String FILTER_BY_PRICE_LABEL = "xpath://*[@id='woocommerce_price_filter-2']/h4";

    public static void verifyPage() {
        Assert.assertTrue( ActionManager.waitPresence( FILTER_BY_PRICE_LABEL ).isDisplayed() );
    }
}
