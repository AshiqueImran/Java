import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;

public class gd
{
      static JPanel panle1= new JPanel();
      static JButton[] bt=new JButton[26];
      static Font fontArial2= new Font("Arial",Font.BOLD,35);
      static MyFrame mf=new MyFrame();

      public static void main(String args[])

  {

        //MyFrame mf=new MyFrame();
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=mf.getContentPane();
        c.setBackground(Color.BLUE);
        c.setLayout(null);

      mf.add(panle1);
      panle1.setBackground(Color.WHITE);
      panle1.setBounds(10,10,300,440) ;
      panle1.setVisible(true);
      panle1.setLayout(null);

      Font fontArial= new Font("Arial",Font.BOLD,15);
      int j=0,axisX=320,axisY=20;
      for(char i='A';i<='O';i++)
      {
             bt[j]=new JButton(String.valueOf(i));
             bt[j].setBounds(axisX,axisY,50,50) ;
             bt[j].setBackground(Color.PINK);
             bt[j].setFont(fontArial);
             c.add(bt[j]);
             axisX=axisX+50;
             j++;
      }
      int k=15,axisY2=80,axisX1=420;
      for(char a='P';a<='Z';a++)
      {
          bt[k]=new JButton(String.valueOf(a));
          bt[k].setBounds(axisX1,axisY2,50,50) ;
          bt[k].setBackground(Color.PINK);
          bt[k].setFont(fontArial);
          c.add(bt[k]);
          axisX1=axisX1+50;
          k++;
      }

          mf.revalidate();
          mf.repaint();

      bt[0].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 A_action(event);
            }
        });

    bt[1].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 B_action(event);
            }
        });

    bt[2].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 C_action(event);
            }
        });

    bt[3].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 D_action(event);
            }
        });
    bt[4].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 E_action(event);
            }
        });
    bt[5].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 F_action(event);
            }
        });
    bt[6].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 G_action(event);
            }
        });
    bt[7].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 H_action(event);
            }
        });
    bt[8].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 I_action(event);
            }
        });
    bt[9].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 J_action(event);
            }
        });
    bt[10].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 K_action(event);
            }
        });
    bt[11].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 L_action(event);
            }
        });
    bt[12].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 M_action(event);
            }
        });
    bt[13].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 N_action(event);
            }
        });
    bt[14].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 O_action(event);
            }
        });
    bt[15].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 P_action(event);
            }
        });
    bt[16].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 Q_action(event);
            }
        });
    bt[17].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 R_action(event);
            }
        });
    bt[18].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 S_action(event);
            }
        });
    bt[19].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 T_action(event);
            }
        });
    bt[20].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 U_action(event);
            }
        });
    bt[21].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 V_action(event);
            }
        });
    bt[22].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 W_action(event);
            }
        });
    bt[23].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 X_action(event);
            }
        });
    bt[24].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 Y_action(event);
            }
        });
    bt[25].addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event)
            {
                 Z_action(event);
            }
        });
  }
      //extended part of main class
    public static void PlaySound(File Sound)
    {
        try{
            /*for(int i=0;i<26;i++)
            {
                bt[i].setEnabled(false);
            }*/
            Clip clip=AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            //Thread.join(); //http://stackoverflow.com/questions/15526255/best-way-to-get-sound-on-button-press-for-a-java-calculator
            Thread.sleep(1000); //sleep for the time sound is playing
    }
        catch(Exception e) { };
}

      public static void A_action(ActionEvent event)
      {
          System.out.println("A pressed.");
          panle1.removeAll();
          ImageIcon PicA=new ImageIcon("A.jpg");
          JLabel JA=new JLabel("APPLE",PicA,JLabel.CENTER);
          JA.setBounds(10,10,280,390);
          JA.setFont(fontArial2);
          JA.setForeground(Color.RED);
          panle1.add(JA);
          mf.revalidate();
          mf.repaint();

         File Clip=new File("A.WAV");
         PlaySound(Clip);
      }
      public static void B_action(ActionEvent event)
      {
          System.out.println("B pressed.");
          panle1.removeAll();
          ImageIcon PicB=new ImageIcon("B.png");
          JLabel JB=new JLabel("BALL",PicB,JLabel.CENTER);
          JB.setBounds(10,10,280,390);
          JB.setFont(fontArial2);
          JB.setForeground(Color.RED);
          panle1.add(JB);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("B.WAV");
         PlaySound(Clip);
      }

      public static void C_action(ActionEvent event)
      {
          System.out.println("C pressed.");
          panle1.removeAll();
          ImageIcon PicC=new ImageIcon("C.jpg");
          JLabel JC=new JLabel("CAT",PicC,JLabel.CENTER);
          JC.setBounds(10,10,280,390);
          JC.setFont(fontArial2);
          JC.setForeground(Color.RED);
          panle1.add(JC);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("C.WAV");
         PlaySound(Clip);
      }

      public static void D_action(ActionEvent event)
      {
          System.out.println("D pressed.");
          panle1.removeAll();
          ImageIcon PicD=new ImageIcon("D.jpg");
          JLabel JD=new JLabel("DOLL",PicD,JLabel.CENTER);
          JD.setBounds(10,10,280,390);
          JD.setFont(fontArial2);
          JD.setForeground(Color.RED);
          panle1.add(JD);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("D.WAV");
         PlaySound(Clip);
      }
      public static void E_action(ActionEvent event)
      {
          System.out.println("E pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("E.jpg");
          JLabel JE=new JLabel("EAGLE",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("E.WAV");
         PlaySound(Clip);
      }
      public static void F_action(ActionEvent event)
      {
          System.out.println("F pressed.");
          panle1.removeAll();
          ImageIcon PicF=new ImageIcon("F.jpg");
          JLabel JF=new JLabel("FOX",PicF,JLabel.CENTER);
          JF.setBounds(10,10,280,390);
          JF.setFont(fontArial2);
          JF.setForeground(Color.RED);
          panle1.add(JF);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("F.WAV");
         PlaySound(Clip);
      }
      public static void G_action(ActionEvent event)
      {
          System.out.println("G pressed.");
          panle1.removeAll();
          ImageIcon PicF=new ImageIcon("G.jpg");
          JLabel JF=new JLabel("GOAT",PicF,JLabel.CENTER);
          JF.setBounds(10,10,280,390);
          JF.setFont(fontArial2);
          JF.setForeground(Color.RED);
          panle1.add(JF);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("G.WAV");
         PlaySound(Clip);
      }
      public static void H_action(ActionEvent event)
      {
          System.out.println("H pressed.");
          panle1.removeAll();
          ImageIcon PicF=new ImageIcon("H.png");
          JLabel JF=new JLabel("HORSE",PicF,JLabel.CENTER);
          JF.setBounds(0,0,300,440);
          JF.setFont(fontArial2);
          JF.setForeground(Color.RED);
          panle1.add(JF);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("H.WAV");
         PlaySound(Clip);
      }
      public static void I_action(ActionEvent event)
      {
          System.out.println("I pressed.");
          panle1.removeAll();
          ImageIcon PicF=new ImageIcon("I.jpg");
          JLabel JF=new JLabel("INK",PicF,JLabel.CENTER);
          JF.setBounds(10,10,280,390);
          JF.setFont(fontArial2);
          JF.setForeground(Color.RED);
          panle1.add(JF);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("I.WAV");
         PlaySound(Clip);
      }
      public static void J_action(ActionEvent event)
      {
          System.out.println("J pressed.");
          panle1.removeAll();
          ImageIcon PicF=new ImageIcon("J.jpg");
          JLabel JF=new JLabel("JUTE",PicF,JLabel.CENTER);
          JF.setBounds(10,10,280,390);
          JF.setFont(fontArial2);
          JF.setForeground(Color.RED);
          panle1.add(JF);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("J.WAV");
         PlaySound(Clip);
      }
      public static void K_action(ActionEvent event)
      {
          System.out.println("K pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("K.PNG");
          JLabel JE=new JLabel("KITE",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("K.WAV");
         PlaySound(Clip);
      }
      public static void L_action(ActionEvent event)
      {
          System.out.println("L pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("L.PNG");
          JLabel JE=new JLabel("LION",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("L.WAV");
         PlaySound(Clip);
      }
      public static void M_action(ActionEvent event)
      {
          System.out.println("M pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("M.jpg");
          JLabel JE=new JLabel("MANGO",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("M.WAV");
         PlaySound(Clip);
      }
      public static void N_action(ActionEvent event)
      {
          System.out.println("N pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("N.jpg");
          JLabel JE=new JLabel("NEST",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("N.WAV");
         PlaySound(Clip);
      }
      public static void O_action(ActionEvent event)
      {
          System.out.println("O pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("O.PNG");
          JLabel JE=new JLabel("OX",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("O.WAV");
         PlaySound(Clip);
      }
      public static void P_action(ActionEvent event)
      {
          System.out.println("P pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("P.jpg");
          JLabel JE=new JLabel("PIGEON",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("P.WAV");
         PlaySound(Clip);
      }
      public static void Q_action(ActionEvent event)
      {
          System.out.println("Q pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("Q.jpg");
          JLabel JE=new JLabel("QURAN",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("Q.WAV");
         PlaySound(Clip);
      }
      public static void R_action(ActionEvent event)
      {
          System.out.println("R pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("R.PNG");
          JLabel JE=new JLabel("RADIO",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("R.WAV");
         PlaySound(Clip);
      }
      public static void S_action(ActionEvent event)
      {
          System.out.println("S pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("S.PNG");
          JLabel JE=new JLabel("SNAKE",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("S.WAV");
         PlaySound(Clip);
      }
      public static void T_action(ActionEvent event)
      {
          System.out.println("T pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("T.jpg");
          JLabel JE=new JLabel("TIGER",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("T.WAV");
         PlaySound(Clip);
      }
      public static void U_action(ActionEvent event)
      {
          System.out.println("U pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("U.jpg");
          JLabel JE=new JLabel("UNCLE",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("U.WAV");
         PlaySound(Clip);
      }
      public static void V_action(ActionEvent event)
      {
          System.out.println("V pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("V.PNG");
          JLabel JE=new JLabel("VULTURE",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("V.WAV");
         PlaySound(Clip);
      }
      public static void W_action(ActionEvent event)
      {
          System.out.println("W pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("W.jpg");
          JLabel JE=new JLabel("WATER",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("W.WAV");
         PlaySound(Clip);
      }
      public static void X_action(ActionEvent event)
      {
          System.out.println("X pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("X.JPG");
          JLabel JE=new JLabel("X-RAY",PicE,JLabel.CENTER);
          JE.setBounds(10,10,280,390);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("X.WAV");
         PlaySound(Clip);
      }
      public static void Y_action(ActionEvent event)
      {
          System.out.println("Y pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("Y.PNG");
          JLabel JE=new JLabel("YOYO",PicE,JLabel.CENTER);
          JE.setBounds(0,0,300,440);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("Y.WAV");
         PlaySound(Clip);
      }
      public static void Z_action(ActionEvent event)
      {
          System.out.println("Z pressed.");
          panle1.removeAll();
          ImageIcon PicE=new ImageIcon("Z.jpg");
          JLabel JE=new JLabel("ZOO",PicE,JLabel.CENTER);
          JE.setBounds(0,0,300,440);
          JE.setFont(fontArial2);
          JE.setForeground(Color.RED);
          panle1.add(JE);
          mf.revalidate();
          mf.repaint();
         File Clip=new File("Z.WAV");
         PlaySound(Clip);
      }
}
