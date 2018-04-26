/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import clase4.Persona;
import clase4.PersonaR;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 *
 * @author educacionit
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TableView<Persona> tblPersonas;
    @FXML
    private ComboBox<Persona> cmbPersonas;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbPersonas.getItems().addAll(PersonaR.getPersonas());
        new FxTable().cargar(tblPersonas, PersonaR.getPersonas());
        tblPersonas.getColumns().remove(0);
    }    
    
}
