package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import static lippia.web.constants.MyAccountConstants.MESSEGER_ERROR;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;

public class ShopService  {

    public static void go(){
        WebActionManager.navigateTo("https://practice.automationtesting.in/");
    }
    public static void verifyPage(){
        Assert.assertTrue(ActionManager.waitPresence(FILTER_BY_PRICE_LABEL).isDisplayed());
    }
    public static void  categoryProducto(){
        WebActionManager.click(PRODUCT_CATEGORY);
    }
    public static void verifyProducto(){
        Assert.assertTrue(ActionManager.isPresent(VIEW_PRODUCT));
    }


    public static void dropdownsalec( String categoria){
        String categorySelec = SELECTION_DROPDOWN.replace("%s", categoria);
        Assert.assertTrue(WebActionManager.isPresent(categorySelec));
        WebActionManager.dragAndDrop(categorySelec,categoria);
        WebActionManager.click(DEFAULT_SORTING);
    }

    public static void validacioncategory(){

    }

}

