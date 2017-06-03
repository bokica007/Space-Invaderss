
package space.invaders;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;



public class SpaceFrame extends JFrame {
    
    public SpaceFrame(){
        
        setSize(700,600); // Širina, dužina prozora
        setResizable(false); // Uklanjanje maximize dugmeta
        
        setTitle("Space Invaders"); // Naslov
        setLocationRelativeTo(null); // Postavljanje prozora na centar ekrana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
        
    }
    
    
}
