package application;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class LayoutController{
	
	@FXML
	private TextField firstname;
	@FXML
	private TextField lastname;
	@FXML
	private TextField middleinit;
	@FXML
	private TextField address;
	@FXML
	private TextField city;
	@FXML
	private TextField zipcode;
	@FXML
	private RadioButton male;
	@FXML
	private RadioButton female;
	@FXML
	private ComboBox<String> stateCB;
	
	private 
	
	@FXML
	public void clearButton() {
		firstname.clear();
		middleinit.clear();
		lastname.clear();
		male.setSelected(false);
		female.setSelected(false);
		address.clear();
		city.clear();
		stateCB.getSelectionModel().clearSelection();;
		zipcode.clear();
	}
	
	@FXML
	public ArrayList saveButton() {
		
		ArrayList person = new ArrayList();
		
		person.add(firstname);
		person.add(middleinit);
		person.add(lastname);
		if (male.isSelected() == true) {
			person.add("male");
		}
		else{
			person.add("female")
		}
		person.add(address);
		person.add(city);
		person.add(zipcode);
		person.add(stateCB.getSelectionModel());
		
		return person;
		
		}
	
	
}
