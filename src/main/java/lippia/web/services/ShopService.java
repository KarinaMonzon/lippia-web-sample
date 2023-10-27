package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import io.cucumber.java.en.When;
import jdk.internal.logger.SurrogateLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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


    public static void dropdownsalec(String dropdownGategory){
        WebActionManager.setDropdownByValue(DROPDOWN_SORTING,dropdownGategory);
    }

    public static void validacioncategory(String text){
        String url = DriverManager.getDriverInstance().getCurrentUrl();
        Assert.assertTrue(url.contains(text));
    }
}





