package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.DashboardConstants.*;


public class DashboardService {
    public static void account() {
        WebActionManager.click(ACCOUN_DETAILS);
    }

    public static void modifyPassword() {
        String First = " Agustina";
        ActionManager.setInput(Firstname,First);
        String currents = "MarSolLuna1234!!";
        ActionManager.setInput(CURRENTPASS, currents);
        String newpass = "Carolinalopez1802!!";
        ActionManager.setInput(NEWPASS, newpass);
        String confipass = "Carolinalopez1802!!";
        ActionManager.setInput(CONFIRMPASS, confipass);
    }
    public static void logoutSite(){
        ActionManager.click(Logout);
    }
    public static void confirmationLogout(){
        Assert.assertTrue(WebActionManager.isPresent(TEXTO_CORFIMATION));
    }
}
