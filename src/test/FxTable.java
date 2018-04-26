package test;

import java.lang.reflect.Field;
import java.util.List;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FxTable<E> {
    public void cargar(TableView tbl, List<E> lista){
        if (tbl == null || lista==null)    return;
        tbl.getColumns().clear();
        tbl.getItems().clear();
        if (lista.isEmpty())    return;
        E e = lista.get(0);
        Field[] fields = e.getClass().getDeclaredFields();
        for(Field f:fields){
            System.out.println(f);
            TableColumn x = new TableColumn<>(f.getName().substring(0,1).toUpperCase() + f.getName().substring(1));
            x.setCellValueFactory(new PropertyValueFactory(f.getName()));
            tbl.getColumns().add(x);
        }
        tbl.getItems().addAll(lista);
    }
}
