import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class TipCalculatorController2 {
   @FXML
   private TextField amountTextField;
   @FXML
   private TextField tipTextField;
   @FXML
   private TextField totalTextField;
   @FXML
   private Slider tipPercentageSlider;
   @FXML
   private Label tipPercentageLabel;
   @FXML
   private Label numberOfPeopleLabel;


   private DoubleProperty amount = new SimpleDoubleProperty();
   private DoubleProperty tipPercentage = new SimpleDoubleProperty(15.00);
   private DoubleProperty tip = new SimpleDoubleProperty();
   private DoubleProperty total = new SimpleDoubleProperty();
   private DoubleProperty totalPerPerson = new SimpleDoubleProperty();
   private int numberOfPeople = 1;



   public void initialize() {
      // Bind the tip percentage label to the tip percentage slider value
      tipPercentageLabel.textProperty().bind(Bindings.format("%.1f%%", tipPercentage));
      //tipPercentageSlider.setMajorTickUnit(1.0);

      // Bind the tip and total properties to the amount and tipPercentage properties
      tip.bind(amount.multiply(tipPercentage.divide(100.0)));
      total.bind(amount.add(tip));

      // Bind the total per person property to the total property and the number of people
      //totalPerPerson.bind(total.divide(numberOfPeople));

      // Add property listeners to the amount and tipPercentage properties
      amountTextField.textProperty().addListener((observable, oldValue, newValue) -> {
         if (!newValue.matches("\\d*\\.?\\d*")) {
            amountTextField.setText(oldValue);
            return;
         }
         amount.set(Double.parseDouble(newValue));
      });

      tipPercentageSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
         tipPercentage.set(newValue.doubleValue());
      });

      // Bind the text properties of the tip, total, and total per person text fields to their respective properties
      tipTextField.textProperty().bind(Bindings.format("%.2f", tip));
      totalTextField.textProperty().bind(Bindings.format("%.2f", total));
      //totalPerPersonTextField.textProperty().bind(Bindings.format("%.2f", totalPerPerson));
   }
}

//Was the button press implementation
   /*@FXML
   private void calculateButtonPressed() {
      double amount = Double.parseDouble(amountTextField.getText());
      double tipPercentage = tipPercentageSlider.getValue();
      int numberOfPeople = Integer.parseInt(numberOfPeopleTextField.getText());

      double tip = (amount * (tipPercentage / 100)) / numberOfPeople; //Takes amount and calculates the tip per person in the party
      double totalPerPerson = (amount / numberOfPeople) + tip; //Displays the total that each person in the party pays
      double total = amount + (tip * numberOfPeople); //The complete total

      tipTextField.setText(String.format("%.2f", tip));
      totalPerPersonTextField.setText(String.format("%.2f", totalPerPerson));
      totalTextField.setText(String.format("%.2f", total));
   }
}*/