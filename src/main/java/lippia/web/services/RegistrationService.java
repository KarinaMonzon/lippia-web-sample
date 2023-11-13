package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import static lippia.web.constants.RegistrationConstants.*;


public class RegistrationService {
    public static void registration(String email, String pass){
        WebActionManager.setInput(EMAIL_REGISTRATION,email);
        WebActionManager.setInput(PASSWORD_REGISTRATION,pass);
        WebActionManager.click(BUTTON_REGISTER);
    }
}
