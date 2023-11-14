package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;


public class SuperiorBarNavigationBarService extends ActionManager {

    public static void shopMenu(){
        WebActionManager.click( SHOP_MENU_BUTTON );
    }
    public static void myAccountMenu(){
        WebActionManager.click(MYACCOUNT_MENU_BUTTON);
    }
    public static void ShoppingMenu(){
        ActionManager.click(SHOPPING_CART_BUTTON);
    }
}
