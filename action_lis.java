import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class action_lis extends Applet implements ActionListener
{

	Button b=new Button("CHECKED IT OUT");
	Button b1=new Button("PRINT");
	public void init()
	{
		this.setLayout(null);
		b.setBounds(300,300,120,70);
		b1.setBounds(500,300,120,70);
		add(b);
		add(b1);
		b.addActionListener(this);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ar) 
	{
		if(ar.getSource()==b)
		{
			JOptionPane.showMessageDialog(null,"MY NAME IS BALWANT");
			
		}
		if(ar.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null,"YOU HAVE BEEN PRINTING 100 PAGES");
		}
		
		
	}

}
