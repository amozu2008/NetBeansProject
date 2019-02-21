
package abcbankpack.model;

import java.awt.Image;
import javax.swing.ImageIcon;

public class MyIconImage {
    
    public MyIconImage(){}
    
    public  Image getIconImage()
    {
         ImageIcon LogoImage2 = new ImageIcon(getClass().getResource(
                        "/abcbankpack/imgFol/zt.gif"));
		return LogoImage2.getImage();
               // return im;
    }
    
}
