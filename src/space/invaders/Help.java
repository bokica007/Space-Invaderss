
package space.invaders;


   import java.awt.Color;
   import java.awt.HeadlessException;
   import javax.swing.JButton;
   import javax.swing.JFrame;
   import javax.swing.JLabel;
   import javax.swing.JTextArea;
 
 public class Help extends JFrame {
 
     private JLabel createdBy = new JLabel();
     private JTextArea rulesOfGame = new JTextArea();
 
     public Help() throws HeadlessException {
         this.setTitle("Help");
         this.setSize(262, 300);
         this.setResizable(false);
         this.setAlwaysOnTop(true);
         createdBy.setText("Created by: Bojana Golijan");
         rulesOfGame.setBackground(this.getBackground());
         rulesOfGame.setText("\n\nUse the [SPACE] bar to fire your gun at them\n"
                 + " and blow each ship to pieces.Be careful \n"
                 + "though,because these ships fire back  \n"
                 + "ensure you stay alive as long as possible,hide\n"
                 + "behind the walls.");
         rulesOfGame.setBounds(0, 0, 262, 248);
         rulesOfGame.setEditable(false);
 
         createdBy.setVerticalAlignment(JLabel.BOTTOM);
         createdBy.setHorizontalAlignment(JLabel.RIGHT);
         add(rulesOfGame);
         add(createdBy);
     }
 
 }
