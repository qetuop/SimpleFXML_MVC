/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefxml_mvc;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Brian
 */
public class Model {
    //private final StringProperty name = new SimpleStringProperty("");
    
    private StringProperty name = new SimpleStringProperty(this, "name", "");
    public final String getName() { return name.get(); }
    public final void setName(String value) { name.set(value); }
    public final StringProperty nameProperty() { return name; }
}
