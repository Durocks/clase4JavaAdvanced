package clase4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Clase4 {

    public static void main(String[] args) throws Exception{
        
        //Serializado de objetos a un archivo
        File file=new File("datos.dat");
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(file));
        
        out.writeObject(new Persona("Nicolas","Leon",33));
        out.writeObject(new Persona("Laura","Miguel",34));
        out.writeObject(new Persona("Cecilia","Oviedo",35));
        
        out.close();
        
        //Deserializado de objetos de un archivo
        ObjectInputStream in=new ObjectInputStream(new FileInputStream(file));
        
        Persona persona;
        
        //persona=(Persona)in.readObject();
        //System.out.println(persona);
        
        try {
            while(true){
                persona=(Persona)in.readObject();
                System.out.println(persona);
            }
        } catch(EOFException e) {
            System.out.println("Fin del archivo");
        }
        
    }
    
}
