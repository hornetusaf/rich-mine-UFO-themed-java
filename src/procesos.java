

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class procesos extends pantalla{
	
	public void nuevojuego(){
		
		final pantalla x=new pantalla();
		
		ImageIcon OV1=new ImageIcon("ovni.png");
		final JLabel ov1=new JLabel(OV1);
		ov1.setLayout(null);
		ov1.setBounds(400,30,104,69);
		
		ImageIcon OV2=new ImageIcon("ovni.png");
		final JLabel ov2=new JLabel(OV2);
		ov2.setLayout(null);
		ov2.setBounds(200,100,104,69);
		
		ImageIcon OV3=new ImageIcon("ovni.png");
		final JLabel ov3=new JLabel(OV3);
		ov3.setLayout(null);
		ov3.setBounds(600,100,104,69);
		
		ImageIcon OV4=new ImageIcon("ovni.png");
		final JLabel ov4=new JLabel(OV4);
		ov4.setLayout(null);
		ov4.setBounds(400,200,104,69);
		
		ImageIcon BAS=new ImageIcon("basecañon.png");
		final JLabel bas=new JLabel(BAS);
		bas.setLayout(null);
		bas.setBounds(25,400,200,200);
		
		ImageIcon CA1=new ImageIcon("cañon6.png");
		final JLabel ca1=new JLabel(CA1);
		ca1.setLayout(null);
		ca1.setBounds(30,360,200,200);
		
		ImageIcon CA2=new ImageIcon("cañon5.png");
		final JLabel ca2=new JLabel(CA2);
		ca2.setLayout(null);
		ca2.setBounds(30,360,200,200);
		
		ImageIcon CA3=new ImageIcon("cañon4.png");
		final JLabel ca3=new JLabel(CA3);
		ca3.setLayout(null);
		ca3.setBounds(30,360,200,200);
		
		ImageIcon CA4=new ImageIcon("cañon3.png");
		final JLabel ca4=new JLabel(CA4);
		ca4.setLayout(null);
		ca4.setBounds(30,360,200,200);
		
		ImageIcon CA5=new ImageIcon("cañon2.png");
		final JLabel ca5=new JLabel(CA5);
		ca5.setLayout(null);
		ca5.setBounds(30,360,200,200);
		
		ImageIcon CA6=new ImageIcon("cañon1.png");
		final JLabel ca6=new JLabel(CA6);
		ca6.setLayout(null);
		ca6.setBounds(30,360,200,200);
		
		ImageIcon CAM=new ImageIcon("camion.png");
		final JLabel cam=new JLabel(CAM);
		cam.setLayout(null);
		cam.setBounds(300,450,113,63);	
		
		ImageIcon BOL=new ImageIcon("bola.png");
		final JLabel bol=new JLabel(BOL);
		bol.setLayout(null);
		
		ImageIcon OVD1=new ImageIcon("ovnidestruido.png");
		final JLabel ovd1=new JLabel(OVD1);
		ovd1.setLayout(null);
		ovd1.setBounds(400,30,105,70);
		
		ImageIcon OVD2=new ImageIcon("ovnidestruido.png");
		final JLabel ovd2=new JLabel(OVD2);
		ovd2.setLayout(null);
		ovd2.setBounds(200,100,105,70);
		
		ImageIcon OVD3=new ImageIcon("ovnidestruido.png");
		final JLabel ovd3=new JLabel(OVD3);
		ovd3.setLayout(null);
		ovd3.setBounds(600,100,105,70);
		
		ImageIcon OVD4=new ImageIcon("ovnidestruido.png");
		final JLabel ovd4=new JLabel(OVD4);
		ovd4.setLayout(null);
		ovd4.setBounds(400,200,105,70);
			
		
		x.fondo(null, null, null, null, null, ov1, ov2, ov3, ov4, ca1, ca2, ca3, ca4, ca5, ca6, cam, bol, bas, ovd1, ovd2, ovd3, ovd4);		
		
	}

}
