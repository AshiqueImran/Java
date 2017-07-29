import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;


class MyFrame extends JFrame
{

   public MyFrame()
   {
     setBounds(20,50,1200,650) ;
     setResizable(false);
     setTitle("Goody Bag");
     Image icon = Toolkit.getDefaultToolkit().getImage("Logo.gif");
     setIconImage(icon);

   }
}

