import java.awt.*;
import java.awt.event.*;
class ButtonD extends Frame implements ActionListener
{
	Button b1,b2,b3,b4;
	Label l;
	TextField t1,t2,t3;
	public ButtonD()
	{
		setLayout(null);
		b1=new Button("add");
		b2=new Button("sub");
		b3=new Button("mul");
		b4=new Button("div");
		l=new Label("enter two numbers");
		t1=new TextField(30);
		t2=new TextField(30);
		t3=new TextField(30);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l);
		add(t1);
		add(t2);
		add(t3);
		l.setBounds(50,50,100,20);
		t1.setBounds(50,80,30,20);
		t2.setBounds(100,80,30,20);
		b1.setBounds(50,110,30,20);
		b2.setBounds(90,110,30,20);
		b3.setBounds(130,110,30,20);
		b4.setBounds(170,110,30,20);
		t3.setBounds(50,140,50,20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);		
		}
	public void actionPerformed(ActionEvent i)
		{
			int a,b,c;
			if(i.getSource()==b1)
			{
			setBackground(Color.blue);
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c= a+b;
			t3.setText(c+"");
			}
			else if(i.getSource()==b2)
			{
			setBackground(Color.green);
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c= a-b;
			t3.setText(c+"");
			}
			 else if(i.getActionCommand().equals("mul"))
			{
			setBackground(Color.yellow);
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c= a*b;
			t3.setText(c+"");
			}
			 else if(i.getActionCommand().equals("div"))
			{
			setBackground(Color.black);
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c= a/b;
			t3.setText(c+"");
			}
		}
	public static void main(String a[])
	{
		
		ButtonD b=new ButtonD();
		b.setTitle("Govind calc");
		b.setSize(300,300);
		b.setVisible(true);
	}














}
