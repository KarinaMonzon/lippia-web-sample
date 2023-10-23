package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.MyAccountConstants.*;

public class MyAccountService {
    public static void login (String user, String password){
        WebActionManager.setInput(USERNAME,user);
        WebActionManager.setInput(PASSWORD,password);
        WebActionManager.click(LOGIN_BUTTON);
    }
    public static void verifiedlogin(){
        Assert.assertTrue(WebActionManager.isPresent(TEXT_LOGIN));
    }
    public static void validmessagerlogin(String messageerror){
        String locatormessager =  MESSEGER_ERROR.replace("%s", messageerror);
        Assert.assertFalse(WebActionManager.isPresent(locatormessager));
    }

}
