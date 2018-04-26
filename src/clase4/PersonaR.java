package clase4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class PersonaR {
    public static List<Persona> getPersonas(){
        List <Persona> lista = new ArrayList();
        File file = new File ("datos.dat");
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            while (true){
                lista.add((Persona) in.readObject());
            }
            
        } catch (IOException | ClassNotFoundException e) {
//            System.out.println(e);
        }
        return lista;
    }
    
    public static void main(String[] args) {
//        Recorrido por indices
//        for (int a = 0; a < getPersonas().size(); a++)
//            System.out.println(getPersonas().get(a));
        
//        Recorrido usando for avanzado
//        for (Persona p:getPersonas())
//            System.out.println(p);
        
//        Recorrido usando foreach
//        getPersonas().forEach(System.out::println);
        
//        List lista1 = getPersonas();
//        List<Persona> lista2 = getPersonas();
//        lista1.add("Hola");
//        lista2.add(new Persona("Ana", "Godoy", 22));
//        
//        try {
//            Persona persona1 = (Persona) lista1.get(0);
//            Persona persona2 = lista2.get(0);
//        } catch (ClassCastException e) {
//            System.out.println(e);
//        }

    }
}
