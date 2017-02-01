import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.math.*;
//import javax.swing.*;
public class myNewClock extends Applet implements Runnable
{
	double A=270,r=90,Rd,bd,B=270,a2,b2,r1=60,r2=40,c2,d2,C=270,cd;
	double x1=300,y1=300,x2=0,y2=0;
	int a=300,b=300,c=300,d=210,i=300,j=240,q=300,p=260;
		Thread t1;
			public void init()
			{
				//setBackground(Color.green);
				t1=new Thread(this,"amit");
				t1.start();
			}
public void run(){
	
	       while(A<361){
			   try{
			Thread.sleep(100);
		    //Rd=(A*3.14)/180; 
			if(A<90){
				Rd=(A*3.14)/180; 
		   x2=x1+(r*Math.cos(Rd));
           y2=y1+(r*Math.sin(Rd));
		   c=(int)x2;d=(int)y2;
			}
			else if(90<A && A<180)
			{
				Rd=((180-A)*3.14)/180; 
				x2=x1-(r*Math.cos(Rd));
                y2=y1+(r*Math.sin(Rd));
				c=(int)x2;d=(int)y2;
			}
			else if(180<A && A<270)
			{
				Rd=((270-A)*3.14)/180; 
				y2=x1-(r*Math.cos(Rd));
                x2=y1-(r*Math.sin(Rd));
				c=(int)x2;d=(int)y2;
			}
			else{
				Rd=((360-A)*3.14)/180; 
				x2=x1+(r*Math.cos(Rd));
                y2=y1-(r*Math.sin(Rd));
				c=(int)x2;d=(int)y2;
			}
	       repaint();
			if(A==360)
			{
				A=0;
			}
			A=A+6;
			if(A==270)
			{
				B=B+6;
				if(B<90){
				bd=(B*3.14)/180; 
		   a2=x1+(r1*Math.cos(bd));
           b2=y1+(r1*Math.sin(bd));
            i=(int)a2;j=(int)b2;
			}
			else if(90<B && B<180)
			{
				bd=((180-B)*3.14)/180; 
				a2=x1-(r1*Math.cos(bd));
                b2=y1+(r1*Math.sin(bd));
				i=(int)a2;j=(int)b2;
			}
			else if(180<B && B<270)
			{
				bd=((270-B)*3.14)/180; 
			    b2=x1-(r1*Math.cos(bd));
                a2=y1-(r1*Math.sin(bd));
                 i=(int)a2;j=(int)b2;
			}
			else{
				bd=((360-B)*3.14)/180; 
				a2=x1+(r1*Math.cos(bd));
                b2=y1-(r1*Math.sin(bd));
				i=(int)a2;j=(int)b2;
			}
			if(B==270)
			{
				C=C+6;
				if(C<90){
				cd=(C*3.14)/180; 
		   c2=x1+(r2*Math.cos(cd));
           d2=y1+(r2*Math.sin(cd));
           q=(int)c2;p=(int)d2;
			}
			else if(90<C && C<180)
			{
				cd=((180-C)*3.14)/180; 
				c2=x1-(r2*Math.cos(cd));
                d2=y1+(r2*Math.sin(cd));
                q=(int)c2;p=(int)d2;
			}
			else if(180<C && C<270)
			{
				cd=((270-C)*3.14)/180; 
			    d2=x1-(r2*Math.cos(cd));
                c2=y1-(r2*Math.sin(cd));
                 q=(int)c2;p=(int)d2;
			}
			else{
				cd=((360-C)*3.14)/180; 
				c2=x1+(r2*Math.cos(cd));
                d2=y1-(r2*Math.sin(cd));
                 q=(int)c2;p=(int)d2;
			}
			if(C==360)
			{
				C=0;
			}
			
			   }
			if(B==360)
			{B=0;}
		  
			
			}
			}
			catch(Exception e){}
			 }
	}			
	public void paint(Graphics g)
	{
		//System.out.println(a+" "+b+" "+c+" "+d);
		    g.setColor(Color.pink);
			g.drawLine(a,b,c,d);
			g.setColor(Color.blue);
			g.drawLine(300,300,i,j);
			g.setColor(Color.red);
			g.drawLine(300,300,q,p);
			g.setColor(Color.black);
			g.drawString("12",297,200);
			g.drawString("1",350,214);
			g.drawString("2",386,250);
			g.drawString("3",400,303);
			g.drawString("4",386,350);
	        g.drawString("5",350,386);
            g.drawString("6",297,400);
			g.drawString("7",250,386);
			g.drawString("8",214,350);
			g.drawString("9",200,303);
			g.drawString("10",212,253);
			g.drawString("11",248,217);
	}
}
/*
<applet code="myNewClock" width=800 height=800>
</applet>
*/
