/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatCliente;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Escuela
 */public class ThreadEnvia implements Runnable 
{
    public Socket connection;
    private final ChatServidor.Principal main;
    String mensaje;
    
    ObjectOutputStream salida;

    public ThreadEnvia(Socket connection, final ChatServidor.Principal main) {
        this.connection = connection;
        this.main = main;
        
        main.campoTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                mensaje = e.getActionCommand();
                enviarMensaje(mensaje);
                main.campoTexto.setText("");
            }
        });
        
    }

    public ThreadEnvia(Socket connection, ChatCliente.Principal main) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    void enviarMensaje(String mensaje)
    {
        try {
            salida.writeObject("Servidor-> " + mensaje);
            salida.flush();
       
            main.mostrarMensaje("Servidor -> " + mensaje + "\n");
       
        } catch (IOException ex) {
            main.mostrarMensaje("No se puede enviar el mensaje");
        }
    }
    
    @Override
    public void run() 
    {
        try {
            salida = new ObjectOutputStream(connection.getOutputStream());
            salida.flush();
        } catch (IOException ex) {
            
        }
    }
    
}
