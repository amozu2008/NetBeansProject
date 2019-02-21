
package abcbankpack.controller;

import javax.swing.UIManager;

public class ApplicationMain {

    public static void main(String[] args) {
        
                


      try
      {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
      catch(Exception e)
      {
            System.out.println("Error in setting WLAF"+e);
      }
        
       HomeController.view();

    }
    
}
