import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class database extends JFrame implements ActionListener
{
	Connection con;
	Statement st;
	ResultSet rs;
	JLabel l3=new JLabel("Select id");
	JLabel l=new JLabel("Emp id");
	JLabel l1=new JLabel("Name");
	JLabel l2= new JLabel("Department");
	JComboBox c=new JComboBox();
	JTextField t=new JTextField();
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JButton b=new JButton("Insert");
	JButton b1=new JButton("Delete");
	JButton b2=new JButton("Update");
	JButton b3=new JButton("Select");
	JButton b4=new JButton("Clear");
	public database()
	{
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(500,600);
		l.setFont(new Font("Arial",Font.BOLD,20));
		l.setForeground(Color.cyan);
		l3.setBounds(100,50,100,30);
		add(l3);
		l.setBounds(100,100,100,30);
		add(l);
		t.setBounds(200,100,100,30);
		add(t);	
		l1.setBounds(100,150,100,30);
		add(l1);
		t1.setBounds(200,150,100,30);
		add(t1);	
		l2.setBounds(100,200,100,30);
		add(l2);
		t2.setBounds(200,200,100,30);
		add(t2);	
		b.setBounds(200,300,100,30);
		add(b);
		b1.setBounds(320,300,100,30);
		add(b1);
		b2.setBounds(440,300,100,30);
		add(b2);
		b3.setBounds(560,300,100,30);
		add(b3);
		b4.setBounds(680,300,100,30);
		add(b4);
		c.setBounds(200,50,100,30);
		add(c);
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/employee","root","");
	st=con.createStatement();	
	}
	catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}
	
	try
	{
	rs=st.executeQuery("select * from emp ");
			while(rs.next())
			{
			c.addItem(String.valueOf(rs.getString(1)));
			
				}
			
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null,ex.getMessage());
				}	
				}
	
	
	
	public static void main(String[] args) {
		
new database();
	}

	public void actionPerformed(ActionEvent ar) 
	{
	if(ar.getSource()==b)
	{
	try
	{
st.executeUpdate("Insert into emp values('"+t.getText()+"','"+t1.getText()+"','"+t2.getText()+"')");	
JOptionPane.showMessageDialog(null,"Record Inserted");
	}
	catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}	
	}
	if(ar.getSource()==b1)
	{
	try
	{
st.executeUpdate("delete from emp where id='"+t.getText()+"'");	
JOptionPane.showMessageDialog(null,"Record Deleted");
	}
	catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null,"Not Deleted");
	}	
	}
	if(ar.getSource()==b2)
	{
	try
	{
st.executeUpdate("update  emp set name='"+t1.getText()+"',dept='"+t2.getText()+"' where id='"+t.getText()+"'");	
JOptionPane.showMessageDialog(null,"Record Updated");
	}
	catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null,"Not Updated");
	}	
	}
	if(ar.getSource()==b3)
	{
	try
	{
rs=st.executeQuery("select * from emp where id='"+c.getSelectedItem()+"'");
if(rs.next())
{
	t.setText(String.valueOf(rs.getString(1)));
t1.setText(String.valueOf(rs.getString(2)));
t2.setText(String.valueOf(rs.getString(3)));
	}
else
{
	JOptionPane.showMessageDialog(null,"Id not Available");	
}
	}
	catch(Exception ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage());
	}	
	}
	}

}
