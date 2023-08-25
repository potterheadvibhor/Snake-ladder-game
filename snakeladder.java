import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
class fdemo extends JFrame
{                                      //fdemo opens
    jpdemo j;
   
   Font f=new Font("Comic Sans MS", Font.BOLD, 15);
    fdemo()                          
    {
j=new jpdemo();
add(j);
super.setTitle(("Snake & Ladder"));


setResizable(false);
    }
    class jpdemo extends JPanel implements KeyListener,ActionListener       //jpdemo opens
    {
        ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15;
        Image board,mlogo,start,about,reset,player1,player2,dicedesign,blankdice;
        JButton  b1,b2,b3,b4;
        JTextField t1,t2,t3;
        JLabel d1;
        int random,px1=241,px2=210,py1=560,py2=560;
        
        jpdemo()
        {
setBackground(Color.white);

img1=new ImageIcon("logo.jpg");
mlogo=img1.getImage();
mlogo=mlogo.getScaledInstance(300,100, java.awt.Image.SCALE_SMOOTH);


img2=new ImageIcon("board.jpg");
board=img2.getImage();
board=board.getScaledInstance(590, 620, java.awt.Image.SCALE_SMOOTH);

img3=new ImageIcon("start.gif");


img4=new ImageIcon("about.jpeg");
about=img4.getImage();
about=about.getScaledInstance(150, 30, java.awt.Image.SCALE_SMOOTH);
img4=new ImageIcon(about);

img5=new ImageIcon("reset.jpeg");
reset=img5.getImage();
reset=reset.getScaledInstance(150, 30, java.awt.Image.SCALE_SMOOTH);
img5=new ImageIcon(reset);

img6=new ImageIcon("reddot.png");
player1=img6.getImage();
img7=new ImageIcon("blackdot.png");
player2=img7.getImage();
img8=new ImageIcon("blank.png");
dicedesign=img8.getImage();
img9=new ImageIcon("blank.png");
blankdice=img9.getImage();




setLayout(null);
b1=new JButton("aboutus", img4);
b1.setBounds(80,120,150,30 );
b1.setBorderPainted(false);
b1.setFocusPainted(false);
b1.setContentAreaFilled(false);
add(b1);
b2=new JButton("reset", img5);
b2.setBounds(80,170,150,30 );
b2.setBorderPainted(false);
b2.setFocusPainted(false);
b2.setContentAreaFilled(false);
b2.setBackground(Color.pink);
add(b2);
b3=new JButton("Roll");
b3.setBounds(80,480,100,30 );
b3.setForeground(Color.red);
b3.setFont(f);
b3.setBorderPainted(false);
b3.setBackground(Color.yellow);
add(b3);
b4=new JButton(img3);
b4.setBounds(60,540,150,70 );
b4.setBackground(Color.yellow);
b4.setBorderPainted(false);
add(b4);

t1=new JTextField("Start game",10);
t1.setBounds(140,220,160,30 );
t1.setBackground(Color.BLACK);
t1.setBorder(new EmptyBorder(0,0 , 0, 0));
t1.setFont(f);
t1.setForeground(Color.RED);
add(t1);
t2=new JTextField("Player 1 name",10);
t2.setBounds(140,300,160,30 );
t2.setBackground(Color.BLACK);
t2.setBorder(new EmptyBorder(0,0 , 0, 0));
t2.setFont(f);
t2.setForeground(Color.RED);
add(t2);
t3=new JTextField("Player 2 name",10);
t3.setBounds(140,370,160,30 );
t3.setBackground(Color.BLACK);
t3.setBorder(new EmptyBorder(0,0 , 0, 0));
t3.setFont(f);
t3.setForeground(Color.RED);
add(t3);
t1.addKeyListener(this);
t2.addKeyListener(this);
t3.addKeyListener(this);
b3.addActionListener(this);
        }       
        public void actionPerformed(ActionEvent e)
        {
            
            if(e.getSource()==b3)
            {
            int min=1;
            int max=6;
            
            random=(int)(Math.random()*(max-min+1)+min);  
            if(random==1) 
            {
                img9=new ImageIcon("d1.png");
                blankdice=img9.getImage();
                px1=px1+59;
                img6=new ImageIcon("reddot.png");
player1=img6.getImage();
         repaint();
            } 
            if(random==2) 
            {
                img9=new ImageIcon("d2.png");
                blankdice=img9.getImage();
                px1=px1+118;
                img6=new ImageIcon("reddot.png");
player1=img6.getImage();
                repaint();
            } 
            if(random==3) 
            {
                img9=new ImageIcon("d3.png");
                blankdice=img9.getImage();
                px1=px1+177;
                img6=new ImageIcon("reddot.png");
player1=img6.getImage();
                repaint();
            } 
            if(random==4) 
            {
                img9=new ImageIcon("d4.png");
                blankdice=img9.getImage();
                px1=px1+236;
                img6=new ImageIcon("reddot.png");
player1=img6.getImage();
                repaint();
            } 
            if(random==5) 
            {
                img9=new ImageIcon("d5.png");
             blankdice=img9.getImage();
             px1=px1+295;
                img6=new ImageIcon("reddot.png");
player1=img6.getImage();
                repaint();
            } 
            if(random==6) 
            {
                img9=new ImageIcon("d6.png");
                blankdice=img9.getImage();
                px1=px1+354;
                img6=new ImageIcon("reddot.png");
player1=img6.getImage();
                repaint();
            } 
            }
        }                                      //jpdemo close
    public void paintComponent(Graphics g)              //graphics
    {
        super.paintComponent(g);
g.drawImage(mlogo,0,0,this);
g.drawImage(board,300,0,this);
g.drawImage(player1,px1,py1,this);
g.drawImage(player2,px2,py2,this);
g.drawImage(player1,20,290,this);
g.drawImage(player2,20,360,this);
g.drawImage(dicedesign,140,400,this);
g.drawImage(blankdice,210,400,this);

 }
 public void keyPressed(KeyEvent e)
 {
    if(t1.isFocusOwner())
    {
    String s1=t1.getText().trim();
    if(s1.equals("Start game"))
    {
        t1.setText("");
    }}
    if(t2.isFocusOwner())
    {
    String s2=t2.getText().trim();
    if(s2.equals("Player 1 name"))
    {
        t2.setText("");
    }}
    if(t3.isFocusOwner())
    {
    String s3=t3.getText().trim();
    if(s3.equals("Player 2 name"))
    {
        t3.setText("");
    }}

 }
 public void keyReleased(KeyEvent e)
 {
    String s1=t1.getText().trim();
    if(s1.equals(""))
    {
        t1.setText("Start game");
    }
    String s2=t2.getText().trim();
    if(s2.equals(""))
    {
        t2.setText("Player 1 name");
    }
    String s3=t3.getText().trim();
    if(s3.equals(""))
    {
        t3.setText("Player 2 name");
    }

 }
 public void keyTyped(KeyEvent e){}
    }

}                                                 //fdemo close
class snakeladder
{
    public static void main(String []args)
    {
        fdemo f=new fdemo();
        f.setVisible(true);
        f.setBounds(200,50,900,650);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}