package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.MyAccountConstants.*;
import org.testng.Assert;

import static lippia.web.constants.MyAccountConstants.*;


public class MyAccountRegisterService {
    public static void Registration (String email, String password){
        WebActionManager.setInput(EMAIL_REGISTRATION, email);
        WebActionManager.setInput(PASSWORD_REGISTRATION, password);
        WebActionManager.click(REGISTER_BUTTON);
    }

    public static void invalidmMssageRegitration(String error){
        String locatormessagerregister = MESSEGER_ERROR.replace("%s", error);
        Assert.assertTrue(WebActionManager.isPresent(locatormessagerregister));
    }
}
