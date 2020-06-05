
package guidemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 *
 * @author Smaddy
 */
public class FXMLDocumentController implements Initializable {
    
    //These items are for the CheckBox example
    @FXML private Label pizzaOrderLabel;
    @FXML private CheckBox pepperoniCheckBox;
    @FXML private CheckBox pineappleCheckBox;
    @FXML private CheckBox baconCheckBox;
    
    //These items are for the ChoiceBox example
    @FXML private ChoiceBox choiceBox;
    @FXML private Label choiceBoxLabel;
    
    /**
     * This will update the Label for the ChoiceBox
     */
    public void choiceBoxButtonPushed(){
        choiceBoxLabel.setText("My favourite fruit is :\n" +choiceBox.getValue().toString());
    }
    
    /**
     * This is for the CheckBox example
     */
    @FXML
    public void pizzaOrderButtonPushed(){
        String order = "Toppings are :";
        
        if(pepperoniCheckBox.isSelected()){
            order += "\nPepperoni";
        }
        
        if(pineappleCheckBox.isSelected()){
            order += "\nPineapple";
        }
        
        if(baconCheckBox.isSelected()){
            order += "\nBacon";
        }
        
        this.pizzaOrderLabel.setText(order);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pizzaOrderLabel.setText("");
        
        //This items are for configuring the ChoiceBox example
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Oranges", "Pears", "Strawberries");
        choiceBox.setValue("Apples");
    }    
    
}
