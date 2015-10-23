import java.applet.*;
import java.net.*;
import java.io.*;
public class clase_sonido
{
        public void playWav(String rutacompleta)
        {
           try {
                   File myFile = new File(rutacompleta);
                   URL myURL = myFile.toURL();
                   AudioClip audio = Applet.newAudioClip(myURL);
                   System.out.println(rutacompleta);
                   System.out.println("play");
                   System.out.println(audio.toString());
                   audio.play();
                   System.out.println("fin");
               }
           catch (Exception e)
               {
        	   System.out.println(e);  
               }
         }

}
