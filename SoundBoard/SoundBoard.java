import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*; 
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SoundBoard extends JPanel
{
   /**Fields of the sound effects in each button */
   private EasySound bruh = new EasySound("Bruh Sound Effect 2.wav");
   private EasySound LaFlame = new EasySound("LaFlame.wav");
   private EasySound daniel = new EasySound("DamnDaniel (1).wav");
   private EasySound lebron = new EasySound("LebronJames.wav");
   private EasySound wednesday = new EasySound("It Is Wednesday My Dudes Vine.wav");
   private EasySound sike = new EasySound("sike.wav");
   private EasySound croissant = new EasySound("croissant.wav");
   private EasySound bee = new EasySound("BEE.wav");
   private EasySound str8up = new EasySound("str8up.wav");
   private EasySound itslit = new EasySound("itslit.wav");
   private EasySound yah = new EasySound("yah.wav");
   private EasySound twochainz = new EasySound("2chainz.wav");
   /** Fields for each JButton */
   private JButton myButton1,bruhButton,myButton3,myButton4, myButton5, myButton6,myButton7,myButton8,myButton9,myButton10, myButton11,myButton12;
   /** Field for the JFrame component */
   private static JFrame window; 
   
   /** Constructor for the Sound Board */
   public SoundBoard()
   {
      /** This code sets up the JFrame (window) of the SoundBoard */
      window = new JFrame("SoundBoard");
      window.setBounds(500, 500, 2100, 1000);
      window.setLayout(new GridLayout(2,1));
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
      
      /** Creates the adlib panel, the adlib JLabel, and adds it to window (JFrame) */  
      JPanel adlibs = new JPanel();
      adlibs.setLayout(new GridLayout(1,6));
      window.getContentPane().add(adlibs); //adds adlib panel to main JFrame
      ImageIcon adlibi = new ImageIcon("adlib.png");       
      JLabel adlib = new JLabel("    YAHH");
      adlibs.add(adlib);
      adlib.setIcon(adlibi); //image is added to the JLabel
      
      /** creates vine panel, and vine JLabel, and adds it to window */
      ImageIcon vine = new ImageIcon("vine.png");
      JPanel vines = new JPanel();
      vines.setLayout(new GridLayout(1,6));
      window.getContentPane().add(vines);
      JLabel vinez = new JLabel("    Vines");
      vines.add(vinez);
      vinez.setIcon(vine);
      
      /** In all of these little sections of code, a button is created with a name,
       and an ImageIcon is added to each one*/   
      ImageIcon trav = new ImageIcon("TravisScott.jfif");   
      JButton button1 = new JButton(" La Flame! ", trav);
      button1.addActionListener(new PlayButtonListener()); //makes button interactive
      myButton1 = button1;
      adlibs.add(button1);
      
      ImageIcon be = new ImageIcon("bee.jpg");
      JButton button8 = new JButton(" BEE! ", be);
      button8.addActionListener(new PlayButtonListener());
      myButton8 = button8;
      adlibs.add(button8);
      
      JButton button9 = new JButton(" Straight up! ",trav);
      button9.addActionListener(new PlayButtonListener());
      myButton9 = button9;
      adlibs.add(button9);
      
      ImageIcon fye = new ImageIcon("fye.jfif");
      JButton button10 = new JButton(" IT'S LIT! ",fye);
      button10.addActionListener(new PlayButtonListener());
      myButton10 = button10;
      adlibs.add(button10);
      
      
      JButton button11 = new JButton(" YAH! ",trav);
      button11.addActionListener(new PlayButtonListener());
      myButton11 = button11;
      adlibs.add(button11);
      
      ImageIcon dos = new ImageIcon("two.jfif"); 
      JButton button12 = new JButton(" TWO CHAINZZ! ",dos);
      button12.addActionListener(new PlayButtonListener());
      myButton12 = button12;
      adlibs.add(button12);
      
      
      ImageIcon breh = new ImageIcon("breh.jfif");
      JButton bruh = new JButton(" Bruh! ",breh);
      bruh.addActionListener(new PlayButtonListener());
      bruhButton = bruh;
      vines.add(bruhButton);
   
      ImageIcon dan = new ImageIcon("daniel.jfif");
      JButton button3 = new JButton(" Damn Daniel! ",dan);
      button3.addActionListener(new PlayButtonListener());
      myButton3 = button3;
      vines.add(button3);
   
      ImageIcon lebum = new ImageIcon("lebronjamesaskid.jpg");
      JButton button4 = new JButton(" Lebron Jaaaames ", lebum);
      button4.addActionListener(new PlayButtonListener());
      myButton4 = button4;
      vines.add(button4); 
   
      ImageIcon wed = new ImageIcon("wed.jfif");
      JButton button5 = new JButton(" It's Wednesday... ", wed);
      button5.addActionListener(new PlayButtonListener());
      myButton5 = button5;
      vines.add(button5);
      
      ImageIcon wrong = new ImageIcon("siike.jpg");
      JButton button6 = new JButton(" Sike! ",wrong);
      button6.addActionListener(new PlayButtonListener());
      myButton6 = button6;
      vines.add(button6);
   
      ImageIcon stop = new ImageIcon("stahp.jfif");     
      JButton button7 = new JButton(" Could've Dropped my Croissant! ",stop);
      button7.addActionListener(new PlayButtonListener());
      myButton7 = button7;
      vines.add(button7);     
      
   } 
    /** Private Class for intereacting with the JButtons*/
   private class PlayButtonListener implements ActionListener
   {
      /** When a certain button is clicked, the sound assigned to that button will play */ 
      public void actionPerformed(ActionEvent e) 
      {
         JButton button = (JButton)e.getSource();
         if (button == myButton1)
         {
            LaFlame.play();  
         }
         else if (button == bruhButton)
         {
            bruh.play();
         }
         else if (button == myButton3)
         {
            daniel.play();
         } 
         else if (button == myButton4)
         {
            lebron.play();
         }
         else if (button == myButton5)
         {
            wednesday.play();
         }
         else if (button == myButton6)
         {
            sike.play();
         }
         else if(button == myButton7)
         {
            croissant.play();
         }
         else if(button == myButton8)
         {
            bee.play();
         }
         else if(button == myButton9)
         {
            str8up.play();
         }
         else if(button == myButton10)
         {
            itslit.play();
         }
         else if(button == myButton11)
         {
            yah.play();
         }
         else if(button == myButton12)
         {
            twochainz.play();
         }
      }
   }
   public static void main(String[] args)
   {      
      SoundBoard jah = new SoundBoard();
   
      
      
      
      /** sets looks and feel of project */
      try{
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.NimbusLookAndFeel");
      }
      catch(Exception ex)
      {
      }
   }
}
