package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static lippia.web.constants.HomeConstants.*;


public class HomeService {

    public static void go(){
        WebActionManager.navigateTo("https://practice.automationtesting.in/");
    }
    public static void clickImage(){
        WebActionManager.click(IMAGE_ARRIVALS);
    }

    public static void addBasket(){
        WebDriver driver = DriverManager.getDriverInstance();
        Actions builder = new Actions(driver);
        WebElement elem = ActionManager.getElement("xpath://*[contains(text(),'Add to basket')]");
        builder.moveToElement(elem).click().build().perform();
    }
    public static void procesOrder (String button,String buttonDos){
        WebActionManager.click(VIEW_BASKET, button);
        WebActionManager.click(PROCED_TO_CHEAOCHOUT, buttonDos);
    }

}
