package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import static lippia.web.constants.ShopConstants.*;



public class ShopService {

    public static void addProductoShopping(){
        ActionManager.click(PRODUCT_SHOP);
        ActionManager.waitPresence(PRODUCT_SHOP);
    }
}
