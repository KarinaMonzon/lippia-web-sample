package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.testng.Assert;


import static lippia.web.constants.LoginConstants.*;

public class LoginService  {


    public static void login (String user, String pass){
        WebActionManager.setInput(USERNAME,user);
        WebActionManager.setInput(PASSWORD,pass);
        WebActionManager.click(BUTTON_LOGIN);
    }
    public static void messegeLogin(String message){
        String locatormessager =  MESSEGER_ERROR.replace("%s", message);
        Assert.assertTrue(locatormessager.contains(message));
    }
    public static void verifiedLogin (){
        Assert.assertTrue(WebActionManager.isPresent(TEXT_LOGIN));
    }
    public static void nextTab (){
        WebActionManager.click(HOME);

    }
    public static void navigateBack (){
        DriverManager.getDriverInstance().getWrappedDriver().navigate().back();
    }

}
