
package abcbankpack.controller;

import abcbankpack.view.Home;
import javax.swing.JFrame;

public class HomeController {
    
    public static JFrame view()
    {
       Home home = new Home();
       home.setVisible(true);
       home.setLocationRelativeTo(null);
       return home;
    }
    
}
