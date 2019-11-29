import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Puzzle extends JFrame implements ActionListener
{ 
     private JLabel userLabel,scoreLabel;
	 private JButton Btn1;
	 private JButton Btn2;
	 private JButton Btn3;
	 private JButton Btn4;
	 private JButton Btn5;
	 private JButton Btn6;
     private JButton Btn7;
     private JButton Btn8;
     private JButton Btn9;
	 private JButton Btn10;
	 private JPanel panel;
	 Random r=new Random();
	 boolean clicked=false;
	
	 String prev;
	 String post;
	 
	 
	 private int s=0; 
	 public Puzzle()
	 {
		 super (" Puzzle game");
		 this.setSize (1000,600);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 panel=new JPanel();
		 panel.setLayout(null);
		 
		 scoreLabel=new JLabel("score:"+s);
		 scoreLabel.setBounds(10,2,100,180);
		 panel.add(scoreLabel);
		 
		 Btn1 =new JButton("1");
		 Btn1.setBounds(r.nextInt(800),r.nextInt(400),100,100);
		 Btn1.setBackground(Color.GREEN);
		 
		 Btn1.setForeground(Color.GREEN);
		 Btn1.addActionListener(this);
		 panel.add(Btn1);
		 
		 Btn2 =new JButton("2");
		 Btn2.setBounds(r.nextInt(800),r.nextInt(400),100,100);
		 Btn2.setBackground(Color.GREEN);
		 Btn2.setForeground(Color.GREEN);
		 Btn2.addActionListener(this);
		 panel.add(Btn2);
		 
		 Btn3 =new JButton("3");
		 Btn3.setBounds(r.nextInt(800),r.nextInt(400),100,100);
		 Btn3.setBackground(Color.GREEN);
		 Btn3.setForeground(Color.GREEN);
		 Btn3.addActionListener(this);
		 panel.add(Btn3);
		 
		Btn4 =new JButton("4");
		 Btn4.setBounds(r.nextInt(800),r.nextInt(400),100,100);
		 Btn4.setBackground(Color.GREEN);
		 Btn4.setForeground(Color.GREEN);
		 Btn4.addActionListener(this);
		 panel.add(Btn4);
		 
		 Btn5 =new JButton("5");
		 Btn5.setBounds(r.nextInt(800),r.nextInt(400),100,100);
		 Btn5.setBackground(Color.GREEN);
		 Btn5.setForeground(Color.GREEN);
		 Btn5.addActionListener(this);
		 panel.add(Btn5);
		 
		 
		Btn6 =new JButton("1");
		 Btn6.setBounds(r.nextInt(800),r.nextInt(400),100,100);
		 Btn6.setBackground(Color.BLUE);
		 
		 Btn6.setForeground(Color.BLUE);
		 Btn6.addActionListener(this);
		 panel.add(Btn6);
		 
		Btn7 =new JButton("2");
		 Btn7.setBounds(r.nextInt(800),r.nextInt(400),100,100);
		 Btn7.setBackground(Color.BLUE);
		 Btn7.setForeground(Color.BLUE);
		 Btn7.addActionListener(this);
		 panel.add(Btn7);
		 
		 Btn8 =new JButton("3");
		 Btn8.setBounds(r.nextInt(800),r.nextInt(400),100,100);
		 Btn8.setBackground(Color.BLUE);
		 Btn8.setForeground(Color.BLUE);
		 Btn8.addActionListener(this);
		 panel.add(Btn8);
		 
		
		Btn9 =new JButton("4");
		 Btn9.setBounds(r.nextInt(800),r.nextInt(400),100,100);
		 Btn9.setBackground(Color.BLUE);
		 Btn9.setForeground(Color.BLUE);
		 Btn9.addActionListener(this);
		 panel.add(Btn9);
		 
		Btn10 =new JButton("5");
		 Btn10.setBounds(r.nextInt(800),r.nextInt(400),100,100);
		 Btn10.setBackground(Color.BLUE);
		 Btn10.setForeground(Color.BLUE);
		 Btn10.addActionListener(this);
		 panel.add(Btn10);
		 
		 
		 this.add(panel);
	 }
	 public void actionPerformed(ActionEvent ae)
	 {  
		String temp = ae.getActionCommand();
	 
		
		
		if (ae.getSource()==Btn1)
		{
		   
			if(clicked==false)
			{
				clicked=true;
				prev=Btn1.getText();
				Btn1.setBackground(Color.BLACK);
			}
			else if(clicked==true)
			{
			
				post=Btn1.getText();
				check();
			}
		}
		else if (ae.getSource()==Btn2)
		{
			
			
			if(clicked==false)
			{
				clicked=true;
				Btn2.setBackground(Color.BLACK);
				prev=Btn2.getText();
				
			}
			else if(clicked==true)
			{
				
				post=Btn2.getText();
				check();
			}
		}
		else if (ae.getSource()==Btn3)
		{
		    
			if(clicked==false)
			{
				clicked=true;
			Btn3.setBackground(Color.BLACK);
				prev=Btn3.getText();
				
			}
			else if(clicked==true)
			{
				
				post=Btn3.getText();
				check();
			}
		}
		else if (ae.getSource()==Btn4)
		{
			
			if(clicked==false)
			{
				clicked=true;
				
				prev=Btn4.getText();
				Btn4.setBackground(Color.BLACK);
			}
			else if(clicked==true)
			{
			
				post=Btn4.getText();
				check();
			}
		}
		else if (ae.getSource()==Btn5)
		{
	
			if(clicked==false)
			{
				clicked=true;
				Btn5.setBackground(Color.BLACK);
				prev=Btn5.getText();
				
			}
			else if(clicked==true)
			{
				
				post=Btn5.getText();
				check();
			}
		}
		else if (ae.getSource()==Btn6)
		{
			if(clicked==false)
			{
				clicked=true;
				prev=Btn6.getText();
				
				Btn6.setBackground(Color.BLACK);
			}
			else if(clicked==true)
			{
				
				post=Btn6.getText();
				check();
			}
		}
		else if (ae.getSource()==Btn7)
		{
	
			if(clicked==false)
			{
				clicked=true;
				
				prev=Btn7.getText();
				Btn7.setBackground(Color.BLACK);
			}
			else if(clicked==true)
			{
			
				post=Btn7.getText();
				check();
			}
		}
		else if (ae.getSource()==Btn8)
		{
			if(clicked==false)
			{
				clicked=true;
				
				prev=Btn8.getText();
				Btn8.setBackground(Color.BLACK);
			}
			else if(clicked==true)
			{
			
				post=Btn8.getText();
				check();
			}
		}
		else if (ae.getSource()==Btn9)
		{

			if(clicked==false)
			{
				clicked=true;
				prev=Btn9.getText();
				
				Btn9.setBackground(Color.BLACK);
			}
			else if(clicked==true)
			{
				
				post=Btn9.getText();
				check();
			}
		}
		else if (ae.getSource()==Btn10)
		{
			 
			if(clicked==false)
			{
				clicked=true;
				Btn10.setBackground(Color.BLACK);
				prev=Btn10.getText();
				
			}
			else if(clicked==true)
			{
			
				post=Btn10.getText();
				check();
			}
		}
		
	}
	public void check()
	{
		if(prev.equals(post))
		{
			if(Btn1.getText().equals(prev)||(Btn1.getText().equals(post)))
			{
				Btn1.setVisible(false);
				clicked=false;
				s=s+500; //increasing score 500
					scoreLabel.setText("Score: "+s);
			}
			
			 if(Btn2.getText().equals(prev)||(Btn2.getText().equals(post)))
			{
				Btn2.setVisible(false);
				clicked=false;
				s=s+500;
					scoreLabel.setText("Score: "+s);
			}
			if(Btn3.getText().equals(prev)||(Btn3.getText().equals(post)))
			{
				Btn3.setVisible(false);
				clicked=false;
				s=s+500;
					scoreLabel.setText("Score: "+s);
			}
			if(Btn4.getText().equals(prev)||(Btn4.getText().equals(post)))
			{
				Btn4.setVisible(false);
				clicked=false;
				s=s+500;
					scoreLabel.setText("Score: "+s);
			}
			if(Btn5.getText().equals(prev)||(Btn5.getText().equals(post)))
			{
				Btn5.setVisible(false);
				clicked=false;
				s=s+500;
					scoreLabel.setText("Score: "+s);
			}
			if(Btn6.getText().equals(prev)||(Btn6.getText().equals(post)))
			{
				Btn6.setVisible(false);
				clicked=false;
				s=s+500;
					scoreLabel.setText("Score: "+s);
			}
			if(Btn7.getText().equals(prev)||(Btn7.getText().equals(post)))
			{
				Btn7.setVisible(false);
				clicked=false;
				s=s+500;
					scoreLabel.setText("Score: "+s);
			}
			if(Btn8.getText().equals(prev)||(Btn8.getText().equals(post)))
			{
				Btn8.setVisible(false);
				clicked=false;
				s=s+500;
					scoreLabel.setText("Score: "+s);
			}
			if(Btn9.getText().equals(prev)||(Btn9.getText().equals(post)))
			{
				Btn9.setVisible(false);
				clicked=false;
				s=s+500;
					scoreLabel.setText("Score: "+s);
			}
			if(Btn10.getText().equals(prev)||(Btn10.getText().equals(post)))
			{
				Btn10.setVisible(false);
				clicked=false;
				s=s+500;
					scoreLabel.setText("Score: "+s);
			}
			if ( Btn10.isVisible()==false && Btn9.isVisible()==false && Btn8.isVisible()==false && Btn8.isVisible()==false &&
			Btn7.isVisible()==false && Btn6.isVisible()==false && Btn5.isVisible()==false && Btn4.isVisible()==false
			&& Btn3.isVisible()==false && Btn2.isVisible()==false && Btn1.isVisible()==false)
			{
				JOptionPane.showMessageDialog(this, "Your Score : "+s);
				Another r = new Another ();
				r.setVisible(true);
				this.setVisible(false);
			}
		}
		else
		{   
             	s=s-100; //decreasing score 100
			scoreLabel.setText("Score: "+s);
			clicked=false;
			prev=null;
			post=null;
			Btn1.setBackground(Color.GREEN);
			Btn2.setBackground(Color.GREEN);
			Btn3.setBackground(Color.GREEN);
			Btn4.setBackground(Color.GREEN);
			Btn5.setBackground(Color.GREEN);
			Btn6.setBackground(Color.BLUE);
			Btn7.setBackground(Color.BLUE);
			Btn8.setBackground(Color.BLUE);
			Btn9.setBackground(Color.BLUE);
			Btn10.setBackground(Color.BLUE);
			
		}
	}
}
		 
	 