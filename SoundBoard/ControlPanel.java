import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*; 
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class ControlPanel extends JPanel
{
   private EasySound sound1 = new EasySound("Bruh Sound Effect 2.wav");
   private EasySound sound2 = new EasySound("LaFlame.wav");
   private EasySound sound3 = new EasySound("bells.wav");
   private JButton myButton1,myButton2,myButton3,myButton4, myButton5;
   public ControlPanel()
   {
      setLayout(new BorderLayout());
   
      JButton button1 = new JButton(" La Flame! ");
      button1.addActionListener(new PlayButtonListener());
      myButton1 = button1;
      add(button1, BorderLayout.NORTH);
      
      
      JButton button2 = new JButton(" Bruh! ");
      button2.addActionListener(new PlayButtonListener());
      myButton2 = button2;
      add(button2, BorderLayout.WEST);

      
      JButton button3 = new JButton(" Button 3 ");
      button3.addActionListener(new PlayButtonListener());
      myButton3 = button3;
      add(button3, BorderLayout.EAST);

      
       JButton button4 = new JButton(" Button 4 ");
      button4.addActionListener(new PlayButtonListener());
      myButton4 = button4;
      add(button4, BorderLayout.SOUTH);

      ImageIcon image = new ImageIcon("apple.jpg");
      JButton button5 = new JButton(" Button 5 ", image);
      button5.addActionListener(new PlayButtonListener());
      myButton5 = button5;
      add(button5, BorderLayout.CENTER);
      
   } 
   private class PlayButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e) 
      {
         JButton button = (JButton)e.getSource();
         if (button == myButton1)
         {
            sound2.play();  
         }
         else if (button == myButton2)
         {
            sound1.play();
         }
         else if (button == myButton3)
         {
            sound3.play();
         } 
         else if (button == myButton4)
         {
            sound3.play();
         }
         else if (button == myButton5)
         {
            sound1.play();
         }
      }
   }
   public static void main(String[] args)
   {
       
      JFrame window = new JFrame("ActionListener demo");
      window.setBounds(500, 500, 500, 500);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ControlPanel panel = new ControlPanel();
      window.getContentPane().setLayout(new BorderLayout());
      window.getContentPane().add(panel, BorderLayout.WEST);
      ControlPanel panel2 = new ControlPanel();
      window.getContentPane().add(panel2, BorderLayout.EAST);
      window.setVisible(true);
      
      
      
      
      
      try{
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.NimbusLookAndFeel");
      }
      catch(Exception ex)
      {
      }
   }
}
