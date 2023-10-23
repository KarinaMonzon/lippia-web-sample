package lippia.web.constants;

import lippia.web.services.MyAccountService;

public class MyAccountConstants extends MyAccountService {
    public static final String USERNAME = "xpath://*[@id='username']";

    public static final String PASSWORD = "xpath://*[@id='password']";

    public static final String LOGIN_BUTTON = "xpath://*[@id='customer_login']/div[1]/form/p[3]/input[3]";
    public static final String TEXT_LOGIN = "xpath://*[@id='page-36']/div/div[1]/div/p[1]/strong";

    public static final String MESSEGER_ERROR = "xpath://*[contains(text(),'%s')]";

    public static final  String EMAIL_REGISTRATION = "xpath://*[@id='reg_email']";

    public static final  String PASSWORD_REGISTRATION = "xpath://*[@id='reg_password']";

    public static final String REGISTER_BUTTON = "xpath://*[@id='customer_login']/div[2]/form/p[3]/input[3]";
}
