
package abcbankpack.controller;

import abcbankpack.view.EntryForm;
import javax.swing.JFrame;

public class EntryFormController {
    
    public static JFrame view()
    {
        EntryForm  ef = new EntryForm();
        ef.setVisible(true);
        ef.setLocationRelativeTo(null);
        return ef;
    }
}
