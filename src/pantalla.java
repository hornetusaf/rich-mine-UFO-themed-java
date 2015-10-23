import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class pantalla {
	JFrame jf;
	String cad;
	JButton nuevojuego, cargarpartida, tablaposiciones, creditos, salir;
	JLabel ovni1, ovni2, ovni3, ovni4, ovni5, ovni6, cañon1, cañon2, cañon3, cañon4, cañon5, camion, bola, ovnid1, ovnid2, ovnid3, ovnid4;
    Timer t;
    Label sp;
    int band=0,var, xb,yb,jx,jy,kx,ky,clickx,clicky, numbola=0,o1x,o1y,dx1,dy1,dx2,dy2,dx3,dy3,dx4,dy4, band1=0,band2=0,band3=0,band4=0;
	int up=0,down=0,left=0,right=0,cont=0;
	public pantalla(){
		
	}
	
	public pantalla(JButton a, JButton b, JButton c, JButton d, JButton e, JLabel ov1, JLabel ov2, 
			        JLabel ov3, JLabel ov4, JLabel ca1,  JLabel ca2,  JLabel ca3,  JLabel ca4, 
			        JLabel ca5, JLabel cam, JLabel bol, JLabel ovd1, JLabel ovd2, JLabel ovd3, JLabel ovd4){		
		nuevojuego=a; 
		cargarpartida=b; 
		tablaposiciones=c; 
		creditos=d; 
		salir=e; 
		ovni1=ov1;
		ovni2=ov2; 
		ovni3=ov3; 
		ovni4=ov4; 		
		cañon1=ca1; 
		cañon2=ca2; 
		cañon3=ca3; 
		cañon4=ca4; 
		cañon5=ca5; 
		camion=cam; 
		bola=bol;	
		ovnid1=ovd1;
		ovnid2=ovd2;
		ovnid3=ovd3;
		ovnid4=ovd4;
	
		
	}
	
	
	public void fondo(JButton a, JButton b, JButton c, JButton d, JButton e, final JLabel ov1, final JLabel ov2, 
			final JLabel ov3, final JLabel ov4, final JLabel ca1, final JLabel ca2, final JLabel ca3, final JLabel ca4, 
			final JLabel ca5, final JLabel ca6, final JLabel cam, final JLabel bol, JLabel bas, final JLabel ovd1, final JLabel ovd2, final JLabel ovd3, final JLabel ovd4){
		
		final JFrame jf = new JFrame("Cazadores de Ovnis");
		jf.getContentPane().setLayout(null);
		jf.setBounds(100, 100, 900, 582);
		jf.setVisible(true);
		jf.setResizable(false);
		
		final clase_sonido y= new clase_sonido();        
        y.playWav("call.wav");
        
       
		
		if(a!=null)
			jf.add(a);
		if(b!=null)
			jf.add(b);
		if(c!=null)
			jf.add(c);
		if(d!=null)
			jf.add(d);
		if(e!=null)
			jf.add(e);
		if(ov1!=null)
			jf.add(ov1);
		if(ov2!=null)
			jf.add(ov2);
		if(ov3!=null)
			jf.add(ov3);
		if(ov4!=null)
			jf.add(ov4);
		if(cam!=null)
			jf.add(cam);
		if(ca1!=null)
			jf.add(ca1);
		if(ca2!=null)
			jf.add(ca2);
		if(ca3!=null)
			jf.add(ca3);
		if(ca4!=null)
			jf.add(ca4);
		if(ca5!=null)
			jf.add(ca5);
		if(ca6!=null)
			jf.add(ca6);
		if(bol!=null)
			jf.add(bol);		
		if(bas!=null)
			jf.add(bas);		
		
		
		ImageIcon NU1=new ImageIcon("nube1.png");
		final JLabel nu1=new JLabel(NU1);
		nu1.setLayout(null);
		nu1.setBounds(1500,10,222,129);
		jf.add(nu1);
		
		ImageIcon NU2=new ImageIcon("nube2.png");
		final JLabel nu2=new JLabel(NU2);
		nu2.setLayout(null);
		nu2.setBounds(900,110,222,129);
		jf.add(nu2);
		
		ImageIcon so1=new ImageIcon("sol1.png");
		final JLabel sol1=new JLabel(so1);
		sol1.setLayout(null);
		sol1.setBounds(640,40,175,178);
		sol1.setVisible(true);
		jf.add(sol1);
		
		ImageIcon so2=new ImageIcon("sol2.png");
		final JLabel sol2=new JLabel(so2);
		sol2.setLayout(null);
		sol2.setBounds(640,40,175,178);
		sol2.setVisible(false);
		jf.add(sol2);
		
		ImageIcon so3=new ImageIcon("sol3.png");
		final JLabel sol3=new JLabel(so3);
		sol3.setLayout(null);
		sol3.setBounds(640,40,175,178);
		sol3.setVisible(true);
		jf.add(sol3);
		
		ImageIcon so4=new ImageIcon("sol4.png");
		final JLabel sol4=new JLabel(so4);
		sol4.setLayout(null);
		sol4.setBounds(640,40,175,178);
		sol4.setVisible(false);
		jf.add(sol4);
		
		ImageIcon so5=new ImageIcon("sol5.png");
		final JLabel sol5=new JLabel(so5);
		sol5.setLayout(null);
		sol5.setBounds(640,40,175,178);
		sol5.setVisible(true);
		jf.add(sol5);
		
		ImageIcon so6=new ImageIcon("sol6.png");
		final JLabel sol6=new JLabel(so6);
		sol6.setLayout(null);
		sol6.setBounds(640,40,175,178);
		sol6.setVisible(false);
		jf.add(sol6);
		
		ImageIcon so7=new ImageIcon("sol7.png");
		final JLabel sol7=new JLabel(so7);
		sol7.setLayout(null);
		sol7.setBounds(640,40,175,178);
		sol7.setVisible(true);
		jf.add(sol7);
		
		ImageIcon so8=new ImageIcon("sol8.png");
		final JLabel sol8=new JLabel(so8);
		sol8.setLayout(null);
		sol8.setBounds(640,40,175,178);
		sol8.setVisible(false);
		jf.add(sol8);
		
		
			
		final Timer t = new Timer (10, new ActionListener ()
	    {
	        public void actionPerformed(ActionEvent e)
	        { int x2,y2,x1,y1;
	          
	          if(sol1.isVisible()==true){
	        	  sol1.setVisible(false);
	        	  sol2.setVisible(true);
	        	  sol3.setVisible(false);
	        	  sol4.setVisible(false);
	        	  sol5.setVisible(false);
	        	  sol6.setVisible(false);
	        	  sol7.setVisible(false);
	        	  sol8.setVisible(false);
	          }          
	          else if(sol2.isVisible()==true){
	        	  sol1.setVisible(false);
	        	  sol2.setVisible(false);
	        	  sol3.setVisible(true);
	        	  sol4.setVisible(false);
	        	  sol5.setVisible(false);
	        	  sol6.setVisible(false);
	        	  sol7.setVisible(false);
	        	  sol8.setVisible(false);
	          } 
	        	  else if(sol3.isVisible()==true){
	            	  sol1.setVisible(false);
	            	  sol2.setVisible(false);
	            	  sol3.setVisible(false);
	            	  sol4.setVisible(true);
	            	  sol5.setVisible(false);
	            	  sol6.setVisible(false);
	            	  sol7.setVisible(false);
	            	  sol8.setVisible(false);          	  
	        	  } 
	          
	        	  else if(sol4.isVisible()==true){
	            	  sol1.setVisible(false);
	            	  sol2.setVisible(false);
	            	  sol3.setVisible(false);
	            	  sol4.setVisible(false);
	            	  sol5.setVisible(true);
	            	  sol6.setVisible(false);
	            	  sol7.setVisible(false);
	            	  sol8.setVisible(false);          	  
	        	  }  
	          
	        	  else if(sol5.isVisible()==true){
	            	  sol1.setVisible(false);
	            	  sol2.setVisible(false);
	            	  sol3.setVisible(false);
	            	  sol4.setVisible(false);
	            	  sol5.setVisible(false);
	            	  sol6.setVisible(true);
	            	  sol7.setVisible(false);
	            	  sol8.setVisible(false);          	  
	        	  }  
	          
	        	  else if(sol6.isVisible()==true){
	            	  sol1.setVisible(false);
	            	  sol2.setVisible(false);
	            	  sol3.setVisible(false);
	            	  sol4.setVisible(false);
	            	  sol5.setVisible(false);
	            	  sol6.setVisible(false);
	            	  sol7.setVisible(true);
	            	  sol8.setVisible(false);          	  
	        	  }  
	          
	        	  else if(sol7.isVisible()==true){
	            	  sol1.setVisible(false);
	            	  sol2.setVisible(false);
	            	  sol3.setVisible(false);
	            	  sol4.setVisible(false);
	            	  sol5.setVisible(false);
	            	  sol6.setVisible(false);
	            	  sol7.setVisible(false);
	            	  sol8.setVisible(true);          	  
	        	  }  
	          
	        	  else if(sol8.isVisible()==true){
	            	  sol1.setVisible(true);
	            	  sol2.setVisible(false);
	            	  sol3.setVisible(false);
	            	  sol4.setVisible(false);
	            	  sol5.setVisible(false);
	            	  sol6.setVisible(false);
	            	  sol7.setVisible(false);
	            	  sol8.setVisible(false);          	  
	        	  }  
	          
	          x1=nu1.getX();
	          y1=nu1.getY();
	          x2=nu2.getX();
	          y2=nu2.getY();
	          
	          if(x1>-300)
	          {
	        		  nu1.setLocation(x1-2, y1);
	          } 
	          else 
	        	  nu1.setLocation(x1+1200, y1);
	          
	          if(x2>-300)
	          {
	        	  nu2.setLocation(x2-1, y2);	      
	          }
	          else
	        	  nu2.setLocation(x2+1400, y2);
	          
	      }
	    });
	 
	 
		t.start();
		
		
		
		jf.addWindowListener(new WindowAdapter () 
		{
		public void windowClosing (WindowEvent u)
			{
				System.exit(0);
			
			}
		});
		
		if(cam!=null)
		{
		jf.addMouseMotionListener(new MouseMotionAdapter()
		{
			
			public void mouseMoved(MouseEvent m)
			{ int x;
			  x=m.getX();	
			  
			  if(x<150)
				  cam.setLocation(150, cam.getY());
			  else if(x>700)
				  cam.setLocation(700, cam.getY());
			  else 
			  cam.setLocation(x, cam.getY());
			  
			  if(x>100 && x<290)
			  {
				  ca1.setVisible(true);
				  ca2.setVisible(false);
				  ca3.setVisible(false);
				  ca4.setVisible(false);
				  ca5.setVisible(false);
				  ca6.setVisible(false);
				  
			  }
			  if(x>290 && x<380)
			  {
				  ca1.setVisible(false);
				  ca2.setVisible(true);
				  ca3.setVisible(false);
				  ca4.setVisible(false);
				  ca5.setVisible(false);
				  ca6.setVisible(false);
				  
			  }
			  if(x>380 && x<470)
			  {
				  ca1.setVisible(false);
				  ca2.setVisible(false);
				  ca3.setVisible(true);
				  ca4.setVisible(false);
				  ca5.setVisible(false);
				  ca6.setVisible(false);
				  
			  }
			  if(x>470 && x<560)
			  {
				  ca1.setVisible(false);
				  ca2.setVisible(false);
				  ca3.setVisible(false);
				  ca4.setVisible(true);
				  ca5.setVisible(false);
				  ca6.setVisible(false);
				  
			  }	
			  if(x>560 && x<650)
			  {
				  ca1.setVisible(false);
				  ca2.setVisible(false);
				  ca3.setVisible(false);
				  ca4.setVisible(false);
				  ca5.setVisible(true);
				  ca6.setVisible(false);
				  
			  }	
			  if(x>650 && x<740)
			  {
				  ca1.setVisible(false);
				  ca2.setVisible(false);
				  ca3.setVisible(false);
				  ca4.setVisible(false);
				  ca5.setVisible(false);
				  ca6.setVisible(true);
				  
			  }					  	
			}
		});
		}
		
		  	
			
			
		jf.addMouseListener (new MouseAdapter()
		{
			 public void mouseClicked(final MouseEvent m)
			 {
				 
				 if(bol!=null){				 
					
					 bol.setBounds(110,440,38,41);			 									
					 
					 	final JButton sc=new JButton("+10");
						sc.setLayout(null);
						sc.setBackground(Color.RED);
						

						  Label sc1=new Label("Puntaje= "+cont);	
						  sp=sc1;
						  jf.add(sp,0);
						
						
					 
					up=0;
					down=0;
					right=0;
					left=0;
					band=0;
					
					
					 ovni1=ov1;
					 ovni2=ov2;
					 ovni3=ov3;
					 ovni4=ov4;
					 ovnid1=ovd1;
					 ovnid2=ovd2;
					 ovnid3=ovd3;
					 ovnid4=ovd4;					
					 
						bola=bol;
						bola.setVisible(true);
						jf.add(bola,0);
						bola.setFocusable(true);					
						
						
			            xb=bola.getX();
		            	yb=bola.getY();	
						kx=m.getX()-bola.getX();
			            jx=kx/100;
			            ky=bola.getY()-m.getY();
			            jy=ky/100;
			            
			            clickx=m.getX();
			            clicky=m.getY();      
				        	    
				         //
				         
			            
				         Timer t = new Timer (10, new ActionListener ()
					        {
					            public void actionPerformed(ActionEvent e)
					            { 
					            	 
					            	  dx1=ovnid1.getX();
					            	  dy1=ovnid1.getY();
					            	  dx2=ovnid2.getX();
					            	  dy2=ovnid2.getY();
					            	  dx3=ovnid3.getX();
					            	  dy3=ovnid3.getY();
					            	  dx4=ovnid4.getX();
					            	  dy4=ovnid4.getY();
					            	  xb=bola.getX();
					            	  yb=bola.getY();					           
					            	 
					            	  if(clickx>bola.getX() && clicky<bola.getY() && up==0 && down==0 && left==0 && right==0 )
								         {
								        	 down=0;
								        	 left=0;
					            		  	 up=1;
								         	 right=1;
								         }
								         if(clickx<bola.getX() && clicky<bola.getY() && up==0 && down==0 && left==0 && right==0 )
								         {		
								        	 down=0;
								        	 right=0;
								        	 up=1;
								        	 left=1;
								         }
								         if(clickx==bola.getX() && clicky<bola.getY() && up==0 && down==0 && left==0 && right==0 )
								         {
								        	 down=0;
								        	 right=0;
								        	 left=0;
								        	 up=1;				        	 
								         }
								         if(clickx>bola.getX() && clicky>bola.getY() && up==0 && down==0 && left==0 && right==0 )
								         {
								        	 up=0;
								        	 left=0;
								        	 down=1;
								        	 right=1;
								         }
								         if(clickx<bola.getX() && clicky>bola.getY() && up==0 && down==0 && left==0 && right==0 )
								         {
								        	 right=0;
								        	 up=0;
								        	 down=1;
								        	 left=1;
								         }
								         if(clickx==bola.getX() && clicky>bola.getY() && up==0 && down==0 && left==0 && right==0 )
								         {
								        	 up=0;
								        	 right=0;
								        	 left=0;								        	 
								        	 down=1;
								         }
								         if(clickx>bola.getX() && clicky==bola.getY() && up==0 && down==0 && left==0 && right==0 )
								         {
								        	 up=0;
								        	 down=0;
								        	 left=0;								        	
								        	 right=1;
								         }
								         if(clickx<bola.getX() && clicky==bola.getY() && up==0 && down==0 && left==0 && right==0 )
								         {
								        	 up=0;
								        	 down=0;
								        	 right=0;
								        	 left=1;
								         }
					            	  
					            	//condiciones choque arriba
					            	if(bola.getY()<=1 && right==1 && up==1 && down==0 && left==0)
					            		 {
					            				up=0;
					            				left=0;
					            				down=1;
					            		    	right=1;
					            		    	
					            		 }
					            	if(bola.getY()<=0 && left==1 && up==1 && right==0 && down==0)
					            		 {		
					            				up=0;
					            				right=0;
					            				down=1;
					            				left=1;
					            		 }
					            	if(bola.getY()<=0 && up==1 && left==0 && right==0 && down==0)
					            	{
					            		up=0;
			            				right=0;
			            				down=1;
			            				left=0;
					            	}
					            	//
					            	
					            	//condiciones de choque derecha
					            	if(bola.getX()>=850 && right==1 && up==1 && down==0 && left==0)
				            		 {
				            				up=1;
				            				left=1;
				            				down=0;
				            		    	right=0;
				            		 }
					            	if(bola.getX()>=850 && right==1 && down==1 && up==0 && left==0)
				            		 {		
				            				up=0;
				            				right=0;
				            				down=1;
				            				left=1;
				            		 }
					            	if(bola.getX()>=850 && right==1 && down==0 && up==0 && left==0)
					            	{
					            			up=0;
					            			right=0;
					            			down=0;
					            			left=1;
					            	}
					            	
					            	//
					            	
					            	//condiciones de choque izquierda
					            	
					            	if(bola.getX()<=1 && left==1 && up==1 && down==0 && right==0)
				            		 {
				            				up=1;
				            				left=0;
				            				down=0;
				            		    	right=1;
				            		 }
					            	if(bola.getX()<=1 && left==1 && down==1 && right==0 && up==0)
				            		 {		
				            				up=0;
				            				right=1;
				            				down=1;
				            				left=0;
				            		 }
					            	if(bola.getX()<=1 && left==1 && down==0 && right==0 && up==0)
					            	{
					            			up=0;
					            			right=1;
					            			down=0;
					            			left=0;
					            	}
					            	
					            	//movimiento hacia arriba y derecha
					            	if(bola.getY()>1 && up==1 && right==1 && down==0 && left==0)
					            	{
					            		bola.setLocation(xb+jx, yb-jy);
					            		
					            	}
					            	
					            	//movimiento hacia arriba e izquierda
					            	if(bola.getY()>1 && up==1 && left==1 && down==0 && right==0)
					            	{
					            		bola.setLocation(xb-jx, yb-jy);
					            	}
					            	
					            	//movimiento hacia arriba
					            	if(bola.getY()>1 && up==1 && left==0 && down==0 && right==0)
					            	{
					            		bola.setLocation(xb, yb-jy);
					            	}
					            	
					            	//movimiento hacia derecha
					            	if(right==1 && up==0 && left==0 && down==0)
					            	{
					            		bola.setLocation(xb+jx, yb);
					            	}
					            	
					            	//movimiento hacia izquierda
					            	if(left==1 && right==0 && up==0 && down==0)
					            	{
					            		bola.setLocation(xb-jx, yb);
					            	}
					            	
					            	//movimiento hacia abajo y derecha
					            	if(down==1 && right==1 && left==0 && up==0)
					            	{
					            		bola.setLocation(xb+jx, yb+jy);
					            
					            	}
					            	
					            	//movimiento hacia abajo e izquierda
					            	if(down==1 && left==1 && right==0 && up==0)
					            	{
					            		bola.setLocation(xb-jx, yb+jy);
					            	}
					            	
					            	//movimiento hacia abajo
					            	if(down==1 && left==0 && right==0 && up==0)
					            	{
					            		bola.setLocation(xb, yb+jy);
					            	} 
					            	
					            	
					            	// interseccion con el camion y bola
					            	if(bola.getBounds().intersects(ovni1.getBounds()))
									 {				        	    	
					        	       	ovni1.setVisible(false);
					        	    	jf.remove(ovni1);
					        	    	ovnid1.setVisible(true);
					        	    	jf.add(ovnid1,0);			        	    	
					        	    	band1=10;
					        	    	if(bola.getX()>=380 && bola.getX()<=509 && bola.getY()<=99)
					              	    	band=3;
					        	    	else if(bola.getX()>=360 && bola.getX()<380)
					        	    		band=1;	
					        	    	
					        	  
									 }
					        	 	
					        	    if(band1==10)
					        	    {	
					        		    ovnid1.setLocation(dx1, dy1+2);
					        		    if(ovnid1.getBounds().intersects(cam.getBounds()))
					        		    	
					        		    	{
					        		    	jf.remove(ovnid1);					        		    	
					        		    	
					        		    	sc.setBounds(cam.getX()+20,cam.getY()-60,70,40);
					        		    	jf.add(sc,0);
					        		    	 Timer t1 = new Timer (800, new ActionListener ()
										        {
										            public void actionPerformed(ActionEvent e1)
										            { 	
										            	sc.setVisible(true);
										            	sc.setVisible(false);
										            }
										        });
					        		    	 t1.start();
					        		    	
					        		    	}
					         	    }
					        	    
					        	    if(bola.getBounds().intersects(ovni2.getBounds()))
									 {				        	    	
					        	    	
					        	    	ovni2.setVisible(false);
					        	    	jf.remove(ovni2);
					        	    	ovnid2.setVisible(true);
					        	    	jf.add(ovnid2,0);			        	    	
					        	    	band2=11;
					        	    	if(bola.getX()>=180 && bola.getX()<=304 && bola.getY()<=169)
				              	    		band=3;
					        	    	else if(bola.getX()>=160 && bola.getX()<180)
					        	    		band=1;
									 }
					        	 	
					        	    if(band2==11)
					        	    {	
					        		    ovnid2.setLocation(dx2, dy2+2);
					        		    if(ovnid2.getBounds().intersects(cam.getBounds()))
					        		    {
					        		    	jf.remove(ovnid2);
					        		    	
					        		    	sc.setBounds(cam.getX()+20,cam.getY()-60,70,40);
					        		    	jf.add(sc,0);
					        		    	 Timer t1 = new Timer (800, new ActionListener ()
										        {
										            public void actionPerformed(ActionEvent e1)
										            { 	
										            	sc.setVisible(true);
										            	sc.setVisible(false);
										            }
										        });
					        		    	 t1.start();
					        		    }
					         	    }
					        	    
					        	    if(bola.getBounds().intersects(ovni3.getBounds()))
									 {				        	    	
					        	    	ovni3.setVisible(false);
					        	    	jf.remove(ovni3);
					        	    	ovnid3.setVisible(true);
					        	    	jf.add(ovnid3,0);			        	    	
					        	    	band3=12;
									 }
					        	 	
					        	    if(band3==12)
					        	    {	
					        		    ovnid3.setLocation(dx3, dy3+2);
					        		    if(ovnid3.getBounds().intersects(cam.getBounds()))
					        		    {
					        		    	jf.remove(ovnid3);
					        		    	
					        		    	sc.setBounds(cam.getX()+20,cam.getY()-60,70,40);
					        		    	jf.add(sc,0);
					        		    	 Timer t1 = new Timer (800, new ActionListener ()
										        {
										            public void actionPerformed(ActionEvent e1)
										            { 	
										            	
										            	sc.setVisible(true);
										            	sc.setVisible(false);
										            }
										        });
					        		    	 t1.start();
					        		    }
					         	    }
					        	    
					        	    if(bola.getBounds().intersects(ovni4.getBounds()))
									 {				        	    	
					        	    	ovni4.setVisible(false);
					        	    	jf.remove(ovni4);
					        	    	ovnid4.setVisible(true);
					        	    	jf.add(ovnid4,0);			        	    	
					        	    	band4=13;
									 }
					        	 	
					        	    if(band4==13)
					        	    {	
					        		    ovnid4.setLocation(dx4, dy4+2);
					        		    if(ovnid4.getBounds().intersects(cam.getBounds()))
					        		    {
					        		    	jf.remove(ovnid4);
					        		    	
					        		    	sc.setBounds(cam.getX()+20,cam.getY()-60,70,40);
					        		    	jf.add(sc,0);
					        		    	 Timer t1 = new Timer (800, new ActionListener ()
										        {
										            public void actionPerformed(ActionEvent e1)
										            { 	
										            	sc.setVisible(true);
										            	sc.setVisible(false);
										            }
										        });
					        		    	 t1.start();
					        		    }
					         	    }
					        	    
					        	    if(bola.getBounds().intersects(cam.getBounds()))
					        	    {
					        	    	jf.remove(bola);					        	    	
					        	    }  
					        	    if(ovnid1.getY()==cam.getY())
				        		    {
				        		    	cont=cont+10;
				        		    }
					        	    if(ovnid2.getY()==cam.getY())
				        		    {
				        		    	cont=cont+10;
				        		    }
					        	    if(ovnid3.getY()==cam.getY())
				        		    {
				        		    	cont=cont+10;
				        		    }
					        	    if(ovnid4.getY()==cam.getY())
				        		    {
				        		    	cont=cont+10;
				        		    }
					        	  
					        	    sp.setBounds(10, 5, 100, 30);					        	    
						            sp.setVisible(true);
					        	    
					            }      					            	  
					           
					        });
				         
							t.start();
							
							
				 }
				 
			 }
			 
		 }
		 );
		
		
		ImageIcon x=new ImageIcon("fondo.jpg");
		final JLabel p=new JLabel(x);
		p.setLayout(null);
		p.setBounds(0,0,900,562);
		p.setVisible(true);
		jf.add(p,-1);
		
		jf.repaint();
		
	}

	
		
		
}
