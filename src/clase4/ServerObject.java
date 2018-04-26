package clase4;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerObject {
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(8000);
        while(true){
            System.out.println("Esperando conexión de cliente");
            Socket so=ss.accept();
            System.out.println("Se conecto: "+so.getInetAddress());
            ObjectInputStream in=new ObjectInputStream(so.getInputStream());
            ObjectOutputStream out=new ObjectOutputStream(so.getOutputStream());
            Persona persona;
            try {
                persona=(Persona)in.readObject();
                System.out.println(persona);
                out.writeObject("Se recibio el objecto.");
            } catch (ClassCastException e) {
                System.out.println("Objeto incorrecto.");
                out.writeObject("Objeto incorrecto.");
            }
            so.close();
        }
    }
}
