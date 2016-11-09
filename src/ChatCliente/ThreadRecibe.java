/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatCliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Escuela
 */
public class ThreadRecibe 
{
    Socket connection;
    final ChatServidor.Principal main;
    
    String mensaje;
    ObjectInputStream entrada;
    

    public ThreadRecibe(Socket connection, ChatServidor.Principal main) {
        this.connection = connection;
        this.main = main;
    }

    public ThreadRecibe(Socket connection, ChatCliente.Principal main) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void run() {
        try {
            entrada = new ObjectInputStream(connection.getInputStream());
            do
            {
                mensaje = (String)entrada.readObject();
                main.mostrarMensaje(mensaje + "\n");
            }while(!mensaje.equals("Server -> terminate"));
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ThreadRecibe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            entrada.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ThreadRecibe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection.close();
        } catch (IOException ex) {
            Logger.getLogger(ThreadRecibe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


