import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class interfaz extends procesos{
	public void menuprincipal(){
		final procesos x=new procesos();
		ImageIcon nj=new ImageIcon("nuevojuego.png");
		final JButton a=new JButton ();
		a.setIcon(nj);
		a.setBounds(240, 20, 160, 30);
		a.setVisible(true);
		a.setLayout(null);
		
		a.addMouseListener (new MouseAdapter()
		{
			 public void mouseClicked(MouseEvent m)
			 {
				 x.nuevojuego();
			 }
		 }
		 );
			

		ImageIcon cp=new ImageIcon("cargarpartida.png");
		final JButton b=new JButton ();
		b.setIcon(cp);
		b.setBounds(240, 51, 160, 30);
		b.setVisible(true);
		b.setLayout(null);
		

		ImageIcon tp=new ImageIcon("tablaposiciones.png");
		final JButton c=new JButton ();
		c.setIcon(tp);
		c.setBounds(240, 82, 160, 30);
		c.setVisible(true);
		c.setLayout(null);
		

		ImageIcon cr=new ImageIcon("creditos.png");
		final JButton d=new JButton ();
		d.setIcon(cr);
		d.setBounds(240, 113, 160, 30);
		d.setVisible(true);
		d.setLayout(null);
		
		ImageIcon sa=new ImageIcon("salir.png");
		final JButton e=new JButton ();
		e.setIcon(sa);
		e.setBounds(240, 144, 160, 30);
		e.setVisible(true);
		e.setLayout(null);
		
		x.fondo(a,b,c,d,e, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		}
		
		public void menujugando(){
			procesos x= new procesos();
			
			ImageIcon nj=new ImageIcon("continuar.png");
			final JButton a=new JButton ();
			a.setIcon(nj);
			a.setBounds(240, 20, 160, 30);
			a.setVisible(true);
			a.setLayout(null);
			

			ImageIcon cp=new ImageIcon("guardarpartida.png");
			final JButton b=new JButton ();
			b.setIcon(cp);
			b.setBounds(240, 51, 160, 30);
			b.setVisible(true);
			b.setLayout(null);
			

			ImageIcon tp=new ImageIcon("menu.png");
			final JButton c=new JButton ();
			c.setIcon(tp);
			c.setBounds(240, 82, 160, 30);
			c.setVisible(true);
			c.setLayout(null);
			
			x.fondo(a, b, c, null,null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			
			
		}
		
		public void tablaposciciones(){
			
			procesos x=new procesos();
			ImageIcon nj=new ImageIcon("menu.png");
			final JButton a=new JButton ();
			a.setIcon(nj);
			a.setBounds(240, 20, 160, 30);
			a.setVisible(true);
			a.setLayout(null);
			
			x.fondo(a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		}
		
		public void creditos(){
			
			procesos x=new procesos();
			ImageIcon nj=new ImageIcon("menu.png");
			final JButton a=new JButton ();
			a.setIcon(nj);
			a.setBounds(240, 20, 160, 30);
			a.setVisible(true);
			a.setLayout(null);
			
			x.fondo(a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			
		}
		
	public void cargarpartida(){
			
		procesos x=new procesos();
			ImageIcon nj=new ImageIcon("cargarpartida.png");
			final JButton a=new JButton ();
			a.setIcon(nj);
			a.setBounds(240, 20, 160, 30);
			a.setVisible(true);
			a.setLayout(null);		
			
			x.fondo(a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		}

}
