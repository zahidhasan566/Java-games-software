import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Another extends JFrame implements ActionListener 
{
	private JLabel userLabel;
	 private JButton playagain;
	 private JButton no;
	 private JPanel panel;
	public Another()
	{
		super ("Play again");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		panel.setLayout(null);
		
		userLabel=new JLabel("Do You Want To Play Again ?");
		 userLabel.setBounds(300, 150, 200, 30);
		 panel.add(userLabel);
		 
		playagain =new JButton("play again");
		playagain.setBounds(300, 200, 100, 30);
		 playagain.setBackground(Color.GREEN);
		 playagain.addActionListener(this);
		 panel.add(playagain);
		 
		 no =new JButton(" no ");
		no.setBounds(520, 200, 100, 30);
		 no.setBackground(Color.RED);
		 no.addActionListener(this);
		 panel.add(no);
		  this.add(panel);
		  
	}
	public void actionPerformed(ActionEvent ae)
	 {  
		String temp = ae.getActionCommand();
	 
		if (ae.getSource()==playagain)
		{
			 Puzzle p =new Puzzle();
			
			p.setVisible(true);
			this.setVisible(false);
		}
		if (ae.getSource()==no)
		{   
	       System.exit(0);
		}
	
}
}