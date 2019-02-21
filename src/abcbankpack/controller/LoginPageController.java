
package abcbankpack.controller;

import abcbankpack.view.LoginPage1;
import javax.swing.JFrame;

public class LoginPageController {
    
    public static JFrame view()
    {
      LoginPage1 loginPage =  new LoginPage1();
      loginPage.setVisible(true);
      loginPage.setLocationRelativeTo(null);
      return loginPage;
    }
    
}
