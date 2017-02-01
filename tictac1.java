import java.awt.*;
import java.awt.event.*;
class gamed extends Frame implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,temp;
	Panel p0,p1,p2,p3,p4,p5;
	TextField t1;
	Label l1;
	int i=0,c1=11,c2=12,c3=3,c4=4,c5=5,c6=6,c7=7,c8=8,c9=9;
	String z;
	gamed(String q)
	{
		super(q);
		p0=new Panel();
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		p5=new Panel();
		t1=new TextField(20);
		l1=new Label("Tic-Tac");
		add(p0);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		b1=new Button("");
		b2=new Button("");
		b3=new Button("");
		b4=new Button("");
		b5=new Button("");
		b6=new Button("");
		b7=new Button("");
		b8=new Button("");
		b9=new Button("");
		b10=new Button("refresh");
		p0.add(l1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p3.add(b7);
		p3.add(b8);
		p3.add(b9);
		p4.add(t1);
		p5.add(b10);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		p0.setLayout(new FlowLayout());
		p1.setLayout(new GridLayout(1,3));
		p2.setLayout(new GridLayout(1,3));
		p3.setLayout(new GridLayout(1,3));
		setLayout(new GridLayout(6,1));
	}
	public void actionPerformed(ActionEvent ae)
	{
		z=ae.getActionCommand();
		temp=(Button)ae.getSource();
		if(z.equals("refresh"))
		{
			b1.setLabel("");
			b2.setLabel("");
			b3.setLabel("");
			b4.setLabel("");
			b5.setLabel("");
			b6.setLabel("");
			b7.setLabel("");
			b8.setLabel("");
			b9.setLabel("");
			t1.setText("");
			c1=11;c2=12;c3=3;c4=4;c5=5;c6=6;c7=7;c8=8;c9=9;
		}
		else if(i%2==0)
		{
			if(temp==b1)
			{
				b1.setLabel("*");
				c1=1;
			}
			else if(temp==b2)
			{
				b2.setLabel("*");
				c2=1;
			}
			else if(temp==b3)
			{
				b3.setLabel("*");
                c3=1;
			}				
			else if(temp==b4)
			{
				b4.setLabel("*");
				c4=1;
			}
			else if(temp==b5)
			{
				b5.setLabel("*");
				c5=1;
			}
			else if(temp==b6)
			{
				b6.setLabel("*");
				c6=1;
			}
			else if(temp==b7)
			{
				b7.setLabel("*");
				c7=1;
			}
			else if(temp==b8)
			{
				b8.setLabel("*");
				c8=1;
			}
			else if(temp==b9)
			{
				b9.setLabel("*");
				c9=1;
			}
			
		}
		else
		{
			if(temp==b1)
			{
				b1.setLabel("0");
				c1=2;
			}
			else if(temp==b2)
			{
				b2.setLabel("0");
				c2=2;
			}
			else if(temp==b3)
			{
				b3.setLabel("0");
                c3=2;
			}				
			else if(temp==b4)
			{
				b4.setLabel("0");
				c4=2;
			}
			else if(temp==b5)
			{
				b5.setLabel("0");
				c5=2;
			}
			else if(temp==b6)
			{
				b6.setLabel("0");
				c6=2;
			}
			else if(temp==b7)
			{
				b7.setLabel("0");
				c7=2;
			}
			else if(temp==b8)
			{
				b8.setLabel("0");
				c8=2;
			}
			else if(temp==b9)
			{
				b9.setLabel("0");
				c9=2;
			}
		}
		if(c1==c2 && c2==c3 && c1==c3)
			t1.setText("player "+c1+" is winner");
		else if(c4==c5 && c5==c6 && c4==c6)
			t1.setText("player "+c4+" is winner");
		else if(c7==c8 && c8==c9 && c7==c9)
			t1.setText("player "+c7+" is winner");
		else if(c1==c4 && c4==c7 && c1==c7)
			t1.setText("player "+c1+" is winner");
		else if(c2==c5 && c5==c8 && c2==c8)
		    t1.setText("player "+c2+" is winner");
		else if(c3==c6 && c6==c9 && c3==c9)
			t1.setText("player "+c3+" is winner");
		else if(c1==c5 && c5==c9 && c1==c9)
			t1.setText("player "+c1+" is winner");
		else if(c3==c5 && c5==c7 && c3==c7)
			t1.setText("player "+c3+" is winner");
		
		i++;
	}
}
class tictac1
{
	public static void main(String args[])
	{
		gamed o1=new gamed("tic-tac");
		o1.setSize(300,300);
		o1.setVisible(true);
	}
}
