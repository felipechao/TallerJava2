/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreadedSocket;

import Socket.SocketClient;
import static Socket.Socketserver.mensaje;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Escuela
 */
public class TestServer 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < 10; i++) 
        {
            Runnable r = new Runnable() {
                @Override
                public void run() 
                {
                    
        try {
            String host = "localhost";
            int port = 19999;
            
            StringBuffer mensajes = new StringBuffer();
            
            InetAddress ia = InetAddress.getByName(host);
            Socket connection = new Socket(ia, port);
            
            BufferedOutputStream bos = new BufferedOutputStream (connection.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter (bos);
            
           String temp = "soy el cliente 1, ayuuuuuuuuda" + (char)13;
            osw.write(temp);
            osw.flush();
            
            BufferedInputStream bis = new BufferedInputStream (connection.getInputStream());
            InputStreamReader isr = new InputStreamReader (bis);
            
            int caracter;
            while ((caracter = isr.read()) != 13)
            {
                mensaje.append((char)caracter);
            }
            System.out.println(mensaje);
            connection.close();
            } 
        
        catch (UnknownHostException ex) 
        {
           
        } 
        
        catch (IOException ex) 
        {
            
        }
                    SocketClient se = new SocketClient();
                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
}
