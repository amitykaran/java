import java.awt.*;
import java.awt.event.*;
class aug151c extends Frame implements ActionListener
{
	TextField t1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33;
	Panel p1,p2,p3,p4,p5,p6,p7,p8;
	String z="",s;
	//char[] s=new char[10];
	int a,c,p;
	char b;
	aug151c()
	{
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		p5=new Panel();
		p6=new Panel();
		p7=new Panel();
		p8=new Panel();
		/*p3=new Panel();
		p3=new Panel();
		p3=new Panel();
		p3=new Panel();*/
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		b1=new Button("view");
		b2=new Button("edit");
		b3=new Button("help");
		t1=new TextField(20);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p2.add(t1);
		b4=new Button("MC");
		b5=new Button("7");
		b6=new Button("4");
		b7=new Button("1");
		b8=new Button("0");
		b9=new Button("extra");
		b10=new Button("MR");
		b11=new Button("CE");
		b12=new Button("8");
		b13=new Button("5");
		b14=new Button("2");
		b15=new Button("MS");
		b16=new Button("M-");
		b17=new Button("C");
		b18=new Button("9");
		b19=new Button("6");
		b20=new Button("3");
		b21=new Button(".");
		b22=new Button("M+");
		b23=new Button("+-");
		b24=new Button("/");
		b25=new Button("*");
		b26=new Button("-");
		b27=new Button("=");
		b28=new Button("sqrt");
		b29=new Button("%");
		b30=new Button("1/x");
		b31=new Button("=");
		b32=new Button("+");
		b33=new Button("ext");
		p3.add(b4);
		p5.add(b5);
		p6.add(b6);
		p7.add(b7);
		p8.add(b8);
		p4.add(b9);
		p3.add(b10);
		p4.add(b11);
		p5.add(b12);
		p6.add(b13);
		p7.add(b14);
		p3.add(b15);
		p3.add(b16);
		p4.add(b17);
		p5.add(b18);
		p6.add(b19);
		p7.add(b20);
		p8.add(b21);
		p3.add(b22);
		p4.add(b23);
		p5.add(b24);
		p6.add(b25);
		p7.add(b26);
		p8.add(b27);
		p4.add(b28);
		p5.add(b29);
		p6.add(b30);
		p7.add(b31);
		p8.add(b32);
		p8.add(b33);
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
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		b27.addActionListener(this);
		b28.addActionListener(this);
		b29.addActionListener(this);
		b30.addActionListener(this);
		b31.addActionListener(this);
		b32.addActionListener(this);
		b33.addActionListener(this);
		//b30.addActionListener(this);
		p1.setLayout(new GridLayout(1,5));
		p2.setLayout(new FlowLayout());
		p3.setLayout(new GridLayout(1,5));
		p4.setLayout(new GridLayout(1,5));
		p5.setLayout(new GridLayout(1,5));
		p6.setLayout(new GridLayout(1,5));
		p7.setLayout(new GridLayout(1,5));
		p8.setLayout(new GridLayout(1,5));
		setLayout(new GridLayout(8,1));
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		s=ae.getActionCommand();
		
		if(s.equals("="))
		{
			//a=(int)s.charAt(0);
			//a=Integer.parseInt(s.charAt(0));
			//c=Integer.parseInt(s.charAt(2));
			//b=s.charAt(1);
			//c=(int)s.charAt(2);
			char[] ar=z.toCharArray();
			a=(int)ar[0]-48;
			b=ar[1];
			c=(int)ar[2]-48;
			if(b=='+')
			{
				p=a+c;
				t1.setText(p+" ");
			}
			else if(b=='-')
			{
				p=a-c;
				t1.setText(p+" ");
			}
			else if(b=='*')
			{
				p=a*c;
				t1.setText(p+" ");
			}
			else if(b=='/')
			{
				p=a/c;
				t1.setText(p+" ");
			}
			z="";
		}
		else{
			z=z+s;
		t1.setText(z);
		}
		
	}
}
class calculator
{
public static void main(String args[])
{

aug151c o1= new aug151c();
o1.setSize(200,300);
//o1.setSize(800,800);
o1.setVisible(true);
}
}
