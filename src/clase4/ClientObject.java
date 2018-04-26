package clase4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientObject {
    public static void main(String[] args) throws IOException {
        Persona persona = new Persona ("Cristobal", "Lagos", 25);
        
        try (Socket so = new Socket ("localhost", 8000)) {
            ObjectOutputStream out = new ObjectOutputStream(so.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(so.getInputStream());
            out.writeObject(persona);
            System.out.println(in.readObject());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
