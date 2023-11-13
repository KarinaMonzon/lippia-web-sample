package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.HomeConstants.*;


public class HomeService extends ActionManager{
    public static void go(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickImage(){
        WebActionManager.click(IMAGE_ARRIVALS);
        Assert.assertTrue(ActionManager.waitPresence(VIEW_PRODUCT).isDisplayed());
    }

    public static void addBasket(){
      ActionManager.click(ActionManager.getElement(ADD_TO_BASKET));
    }
    public static void viewBasket (String firsButton ){
        ActionManager.click(ActionManager.getElement(VIEW_BASKET));
    }
    public static void getInformationCheckout(){
        Assert.assertTrue(ActionManager.waitPresence(BASKET_TOTALS).isDisplayed());
    }
    public static void  proceedCheck(String secondButton ){
       WebActionManager.click(PROCED_TO_CHEAOCHOUT);
    }
    public static void feasibilityAddCoupon(){
        ActionManager.click(ActionManager.getElement(APPLY_COUPON));
    }

    public static void textCoupon(){
        String text = "CROWDAR_ACADEMY2023";
        WebActionManager.setInput(INPUT_COUPON,text);
        Assert.assertTrue(ActionManager.waitPresence(VIEW_BILLING_DETAILS,VIEW_ADDITIONAL_INFORMATION,VIEW_YOUR_ORDER).isDisplayed());
    }
    public static void billingDetails(String name, String last, String company,String email, String phone, String country, String address,String city, String state, String postcode){
       ActionManager.setInput(FIRSTNAME,name);
       ActionManager.setInput(LASTNAME,last);
       ActionManager.setInput(COMAPNYNAME,company);
       ActionManager.setInput(EMAIL,email);
       ActionManager.setInput(PHONE,phone);
       ActionManager.getElementsByParent(COUNTRY,country);
       ActionManager.setInput(ADDRESS,address);
       ActionManager.setInput(CITY,city);
       ActionManager.getElementsByParent(STATE,state);
       ActionManager.setInput(POSTCODE,postcode);
    }
    public static void metohodPayment(){
        ActionManager.click(RADIO_BUTTON);
    }
    public static void placeOrder(){
        WebActionManager.click(PLACE_ORDEN);
        Assert.assertTrue(ActionManager.waitPresence(END_ORDER).isDisplayed());
    }
}

