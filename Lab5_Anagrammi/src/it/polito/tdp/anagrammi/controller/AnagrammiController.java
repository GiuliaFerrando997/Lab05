
package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammiModel.AnagrammiModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {
	
	private AnagrammiModel model;
	
	public void setModel(AnagrammiModel model) {
		this.model = model;
	}
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInserisci;

    @FXML
    private Button btmAnagramma;

    @FXML
    private TextArea txtParoleCorrette;

    @FXML
    private TextArea txtParoleErrate;
    

    @FXML
    private Button btmReset;

    @FXML
    void doAnagramma(ActionEvent event) {

    }

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtInserisci != null : "fx:id=\"txtInserisci\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btmAnagramma != null : "fx:id=\"btmAnagramma\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtParoleCorrette != null : "fx:id=\"txtParoleCorrette\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtParoleErrate != null : "fx:id=\"txtParoleErrate\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btmReset != null : "fx:id=\"btmReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }
}