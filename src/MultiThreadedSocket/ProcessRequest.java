/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreadedSocket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Escuela
 */
public class ProcessRequest implements Runnable
{
    Socket connection;
    StringBuffer sb;
    
    
    ProcessRequest(Socket connection) 
    {
        this.connection = connection;
        sb = new StringBuffer();
    }

    @Override
    public void run() 
    {
        try {
            BufferedInputStream bis = new BufferedInputStream (connection.getInputStream());
            InputStreamReader isr = new InputStreamReader (bis);
            
            BufferedOutputStream bos = new BufferedOutputStream(connection.getOutputStream());
            
            int caracter;
            while ((caracter = isr.read()) !=13)
            {
                sb.append((char)caracter);
            }
                    OutputStreamWriter osw = new OutputStreamWriter (bos);
            
            System.out.println("El servidor recivio "+ sb);
            
            sb.delete(0, sb.length());
            
            
            sb.append("El servidor dice: traigan un verdadero admin" + (char)13);
            osw.write(sb.toString());
            osw.flush();
            connection.close();
                    } catch (IOException ex) {
        }
    }
    
}