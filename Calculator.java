import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
private JTextField userTF;
private JLabel label;
private JButton Btn0;
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
 private JButton Btn11;
 private JButton Btn12;
 private JButton Btn13;
 private JButton Btn14;
 private JButton Btn15;
 private JButton Btn16;
 private JButton Btn17;
  private JButton Btn18;
 
   private JPanel panel;
    double number,ans;
    int calculation;
	boolean flag=false;
	
 public Calculator()
 { super("Calculator");
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.pink);
		
		 userTF = new JTextField();
        userTF.setBounds(20,5,370,50);
		 panel.add(userTF);
		 
		  Btn0 = new JButton("0");
        Btn0.setBounds(20,80,50,50);
		Btn0.addActionListener(this);
        panel.add(Btn0);
		
		 
		  Btn1 = new JButton("1");
        Btn1.setBounds(90,80,50,50);
		Btn1.addActionListener(this);
        panel.add(Btn1);
		
		  Btn2 = new JButton("2");
        Btn2.setBounds(160,80,50,50);
		Btn2.addActionListener(this);
        panel.add(Btn2);
		
		  Btn3 = new JButton("3");
        Btn3.setBounds(20,150,50,50);
		Btn3.addActionListener(this);
        panel.add(Btn3);
		
		 Btn4 = new JButton("4");
        Btn4.setBounds(90,150,50,50);
		Btn4.addActionListener(this);
        panel.add(Btn4);
		
		 Btn5 = new JButton("5");
        Btn5.setBounds(160,150,50,50);
		Btn5.addActionListener(this);
        panel.add(Btn5);
		
		 Btn6 = new JButton("6");
        Btn6.setBounds(20,220,50,50);
		Btn6.addActionListener(this);
        panel.add(Btn6);
		
		 Btn7 = new JButton("7");
        Btn7.setBounds(90,220,50,50);
		Btn7.addActionListener(this);
        panel.add(Btn7);
		
		 Btn8 = new JButton("8");
        Btn8.setBounds(160,220,50,50);
		Btn8.addActionListener(this);
        panel.add(Btn8);
		
		 Btn9 = new JButton("9");
        Btn9.setBounds(90,290,50,50);
		Btn9.addActionListener(this);
        panel.add(Btn9);
		
		 Btn10 = new JButton("off");
        Btn10.setBounds(270,80,50,50);
		Btn10.addActionListener(this);
        panel.add(Btn10);
		
		 Btn11 = new JButton("-");
        Btn11.setBounds(340,80,50,50);
		Btn11.addActionListener(this);
        panel.add(Btn11);
		
		 Btn12 = new JButton("*");
        Btn12.setBounds(270,150,50,50);
		Btn12.addActionListener(this);
        panel.add(Btn12);
		
		 Btn13 = new JButton("/");
        Btn13.setBounds(340,150,50,50);
		Btn13.addActionListener(this);
        panel.add(Btn13);
		
		 Btn14 = new JButton("=");
        Btn14.setBounds(270,220,50,50);
		Btn14.addActionListener(this);
        panel.add(Btn14);
		
		Btn15 = new JButton("+");
        Btn15.setBounds(340,220,50,120);
		Btn15.addActionListener(this);
		
        panel.add(Btn15);
		
		Btn16 = new JButton("r");
        Btn16.setBounds(160,290,50,50);
		Btn16.addActionListener(this);
        panel.add(Btn16);
		
		Btn17 = new JButton(".");
        Btn17.setBounds(20,290,50,50);
		Btn17.addActionListener(this);
        panel.add(Btn17);
			Btn18 = new JButton("b");
        Btn18.setBounds(270,290,50,50);
		Btn18.addActionListener(this);
        panel.add(Btn18);
		
		 label=new JLabel();
        label.setBounds(500,200,520,510);
		
		
		
		this.add(panel);
 }
 public void actionPerformed(ActionEvent ae)
	{
		String temp = ae.getActionCommand();

		
		if(temp.equals("0"))
		{   
	    userTF.setText(userTF.getText()+"0");
		}
		else if(temp.equals("1"))
		{   
	    userTF.setText(userTF.getText()+"1");
		}
		else if(temp.equals("2"))
		{   
	    userTF.setText(userTF.getText()+"2");
		}
		 else if(temp.equals("3"))
		{   
	    userTF.setText(userTF.getText()+"3");
		}
		 else if(temp.equals("4"))
		{   
	    userTF.setText(userTF.getText()+"4");
		}
		 else if(temp.equals("5"))
		{   
	    userTF.setText(userTF.getText()+"5");
		}
		else if(temp.equals("6"))
		{   
	    userTF.setText(userTF.getText()+"6");
		}
		else if(temp.equals("7"))
		{   
	    userTF.setText(userTF.getText()+"7");
		}
		 else if(temp.equals("8"))
		{   
	    userTF.setText(userTF.getText()+"8");
		}
		else if(temp.equals("9"))
		{   
	    userTF.setText(userTF.getText()+"9");
		}
		else if(temp.equals("off"))
		{   
	   
		System.exit(0);
		   
		}
		else if(temp.equals("-"))
		{   
	    
		number=Double.parseDouble(userTF.getText());
           calculation=2;
          userTF.setText("");
           label.setText(number+"-");
	
		}
		else if(temp.equals("*"))
		{   
	   
		number=Double.parseDouble(userTF.getText());
           calculation=3;
          userTF.setText("");
           label.setText(number+"*");
		
		}
		else if(temp.equals("/"))
		{   
	    
		number=Double.parseDouble(userTF.getText());
           calculation=4;
           userTF.setText("");
           label.setText(number+"/");
	
		}
		
		else if(temp.equals("+"))
		{      
	    
	 
           number=Double.parseDouble(userTF.getText());
           calculation=1;
          userTF.setText("");
           label.setText(number+"+");
         
        }
		
		else if(temp.equals("r"))
		{   
	    
		userTF.setText("");
		}
		else if(temp.equals("."))
		{   
	         
			
			if (userTF.getText().contains(".")) {
                return;
            } else {
                userTF.setText(userTF.getText() + ".");
            }
			
		
		}
		else if (temp.equals("b"))
		{int length=userTF.getText().length();
           int number=userTF.getText().length()-1;
           String store;
           if(length>0)
           {
            StringBuilder back=new StringBuilder(userTF.getText());
            back.deleteCharAt(number);
            store=back.toString();
           userTF.setText(store);
           }
           
		}
		else if (temp.equals("="))
		{
			arithmatic_operation();
           label.setText("");
		}
	}
	 public void arithmatic_operation()
    {  
         switch(calculation)
         {
             case 1:
                 ans=number+Double.parseDouble(userTF.getText());
                 userTF.setText(Double.toString(ans));
                 break;
             case 2:
                 ans=number-Double.parseDouble(userTF.getText());
                 userTF.setText(Double.toString(ans));
                 break;
             case 3:
                 ans=number*Double.parseDouble(userTF.getText());
               userTF.setText(Double.toString(ans));
                 break;  
             case 4:
                 ans=number/Double.parseDouble(userTF.getText());
                userTF.setText(Double.toString(ans));
                 break;    
		 }   
              
         
		 
    }
 
}
