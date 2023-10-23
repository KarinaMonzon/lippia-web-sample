package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;


public class SuperiorBarNavigationBarService extends ActionManager {

    public static void shopmenu(){
        WebActionManager.click(SHOP_MENU_BUTTON);
    }
    public  static void myAccountmenu(){
        WebActionManager.click(MYACCOUNT_MENU_BUTTON);
    }

}
