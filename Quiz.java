import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import javax.sound.sampled.*;

public class Quiz
{
  public static Mixer mixer;
  public static Clip clip;
public static void main(String[] args)
{
  Mixer.Info[] mi=AudioSystem.getMixerInfo();
  mixer=AudioSystem.getMixer(mi[0]);
  DataLine.Info  dl=new DataLine.Info(Clip.class,null);
  try{clip=(Clip)mixer.getLine(dl);
  }
  catch(Exception e)
  {}
JFrame ff=new JFrame("quiz");
ff.setLayout(null);
ff.setVisible(true);
ff.setSize(700,700);
JPanel f=new JPanel();
f.setLayout(null);
ff.add(f);
f.setSize(700,700);
f.setVisible(true);
f.setBackground(Color.black);
ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Button b21=new Button("Home");
Button b31=new Button("Exit");
Button b1=new Button("1");
Button b2=new Button("2");
Button b3=new Button("3");
Button b4=new Button("4");
Button b5=new Button("5");
Button b6=new Button("6");
Button b7=new Button("7");
Button b8=new Button("8");
Button b9=new Button(" ");
Button b11=new Button("Level 1");
Button b12=new Button("Level 2");
Button b13=new Button("Level 3");
Button b14=new Button("Level 4");
Button b15=new Button("Level 5");
Button b16=new Button("Level 6");
Button b17=new Button("Level 7");
Button b18=new Button("Level 8");
Button b19=new Button("Level 9");
Label l1=new Label("MIND GAME");
Label l2=new Label("Done");
l1.setBounds(200,10,250,50);
l2.setBounds(400,20,250,250);
l2.setFont(new Font("Courier",Font.ITALIC,100));
l1.setFont(new Font("Courier",Font.ITALIC,40));
l2.setForeground(Color.red);
l2.setVisible(false);
l1.setForeground(Color.red);
l1.setBackground(Color.yellow);
l1.setVisible(true);
b21.setBounds(10,10,150,50);
b31.setBounds(470,10,150,50);
b1.setBounds(100,100,100,100);
b2.setBounds(200,100,100,100);
b3.setBounds(300,100,100,100);
b4.setBounds(100,200,100,100);
b5.setBounds(200,200,100,100);
b6.setBounds(300,200,100,100);
b7.setBounds(100,300,100,100);
b8.setBounds(200,300,100,100);
b9.setBounds(300,300,100,100);
b11.setBounds(0,150,190,70);
b12.setBounds(230,150,190,70);
b13.setBounds(460,150,190,70);
b14.setBounds(0,300,190,70);
b15.setBounds(230,300,190,70);
b16.setBounds(460,300,190,70);
b17.setBounds(0,450,190,70);
b18.setBounds(230,450,190,70);
b19.setBounds(460,450,190,70);
b1.setBackground(Color.yellow);
b2.setBackground(Color.blue);
b3.setBackground(Color.red);
b4.setBackground(Color.green);
b5.setBackground(Color.pink);
b6.setBackground(Color.cyan);
b7.setBackground(Color.orange);
b8.setBackground(Color.gray);
b9.setBackground(Color.magenta);
b12.setBackground(Color.magenta);
b13.setBackground(Color.magenta);
b14.setBackground(Color.cyan);
b15.setBackground(Color.cyan);
b16.setBackground(Color.cyan);
b17.setBackground(Color.pink);
b18.setBackground(Color.pink);
b19.setBackground(Color.pink);
b11.setBackground(Color.magenta);
b21.setBackground(Color.blue);
b31.setBackground(Color.red);
b21.setFont(new Font("Courier",Font.ITALIC,40));
b31.setFont(new Font("Courier",Font.ITALIC,40));
b1.setFont(new Font("Courier",Font.ITALIC,40));
b2.setFont(new Font("Courier",Font.ITALIC,40));
b3.setFont(new Font("Courier",Font.ITALIC,40));
b4.setFont(new Font("Courier",Font.ITALIC,40));
b5.setFont(new Font("Courier",Font.ITALIC,40));
b6.setFont(new Font("Courier",Font.ITALIC,40));
b7.setFont(new Font("Courier",Font.ITALIC,40));
b8.setFont(new Font("Courier",Font.ITALIC,40));
b9.setFont(new Font("Courier",Font.ITALIC,40));
b11.setFont(new Font("Courier",Font.ITALIC,40));
b12.setFont(new Font("Courier",Font.ITALIC,40));
b13.setFont(new Font("Courier",Font.ITALIC,40));
b14.setFont(new Font("Courier",Font.ITALIC,40));
b15.setFont(new Font("Courier",Font.ITALIC,40));
b16.setFont(new Font("Courier",Font.ITALIC,40));
b17.setFont(new Font("Courier",Font.ITALIC,40));
b18.setFont(new Font("Courier",Font.ITALIC,40));
b19.setFont(new Font("Courier",Font.ITALIC,40));
f.add(b31);
f.add(b21);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b11);
f.add(b12);
f.add(l1);
f.add(l2);
f.add(b13);
f.add(b14);
f.add(b15);
f.add(b16);
f.add(b17);
f.add(b18);
f.add(b19);
b11.setVisible(true);
b21.setVisible(true);
b31.setVisible(true);
b12.setVisible(true);
b13.setVisible(true);
b14.setVisible(true);
b15.setVisible(true);
b16.setVisible(true);
b17.setVisible(true);
b18.setVisible(true);
b19.setVisible(true);
b9.setVisible(false);
b1.setVisible(false);
b2.setVisible(false);
b3.setVisible(false);
b4.setVisible(false);
b5.setVisible(false);
b6.setVisible(false);
b7.setVisible(false);
b8.setVisible(false);
b21.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {      l2.setVisible(false);

      b11.setVisible(true);
      b21.setVisible(true);
      b31.setVisible(true);
      b12.setVisible(true);
      b13.setVisible(true);
      b14.setVisible(true);
      b15.setVisible(true);
      b16.setVisible(true);
      b17.setVisible(true);
      b18.setVisible(true);
      b19.setVisible(true);
      b9.setVisible(false);
      b1.setVisible(false);
      b2.setVisible(false);
      b3.setVisible(false);
      b4.setVisible(false);
      b5.setVisible(false);
      b6.setVisible(false);
      b7.setVisible(false);
      b8.setVisible(false);
    }
    catch(Exception ex){}
    }});
    b31.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        try
        {
          System.exit(0);
        }
        catch(Exception ex){}
        }});
b11.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {      l2.setVisible(false);

      b11.setVisible(false);
      b12.setVisible(false);
      b13.setVisible(false);
      b14.setVisible(false);
      b15.setVisible(false);
      b16.setVisible(false);
      b17.setVisible(false);
      b18.setVisible(false);
      b19.setVisible(false);
      b9.setVisible(true);
      b1.setVisible(true);
      b2.setVisible(true);
      b3.setVisible(true);
      b4.setVisible(true);
      b5.setVisible(true);
      b6.setVisible(true);
      b7.setVisible(true);
      b8.setVisible(true);
      b1.setLabel("1");
      b2.setLabel("2");
      b3.setLabel("3");
      b4.setLabel("4");
      b5.setLabel("5");
      b6.setLabel(" ");
      b7.setLabel("7");
      b8.setLabel("8");
      b9.setLabel("6");

    }
    catch(Exception ex)
    {}
  }
});
b12.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {      l2.setVisible(false);

      b11.setVisible(false);
      b12.setVisible(false);
      b13.setVisible(false);
      b14.setVisible(false);
      b15.setVisible(false);
      b16.setVisible(false);
      b17.setVisible(false);
      b18.setVisible(false);
      b19.setVisible(false);
      b9.setVisible(true);
      b1.setVisible(true);
      b2.setVisible(true);
      b3.setVisible(true);
      b4.setVisible(true);
      b5.setVisible(true);
      b6.setVisible(true);
      b7.setVisible(true);
      b8.setVisible(true);
      b1.setLabel("1");
      b2.setLabel("2");
      b3.setLabel("3");
      b4.setLabel("4");
      b5.setLabel(" ");
      b6.setLabel("8");
      b7.setLabel("6");
      b8.setLabel("5");
      b9.setLabel("7");
    }
    catch(Exception ex)
    {}
  }
});
b13.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {      l2.setVisible(false);

      b11.setVisible(false);
      b12.setVisible(false);
      b13.setVisible(false);
      b14.setVisible(false);
      b15.setVisible(false);
      b16.setVisible(false);
      b17.setVisible(false);
      b18.setVisible(false);
      b19.setVisible(false);
      b9.setVisible(true);
      b1.setVisible(true);
      b2.setVisible(true);
      b3.setVisible(true);
      b4.setVisible(true);
      b5.setVisible(true);
      b6.setVisible(true);
      b7.setVisible(true);
      b8.setVisible(true);
      b1.setLabel("1");
      b2.setLabel("2");
      b3.setLabel("3");
      b4.setLabel(" ");
      b5.setLabel("6");
      b6.setLabel("8");
      b7.setLabel("5");
      b8.setLabel("7");
      b9.setLabel("4");
    }
    catch(Exception ex)
    {}
  }
});
b14.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {      l2.setVisible(false);

      b11.setVisible(false);
      b12.setVisible(false);
      b13.setVisible(false);
      b14.setVisible(false);
      b15.setVisible(false);
      b16.setVisible(false);
      b17.setVisible(false);
      b18.setVisible(false);
      b19.setVisible(false);
      b9.setVisible(true);
      b1.setVisible(true);
      b2.setVisible(true);
      b3.setVisible(true);
      b4.setVisible(true);
      b5.setVisible(true);
      b6.setVisible(true);
      b7.setVisible(true);
      b8.setVisible(true);
      b1.setLabel("1");
      b2.setLabel("2");
      b3.setLabel(" ");
      b4.setLabel("4");
      b5.setLabel("5");
      b6.setLabel("7");
      b7.setLabel("6");
      b8.setLabel("8");
      b9.setLabel("3");
    }
    catch(Exception ex)
    {}
  }
});
b15.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {      l2.setVisible(false);

      b11.setVisible(false);
      b12.setVisible(false);
      b13.setVisible(false);
      b14.setVisible(false);
      b15.setVisible(false);
      b16.setVisible(false);
      b17.setVisible(false);
      b18.setVisible(false);
      b19.setVisible(false);
      b9.setVisible(true);
      b1.setVisible(true);
      b2.setVisible(true);
      b3.setVisible(true);
      b4.setVisible(true);
      b5.setVisible(true);
      b6.setVisible(true);
      b7.setVisible(true);
      b8.setVisible(true);
      b1.setLabel("1");
      b2.setLabel("2");
      b3.setLabel("8");
      b4.setLabel("7");
      b5.setLabel("3");
      b6.setLabel("4");
      b7.setLabel("6");
      b8.setLabel("5");
      b9.setLabel(" ");
    }
    catch(Exception ex)
    {}
  }
});
b16.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {      l2.setVisible(false);

      b11.setVisible(false);
      b12.setVisible(false);
      b13.setVisible(false);
      b14.setVisible(false);
      b15.setVisible(false);
      b16.setVisible(false);
      b17.setVisible(false);
      b18.setVisible(false);
      b19.setVisible(false);
      b9.setVisible(true);
      b1.setVisible(true);
      b2.setVisible(true);
      b3.setVisible(true);
      b4.setVisible(true);
      b5.setVisible(true);
      b6.setVisible(true);
      b7.setVisible(true);
      b8.setVisible(true);
      b1.setLabel("1");
      b2.setLabel("2");
      b3.setLabel("4");
      b4.setLabel("8");
      b5.setLabel(" ");
      b6.setLabel("7");
      b7.setLabel("6");
      b8.setLabel("3");
      b9.setLabel("5");
    }
    catch(Exception ex)
    {}
  }
});
b17.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {      l2.setVisible(false);

      b11.setVisible(false);
      b12.setVisible(false);
      b13.setVisible(false);
      b14.setVisible(false);
      b15.setVisible(false);
      b16.setVisible(false);
      b17.setVisible(false);
      b18.setVisible(false);
      b19.setVisible(false);
      b9.setVisible(true);
      b1.setVisible(true);
      b2.setVisible(true);
      b3.setVisible(true);
      b4.setVisible(true);
      b5.setVisible(true);
      b6.setVisible(true);
      b7.setVisible(true);
      b8.setVisible(true);
      b1.setLabel("1");
      b2.setLabel("7");
      b3.setLabel("8");
      b4.setLabel(" ");
      b5.setLabel("3");
      b6.setLabel("4");
      b7.setLabel(" ");
      b8.setLabel("2");
      b9.setLabel("5");
    }
    catch(Exception ex)
    {}
  }
});
b18.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {
      l2.setVisible(false);

      b11.setVisible(false);
      b12.setVisible(false);
      b13.setVisible(false);
      b14.setVisible(false);
      b15.setVisible(false);
      b16.setVisible(false);
      b17.setVisible(false);
      b18.setVisible(false);
      b19.setVisible(false);
      b9.setVisible(true);
      b1.setVisible(true);
      b2.setVisible(true);
      b3.setVisible(true);
      b4.setVisible(true);
      b5.setVisible(true);
      b6.setVisible(true);
      b7.setVisible(true);
      b8.setVisible(true);
      b1.setLabel("7");
      b2.setLabel("5");
      b3.setLabel("4");
      b4.setLabel("6");
      b5.setLabel("3");
      b6.setLabel("1");
      b7.setLabel("8");
      b8.setLabel("2");
      b9.setLabel("");
    }
    catch(Exception ex)
    {}
  }
});
b19.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {
      l2.setVisible(false);
      b11.setVisible(false);
      b12.setVisible(false);
      b13.setVisible(false);
      b14.setVisible(false);
      b15.setVisible(false);
      b16.setVisible(false);
      b17.setVisible(false);
      b18.setVisible(false);
      b19.setVisible(false);
      b9.setVisible(true);
      b1.setVisible(true);
      b2.setVisible(true);
      b3.setVisible(true);
      b4.setVisible(true);
      b5.setVisible(true);
      b6.setVisible(true);
      b7.setVisible(true);
      b8.setVisible(true);
      b1.setLabel("8");
      b2.setLabel("7");
      b3.setLabel("6");
      b4.setLabel("5");
      b5.setLabel("4");
      b6.setLabel("3");
      b7.setLabel("2");
      b8.setLabel("1");
      b9.setLabel(" ");
    }
    catch(Exception ex)
    {}
  }
});
b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {
      String s11=b1.getLabel();
      String s21=b2.getLabel();
      String s31=b3.getLabel();
      String s41=b4.getLabel();
      String s51=b5.getLabel();
      String s61=b6.getLabel();
      String s71=b7.getLabel();
      String s81=b8.getLabel();


      if(s11.equals("1") && s21.equals("2") && s31.equals("3") && s41.equals("4") && s51.equals("5") && s61.equals("6") && s71.equals("7") && s81.equals("8"))
      {
        l2.setVisible(true);
        l2.setText("Done");
      }
      else{
      String s1=b2.getLabel();
      String s2=b4.getLabel();
      if(s1.equals(" "))
      {
        int x2=b2.getX();
        int y2=b2.getY();
        int x1=b1.getX();
        int y1=b1.getY();
        Color c1=b1.getBackground();
        Color c2=b2.getBackground();
        String s=b1.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b1.setBounds(x1+i,y1,100,100);
          b2.setBounds(x2-i,y2,100,100);
          Thread.sleep(5);
        }
        b1.setBackground(c2);
        b2.setBackground(c1);
        b1.setLabel(s1);
        b2.setLabel(s);
        b1.setBounds(x1,y1,100,100);
        b2.setBounds(x2,y2,100,100);
      }
      else if(s2.equals(" "))
      {
        int x2=b4.getX();
        int y2=b4.getY();
        int x1=b1.getX();
        int y1=b1.getY();
        Color c1=b1.getBackground();
        Color c2=b4.getBackground();
        String s=b1.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b1.setBounds(x1,y1+i,100,100);
          b4.setBounds(x2,y2-i,100,100);
          Thread.sleep(5);
        }
        b1.setBackground(c2);
        b4.setBackground(c1);
        b1.setLabel(s2);
        b4.setLabel(s);
        b1.setBounds(x1,y1,100,100);
        b4.setBounds(x2,y2,100,100);
      }
    }
  }
    catch(Exception ex){}
}
});
b2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {
      String s11=b1.getLabel();
      String s21=b2.getLabel();
      String s31=b3.getLabel();
      String s41=b4.getLabel();
      String s51=b5.getLabel();
      String s61=b6.getLabel();
      String s71=b7.getLabel();
      String s81=b8.getLabel();


      if(s11.equals("1") && s21.equals("2") && s31.equals("3") && s41.equals("4") && s51.equals("5") && s61.equals("6") && s71.equals("7") && s81.equals("8"))
      {
        l2.setVisible(true);
        l2.setText("Done");
      }
      else{
    String s1=b1.getLabel();
    String s2=b3.getLabel();
    String s3=b5.getLabel();
    if(s1.equals(" "))
    {
      int x2=b1.getX();
      int y2=b1.getY();
      int x1=b2.getX();
      int y1=b2.getY();
      Color c1=b1.getBackground();
      Color c2=b2.getBackground();
      String s=b2.getLabel();
      int i,j;

      for(i=1;i<=100;i++)
      {
        b1.setBounds(x2+i,y2,100,100);
        b2.setBounds(x1-i,y1,100,100);
        Thread.sleep(5);
      }
      b1.setBackground(c2);
      b2.setBackground(c1);
      b1.setLabel(s);
      b2.setLabel(s1);
      b1.setBounds(x2,y2,100,100);
      b2.setBounds(x1,y1,100,100);
    }
    else if(s2.equals(" "))
    {
      int x2=b3.getX();
      int y2=b3.getY();
      int x1=b2.getX();
      int y1=b2.getY();
      Color c1=b2.getBackground();
      Color c2=b3.getBackground();
      String s=b2.getLabel();
      int i,j;

      for(i=1;i<=100;i++)
      {
        b2.setBounds(x1+i,y1,100,100);
        b3.setBounds(x2-i,y2,100,100);
        Thread.sleep(5);
      }
      b2.setBackground(c2);
      b3.setBackground(c1);
      b2.setLabel(s2);
      b3.setLabel(s);
      b2.setBounds(x1,y1,100,100);
      b3.setBounds(x2,y2,100,100);
    }
    else if(s3.equals(" "))
    {
        int x2=b5.getX();
        int y2=b5.getY();
        int x1=b2.getX();
        int y1=b2.getY();
        Color c1=b2.getBackground();
        Color c2=b5.getBackground();
        String s=b2.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b5.setBounds(x2,y2-i,100,100);
          b2.setBounds(x1,y1+i,100,100);
          Thread.sleep(5);
        }
        b2.setBackground(c2);
        b5.setBackground(c1);
        b2.setLabel(s3);
        b5.setLabel(s);
        b2.setBounds(x1,y1,100,100);
        b5.setBounds(x2,y2,100,100);
    }
  }}
    catch(Exception ex){}
  }
});
b3.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {
      String s11=b1.getLabel();
      String s21=b2.getLabel();
      String s31=b3.getLabel();
      String s41=b4.getLabel();
      String s51=b5.getLabel();
      String s61=b6.getLabel();
      String s71=b7.getLabel();
      String s81=b8.getLabel();


      if(s11.equals("1") && s21.equals("2") && s31.equals("3") && s41.equals("4") && s51.equals("5") && s61.equals("6") && s71.equals("7") && s81.equals("8"))
      {
        l2.setVisible(true);
        l2.setText("Done");
      }
      else{
      String s1=b2.getLabel();
      String s2=b6.getLabel();
      if(s1.equals(" "))
      {
        int x2=b2.getX();
        int y2=b2.getY();
        int x1=b3.getX();
        int y1=b3.getY();
        Color c1=b3.getBackground();
        Color c2=b2.getBackground();
        String s=b3.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b2.setBounds(x2+i,y2,100,100);
          b3.setBounds(x1-i,y1,100,100);
          Thread.sleep(5);
        }
        b3.setBackground(c2);
        b2.setBackground(c1);
        b3.setLabel(s1);
        b2.setLabel(s);
        b3.setBounds(x1,y1,100,100);
        b2.setBounds(x2,y2,100,100);
      }
      else if(s2.equals(" "))
      {
        int x2=b6.getX();
        int y2=b6.getY();
        int x1=b3.getX();
        int y1=b3.getY();
        Color c1=b3.getBackground();
        Color c2=b6.getBackground();
        String s=b3.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b3.setBounds(x1,y1+i,100,100);
          b6.setBounds(x2,y2-i,100,100);
          Thread.sleep(5);
        }
        b3.setBackground(c2);
        b6.setBackground(c1);
        b3.setLabel(s2);
        b6.setLabel(s);
        b3.setBounds(x1,y1,100,100);
        b6.setBounds(x2,y2,100,100);
      }
    }}
    catch(Exception ex){}
  }
});
b4.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {
      String s11=b1.getLabel();
      String s21=b2.getLabel();
      String s31=b3.getLabel();
      String s41=b4.getLabel();
      String s51=b5.getLabel();
      String s61=b6.getLabel();
      String s71=b7.getLabel();
      String s81=b8.getLabel();


      if(s11.equals("1") && s21.equals("2") && s31.equals("3") && s41.equals("4") && s51.equals("5") && s61.equals("6") && s71.equals("7") && s81.equals("8"))
      {
        l2.setVisible(true);
        l2.setText("Done");
      }
      else{
      String s1=b1.getLabel();
      String s2=b7.getLabel();
      String s3=b5.getLabel();
      if(s1.equals(" "))
      {
        int x2=b1.getX();
        int y2=b1.getY();
        int x1=b4.getX();
        int y1=b4.getY();
        Color c1=b4.getBackground();
        Color c2=b1.getBackground();
        String s=b4.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b1.setBounds(x2,y2+i,100,100);
          b4.setBounds(x1,y1-i,100,100);
          Thread.sleep(5);
        }
        b4.setBackground(c2);
        b1.setBackground(c1);
        b1.setLabel(s);
        b4.setLabel(s1);
        b1.setBounds(x2,y2,100,100);
        b4.setBounds(x1,y1,100,100);
      }
      else if(s2.equals(" "))
      {
        int x2=b7.getX();
        int y2=b7.getY();
        int x1=b4.getX();
        int y1=b4.getY();
        Color c1=b4.getBackground();
        Color c2=b7.getBackground();
        String s=b4.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b4.setBounds(x1,y1+i,100,100);
          b7.setBounds(x2,y2-i,100,100);
          Thread.sleep(5);
        }
        b4.setBackground(c2);
        b7.setBackground(c1);
        b4.setLabel(s2);
        b7.setLabel(s);
        b4.setBounds(x1,y1,100,100);
        b7.setBounds(x2,y2,100,100);
      }
      else if(s3.equals(" "))
      {
          int x2=b5.getX();
          int y2=b5.getY();
          int x1=b4.getX();
          int y1=b4.getY();
          Color c1=b4.getBackground();
          Color c2=b5.getBackground();
          String s=b4.getLabel();
          int i,j;

          for(i=1;i<=100;i++)
          {
            b5.setBounds(x2-i,y2,100,100);
            b4.setBounds(x1+i,y1,100,100);
            Thread.sleep(5);
          }
          b4.setBackground(c2);
          b5.setBackground(c1);
          b4.setLabel(s3);
          b5.setLabel(s);
          b4.setBounds(x1,y1,100,100);
          b5.setBounds(x2,y2,100,100);
      }
    }}
    catch(Exception ex){}
  }
});
b5.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {
      String s11=b1.getLabel();
      String s21=b2.getLabel();
      String s31=b3.getLabel();
      String s41=b4.getLabel();
      String s51=b5.getLabel();
      String s61=b6.getLabel();
      String s71=b7.getLabel();
      String s81=b8.getLabel();


      if(s11.equals("1") && s21.equals("2") && s31.equals("3") && s41.equals("4") && s51.equals("5") && s61.equals("6") && s71.equals("7") && s81.equals("8"))
      {
        l2.setVisible(true);
        l2.setText("Done");
      }
      else{
      String s1=b2.getLabel();
      String s2=b4.getLabel();
      String s3=b6.getLabel();
      String s4=b8.getLabel();
      if(s1.equals(" "))
      {
        int x2=b2.getX();
        int y2=b2.getY();
        int x1=b5.getX();
        int y1=b5.getY();
        Color c1=b5.getBackground();
        Color c2=b2.getBackground();
        String s=b5.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b2.setBounds(x2,y2+i,100,100);
          b5.setBounds(x1,y1-i,100,100);
          Thread.sleep(5);
        }
        b5.setBackground(c2);
        b2.setBackground(c1);
        b2.setLabel(s);
        b5.setLabel(s1);
        b2.setBounds(x2,y2,100,100);
        b5.setBounds(x1,y1,100,100);
      }
      else if(s2.equals(" "))
      {
        int x2=b4.getX();
        int y2=b4.getY();
        int x1=b5.getX();
        int y1=b5.getY();
        Color c1=b5.getBackground();
        Color c2=b4.getBackground();
        String s=b5.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b5.setBounds(x1-i,y1,100,100);
          b4.setBounds(x2+i,y2,100,100);
          Thread.sleep(5);
        }
        b5.setBackground(c2);
        b4.setBackground(c1);
        b5.setLabel(s2);
        b4.setLabel(s);
        b5.setBounds(x1,y1,100,100);
        b4.setBounds(x2,y2,100,100);
      }
      else if(s3.equals(" "))
      {
          int x2=b6.getX();
          int y2=b6.getY();
          int x1=b5.getX();
          int y1=b5.getY();
          Color c1=b5.getBackground();
          Color c2=b6.getBackground();
          String s=b5.getLabel();
          int i,j;

          for(i=1;i<=100;i++)
          {
            b6.setBounds(x2-i,y2,100,100);
            b5.setBounds(x1+i,y1,100,100);
            Thread.sleep(5);
          }
          b5.setBackground(c2);
          b6.setBackground(c1);
          b6.setLabel(s);
          b5.setLabel(s3);
          b5.setBounds(x1,y1,100,100);
          b6.setBounds(x2,y2,100,100);
      }
      else if(s4.equals(" "))
          {
            int x2=b8.getX();
            int y2=b8.getY();
            int x1=b5.getX();
            int y1=b5.getY();
            Color c1=b5.getBackground();
            Color c2=b8.getBackground();
            String s=b5.getLabel();
            int i,j;

            for(i=1;i<=100;i++)
            {
              b8.setBounds(x2,y2-i,100,100);
              b5.setBounds(x1,y1+i,100,100);
              Thread.sleep(5);
            }
            b5.setBackground(c2);
            b8.setBackground(c1);
            b8.setLabel(s);
            b5.setLabel(s4);
            b8.setBounds(x2,y2,100,100);
            b5.setBounds(x1,y1,100,100);
          }}
    }
    catch(Exception ex){}
  }
});
b6.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {  String s11=b1.getLabel();
      String s21=b2.getLabel();
      String s31=b3.getLabel();
      String s41=b4.getLabel();
      String s51=b5.getLabel();
      String s61=b6.getLabel();
      String s71=b7.getLabel();
      String s81=b8.getLabel();


      if(s11.equals("1") && s21.equals("2") && s31.equals("3") && s41.equals("4") && s51.equals("5") && s61.equals("6") && s71.equals("7") && s81.equals("8"))
      {
        l2.setVisible(true);
        l2.setText("Done");
      }
      else{
      String s1=b3.getLabel();
      String s2=b9.getLabel();
      String s3=b5.getLabel();
      if(s1.equals(" "))
      {
        int x2=b3.getX();
        int y2=b3.getY();
        int x1=b6.getX();
        int y1=b6.getY();
        Color c1=b6.getBackground();
        Color c2=b3.getBackground();
        String s=b6.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b3.setBounds(x2,y2+i,100,100);
          b6.setBounds(x1,y1-i,100,100);
          Thread.sleep(5);
        }
        b6.setBackground(c2);
        b3.setBackground(c1);
        b3.setLabel(s);
        b6.setLabel(s1);
        b3.setBounds(x2,y2,100,100);
        b6.setBounds(x1,y1,100,100);
      }
      else if(s2.equals(" "))
      {
        int x2=b9.getX();
        int y2=b9.getY();
        int x1=b6.getX();
        int y1=b6.getY();
        Color c1=b6.getBackground();
        Color c2=b9.getBackground();
        String s=b6.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b6.setBounds(x1,y1+i,100,100);
          b9.setBounds(x2,y2-i,100,100);
          Thread.sleep(5);
        }
        b9.setBackground(c2);
        b6.setBackground(c1);
        b6.setLabel(s2);
        b9.setLabel(s);
        b6.setBounds(x1,y1,100,100);
        b9.setBounds(x2,y2,100,100);
      }
      else if(s3.equals(" "))
      {
          int x2=b5.getX();
          int y2=b5.getY();
          int x1=b6.getX();
          int y1=b6.getY();
          Color c1=b6.getBackground();
          Color c2=b5.getBackground();
          String s=b6.getLabel();
          int i,j;

          for(i=1;i<=100;i++)
          {
            b5.setBounds(x2+i,y2,100,100);
            b6.setBounds(x1-i,y1,100,100);
            Thread.sleep(5);
          }
          b6.setBackground(c2);
          b5.setBackground(c1);
          b6.setLabel(s3);
          b5.setLabel(s);
          b6.setBounds(x1,y1,100,100);
          b5.setBounds(x2,y2,100,100);
      }
    }}
    catch(Exception ex){}
  }
});
b7.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {  String s11=b1.getLabel();
      String s21=b2.getLabel();
      String s31=b3.getLabel();
      String s41=b4.getLabel();
      String s51=b5.getLabel();
      String s61=b6.getLabel();
      String s71=b7.getLabel();
      String s81=b8.getLabel();


      if(s11.equals("1") && s21.equals("2") && s31.equals("3") && s41.equals("4") && s51.equals("5") && s61.equals("6") && s71.equals("7") && s81.equals("8"))
      {
        l2.setVisible(true);
        l2.setText("Done");
      }
      else{
      String s1=b8.getLabel();
      String s2=b4.getLabel();
      if(s1.equals(" "))
      {
        int x2=b8.getX();
        int y2=b8.getY();
        int x1=b7.getX();
        int y1=b7.getY();
        Color c1=b7.getBackground();
        Color c2=b8.getBackground();
        String s=b7.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b7.setBounds(x1+i,y1,100,100);
          b8.setBounds(x2-i,y2,100,100);
          Thread.sleep(5);
        }
        b7.setBackground(c2);
        b8.setBackground(c1);
        b7.setLabel(s1);
        b8.setLabel(s);
        b7.setBounds(x1,y1,100,100);
        b8.setBounds(x2,y2,100,100);
      }
      else if(s2.equals(" "))
      {
        int x2=b4.getX();
        int y2=b4.getY();
        int x1=b7.getX();
        int y1=b7.getY();
        Color c1=b7.getBackground();
        Color c2=b4.getBackground();
        String s=b7.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b7.setBounds(x1,y1-i,100,100);
          b4.setBounds(x2,y2+i,100,100);
          Thread.sleep(5);
        }
        b7.setBackground(c2);
        b4.setBackground(c1);
        b7.setLabel(s2);
        b4.setLabel(s);
        b7.setBounds(x1,y1,100,100);
        b4.setBounds(x2,y2,100,100);
      }
    }}
    catch(Exception ex){}
  }
});
b8.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {  String s11=b1.getLabel();
      String s21=b2.getLabel();
      String s31=b3.getLabel();
      String s41=b4.getLabel();
      String s51=b5.getLabel();
      String s61=b6.getLabel();
      String s71=b7.getLabel();
      String s81=b8.getLabel();


      if(s11.equals("1") && s21.equals("2") && s31.equals("3") && s41.equals("4") && s51.equals("5") && s61.equals("6") && s71.equals("7") && s81.equals("8"))
      {
        l2.setVisible(true);
        l2.setText("Done");
      }
      else{
      String s1=b7.getLabel();
      String s2=b9.getLabel();
      String s3=b5.getLabel();
      if(s1.equals(" "))
      {
        int x2=b7.getX();
        int y2=b7.getY();
        int x1=b8.getX();
        int y1=b8.getY();
        Color c1=b8.getBackground();
        Color c2=b7.getBackground();
        String s=b8.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b7.setBounds(x2+i,y2,100,100);
          b8.setBounds(x1-i,y1,100,100);
          Thread.sleep(5);
        }
        b8.setBackground(c2);
        b7.setBackground(c1);
        b7.setLabel(s);
        b8.setLabel(s1);
        b7.setBounds(x2,y2,100,100);
        b8.setBounds(x1,y1,100,100);
      }
      else if(s2.equals(" "))
      {
        int x2=b3.getX();
        int y2=b9.getY();
        int x1=b8.getX();
        int y1=b8.getY();
        Color c1=b8.getBackground();
        Color c2=b9.getBackground();
        String s=b8.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b8.setBounds(x1+i,y1,100,100);
          b9.setBounds(x2-i,y2,100,100);
          Thread.sleep(5);
        }
        b8.setBackground(c2);
        b9.setBackground(c1);
        b8.setLabel(s2);
        b9.setLabel(s);
        b8.setBounds(x1,y1,100,100);
        b9.setBounds(x2,y2,100,100);
      }
      else if(s3.equals(" "))
      {
          int x2=b5.getX();
          int y2=b5.getY();
          int x1=b8.getX();
          int y1=b8.getY();
          Color c1=b8.getBackground();
          Color c2=b5.getBackground();
          String s=b8.getLabel();
          int i,j;

          for(i=1;i<=100;i++)
          {
            b5.setBounds(x2,y2+i,100,100);
            b8.setBounds(x1,y1-i,100,100);
            Thread.sleep(5);
          }
          b8.setBackground(c2);
          b5.setBackground(c1);
          b5.setLabel(s);
          b8.setLabel(s3);
          b8.setBounds(x1,y1,100,100);
          b5.setBounds(x2,y2,100,100);
      }
    }}
    catch(Exception ex){}
  }
});
b9.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
    try
    {  String s11=b1.getLabel();
      String s21=b2.getLabel();
      String s31=b3.getLabel();
      String s41=b4.getLabel();
      String s51=b5.getLabel();
      String s61=b6.getLabel();
      String s71=b7.getLabel();
      String s81=b8.getLabel();


      if(s11.equals("1") && s21.equals("2") && s31.equals("3") && s41.equals("4") && s51.equals("5") && s61.equals("6") && s71.equals("7") && s81.equals("8"))
      {
        l2.setVisible(true);
        l2.setText("Done");
      }
      else{
      String s1=b8.getLabel();
      String s2=b6.getLabel();
      if(s1.equals(" "))
      {
        int x2=b8.getX();
        int y2=b8.getY();
        int x1=b9.getX();
        int y1=b9.getY();
        Color c1=b9.getBackground();
        Color c2=b8.getBackground();
        String s=b9.getLabel();
        int i,j;

        for(i=1;i<=100;i++)
        {
          b8.setBounds(x2+i,y2,100,100);
          b9.setBounds(x1-i,y1,100,100);
          Thread.sleep(5);
        }
        b9.setBackground(c2);
        b8.setBackground(c1);
        b9.setLabel(s1);
        b8.setLabel(s);
        b9.setBounds(x1,y1,100,100);
        b8.setBounds(x2,y2,100,100);
      }
      else if(s2.equals(" "))
      {
        int x2=b6.getX();
        int y2=b6.getY();
        int x1=b9.getX();
        int y1=b9.getY();
        Color c1=b9.getBackground();
        Color c2=b6.getBackground();
        String s=b9.getLabel();
        int i,j;
      
        for(i=1;i<=100;i++)
        {
          b9.setBounds(x1,y1-i,100,100);
          b6.setBounds(x2,y2+i,100,100);
          Thread.sleep(5);
        }
        b9.setBackground(c2);
        b6.setBackground(c1);
        b9.setLabel(s2);
        b6.setLabel(s);
        b9.setBounds(x1,y1,100,100);
        b6.setBounds(x2,y2,100,100);
      }
    }}
    catch(Exception ex){}
  }
});

}
}
