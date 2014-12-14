/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefxml_mvc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Brian
 */
public class Controller implements Initializable {
    
    // reference to the View's input field
    @FXML private TextField nameTextField;
    
    // reference to the View's nave value
    @FXML private Label nameValue;
    
    // the Model to modify
    private Model model = new Model();
    
    @FXML
    private void nameTextFieldAction(ActionEvent event) {      
        model.setName(nameTextField.getText());
        System.out.println(model.getName());
    }   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameValue.textProperty().bindBidirectional(model.nameProperty());
    }    
    
}
