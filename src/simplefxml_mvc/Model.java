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
    private final StringProperty name = new SimpleStringProperty("");

    public Model () {
        this("");
    }
    public Model(String name) {
        setName(name);
    }

    public void setName(String nameIn) {
        name.set(nameIn);
    }
    
    public String getName() {
        return name.get();
    }
    
}
