import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class Threads extends JFrame implements Runnable,ActionListener
{
	JButton Btn1;
	JButton Btn2;
	JButton Btn3;
	JButton Btn4;
	JButton Btn5;
	JButton Btn6;
	JButton Btn7;
	JButton Btn8;
	JButton Btn9;
	JButton Btn10;
	JButton Btn11;
	JButton exit;
	
	private JButton button[];
	private JLabel scoreLabel;
	boolean clicked=false;
	 private int s=0; 
	
	
	JPanel panel;
	
	Random r;
	int x, y;
	public Threads()
	{
		r = new Random();
		x=0;
		y=0;
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		 Btn1 =new JButton();
		 Btn1.setBounds(10,80,100,100);
		 Btn1.setBackground(Color.GREEN);
		 Btn1.addActionListener(this);
		  panel.add(Btn1);
		 
		  Btn2 =new JButton();
		 Btn2.setBounds(110,80,100,100);
		 Btn2.setBackground(Color.GREEN);
		  Btn2.addActionListener(this);
		
		  panel.add(Btn2);
		 
		  Btn3 =new JButton();
		 Btn3.setBounds(210,80,100,100);
		 Btn3.setBackground(Color.GREEN);
		  Btn3.addActionListener(this);
		  panel.add(Btn3);
		 
		  Btn4 =new JButton();
		 Btn4.setBounds(10,180,100,100);
		 Btn4.setBackground(Color.GREEN);
		  Btn4.addActionListener(this);
		  panel.add(Btn4);
		 
		  Btn5 =new JButton();
		 Btn5.setBounds(110,180,100,100);
		 Btn5.setBackground(Color.GREEN);
		  Btn5.addActionListener(this);
		  panel.add(Btn5);
		 
		  Btn6 =new JButton();
		 Btn6.setBounds(210,180,100,100);
		 Btn6.setBackground(Color.GREEN);
		  Btn6.addActionListener(this);
		  panel.add(Btn6);
		 
		  Btn7 =new JButton();
		 Btn7.setBounds(310,80,100,100);
		 Btn7.setBackground(Color.GREEN);
		  Btn7.addActionListener(this);
		  panel.add(Btn7);
		 
		  Btn8 =new JButton();
		 Btn8.setBounds(410,80,100,100);
		 Btn8.setBackground(Color.GREEN);
		  Btn8.addActionListener(this);
		  panel.add(Btn8);
		 
		  Btn9 =new JButton();
		 Btn9.setBounds(310,180,100,100);
		 Btn9.setBackground(Color.GREEN);
		  Btn9.addActionListener(this);
		  panel.add(Btn9);
		 
		  Btn10 =new JButton();
		 Btn10.setBounds(410,180,100,100);
		 Btn10.setBackground(Color.GREEN);
		  Btn10.addActionListener(this);
		  panel.add(Btn10);
		  
		  exit =new JButton("exit");
		 exit .setBounds(410,2,100,50);
		 exit.setBackground(Color.RED);
		  exit.addActionListener(this);
		  panel.add(exit);
		  
		   scoreLabel=new JLabel("score:"+s);
		 scoreLabel.setBounds(15,2,100,100);
		 panel.add(scoreLabel);
		

	this.add(panel);
	}
	
	public void run()
	{
		int x=0, y=0;
		button= new JButton[]{Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Btn10};
		for(int i=0; i<20; i++)
		{
			try
			{
				y=x;
				x=r.nextInt(8);
				System.out.println(x);
				button[x].setBackground(Color.YELLOW);
				Thread.sleep(1500);
				button[x].setBackground(Color.GREEN);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		JOptionPane.showMessageDialog(this, "Your Score : "+s);
	}
	
	public void actionPerformed(ActionEvent ae)
	 {  
		String temp = ae.getActionCommand();
		
	 if (ae.getSource()==Btn1)
	 {    
 
       if (Btn1.getBackground()== Color.YELLOW)
	   {        clicked=true;
               
	
	   }
	   
	    else if (Btn1.getBackground()!= Color.YELLOW)
	   {        clicked=false;
                 s=s-500; //decreasing score
               scoreLabel.setText("Score: "+s);
	
	   }
	   if (  clicked == true){
	       s=s+500; //increasing score 500
	   scoreLabel.setText("Score: "+s);}
	 }
	 
	 if (ae.getSource()==Btn2)
	 {    
 
       if (Btn2.getBackground()== Color.YELLOW)
	   {        clicked=true;
               
	
	   }
	   
	    else if (Btn2.getBackground()!= Color.YELLOW)
	   {        clicked=false;
                 s=s-500;
               scoreLabel.setText("Score: "+s);
	
	   }
	   if (  clicked == true){
	       s=s+500; //increasing score 500
	   scoreLabel.setText("Score: "+s);}
	 }
	 
	 if (ae.getSource()==Btn3)
	 {    
 
       if (Btn3.getBackground()== Color.YELLOW)
	   {        clicked=true;
               
	
	   }
	   
	    else if (Btn3.getBackground()!= Color.YELLOW)
	   {        clicked=false;
                 s=s-500;
               scoreLabel.setText("Score: "+s);
	
	   }
	   if (  clicked == true){
	       s=s+500; //increasing score 500
	   scoreLabel.setText("Score: "+s);}
	 }
	 if (ae.getSource()==Btn4)
	 {    
 
       if (Btn4.getBackground()== Color.YELLOW)
	   {        clicked=true;
               
	
	   }
	   
	    else if (Btn4.getBackground()!= Color.YELLOW)
	   {        clicked=false;
                 s=s-500;
               scoreLabel.setText("Score: "+s);
	
	   }
	   if (  clicked == true){
	       s=s+500; //increasing score 500
	   scoreLabel.setText("Score: "+s);}
	 }
	 
	 if (ae.getSource()==Btn5)
	 {    
 
       if (Btn5.getBackground()== Color.YELLOW)
	   {        clicked=true;
               
	
	   }
	   
	    else if (Btn5.getBackground()!= Color.YELLOW)
	   {        clicked=false;
                 s=s-500;
               scoreLabel.setText("Score: "+s);
	
	   }
	   if (  clicked == true){
	       s=s+500; //increasing score 500
	   scoreLabel.setText("Score: "+s);}
	 }
	 if (ae.getSource()==Btn6)
	 {    
 
       if (Btn6.getBackground()== Color.YELLOW)
	   {        clicked=true;
               
	
	   }
	   
	    else if (Btn6.getBackground()!= Color.YELLOW)
	   {        clicked=false;
                 s=s-500;
               scoreLabel.setText("Score: "+s);
	
	   }
	   if (  clicked == true){
	       s=s+500; //increasing score 500
	   scoreLabel.setText("Score: "+s);}
	 }
	 if (ae.getSource()==Btn7)
	 {    
 
       if (Btn7.getBackground()== Color.YELLOW)
	   {        clicked=true;
               
	
	   }
	   
	    else if (Btn7.getBackground()!= Color.YELLOW)
	   {        clicked=false;
                 s=s-500;
               scoreLabel.setText("Score: "+s);
	
	   }
	   if (  clicked == true){
	       s=s+500; //increasing score 500
	   scoreLabel.setText("Score: "+s);}
	 }
	 if (ae.getSource()==Btn8)
	 {    
 
       if (Btn8.getBackground()== Color.YELLOW)
	   {        clicked=true;
               
	
	   }
	   
	    else if (Btn8.getBackground()!= Color.YELLOW)
	   {        clicked=false;
                 s=s-500;
               scoreLabel.setText("Score: "+s);
	
	   }
	   if (  clicked == true){
	       s=s+500; //increasing score 500
	   scoreLabel.setText("Score: "+s);}
	 }
	 if (ae.getSource()==Btn9)
	 {    
 
       if (Btn9.getBackground()== Color.YELLOW)
	   {        clicked=true;
               
	
	   }
	   
	    else if (Btn9.getBackground()!= Color.YELLOW)
	   {        clicked=false;
                 s=s-500;
               scoreLabel.setText("Score: "+s);
	
	   }
	   if (  clicked == true){
	       s=s+500; //increasing score 500
	   scoreLabel.setText("Score: "+s);}
	 }
	 if (ae.getSource()==Btn10)
	 {    
 
       if (Btn10.getBackground()== Color.YELLOW)
	   {        clicked=true;
               
	
	   }
	   
	    else if (Btn10.getBackground()!= Color.YELLOW)
	   {        clicked=false;
                 s=s-500;
               scoreLabel.setText("Score: "+s);
	
	   }
	   if (  clicked == true){
	       s=s+500; //increasing score 500
	   scoreLabel.setText("Score: "+s);
	   }
	   
	   
	 }
	  if (ae.getSource()==exit)
		{
			System.exit(0);
		}
	 
	 }
	 
	 
  }