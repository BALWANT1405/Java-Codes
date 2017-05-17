import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


public class progress_bar extends JFrame

{
	
	int i;
	JLabel l1=new JLabel("SWAMI SARAVANAND GIRI PANJAB UNIVERSITY");
	JLabel l2=new JLabel();
	JProgressBar p= new JProgressBar();
	
	public progress_bar()
	{
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(900,900);
	
		l1.setBounds(100,200,500,50);
		add(l1);
		
		l1.setFont(new Font("Arial",Font.BOLD,20));
		l1.setForeground(Color.RED);
		add(l1);
		
		p.setBounds(200,350,500,60);
		add(p);
	
		l2.setBounds(230,400,500,300);
		add(l2);
		l2.setForeground(Color.MAGENTA);
		add(l2);
		for(i=0;i<=100;i++)
		{
			p.setValue(i);
			l2.setText("LOADING: "+i+"%");
			
		if(i>99)
		{
			JOptionPane.showMessageDialog(null,"PROGRESS DONE SUCCESSFULLY");
			new clg_frame_database();
			this.hide();
		}
		try
		{
			Thread.sleep(80);
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		
		}
		
	}
	
	public static void main(String[] args) 
	
	{
		new progress_bar();


	}

}
