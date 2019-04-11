/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management;

import javafx.application.Platform;
import javax.swing.JApplet;
import javax.swing.SwingUtilities;

/**
 *
 * @author ayush guptA
 */
public class HotelManagement extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    @Override
    public void init() {
        // create JavaFX scene
        Platform.runLater(new Runnable() {
            
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    
}
