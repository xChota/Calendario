package dad.javafx.calendario;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import dad.javafx.componentes.MonthCalendar;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

public class Controller implements Initializable{

    @FXML
    private GridPane root;
	@FXML
	    private Label yearLabel;

	    @FXML
	    private Button previousYearButton;

	    @FXML
	    private Button nextYearButton;

	    @FXML
	    private MonthCalendar m1;

	    @FXML
	    private MonthCalendar m2;

	    @FXML
	    private MonthCalendar m3;

	    @FXML
	    private MonthCalendar m4;

	    @FXML
	    private MonthCalendar m5;

	    @FXML
	    private MonthCalendar m6;

	    @FXML
	    private MonthCalendar m7;

	    @FXML
	    private MonthCalendar m8;

	    @FXML
	    private MonthCalendar m9;

	    @FXML
	    private MonthCalendar m10;

	    @FXML
	    private MonthCalendar m11;

	    @FXML
	    private MonthCalendar m12;

	    //model
	    private IntegerProperty yearProperty = new SimpleIntegerProperty();
	
	 public Controller() {
		 	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalendarioView.fxml"));
			loader.setController(this);
					//loader.setRoot(this); //establecer la rootView
			try {
				loader.load();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	    @Override
	public void initialize(URL location, ResourceBundle resources) {
		yearProperty.set(LocalDate.now().getYear());
		yearLabel.textProperty().bindBidirectional(yearProperty, new NumberStringConverter());
		m1.setMonthProperty(1);
		m1.yearPropertyProperty().bind(yearProperty);
		m2.setMonthProperty(2);
		m2.yearPropertyProperty().bind(yearProperty);
		m3.setMonthProperty(3);
		m3.yearPropertyProperty().bind(yearProperty);
		m4.setMonthProperty(4);
		m4.yearPropertyProperty().bind(yearProperty);
		m5.setMonthProperty(5);
		m5.yearPropertyProperty().bind(yearProperty);
		m6.setMonthProperty(6);
		m6.yearPropertyProperty().bind(yearProperty);
		m7.setMonthProperty(7);
		m7.yearPropertyProperty().bind(yearProperty);
		m8.setMonthProperty(8);
		m8.yearPropertyProperty().bind(yearProperty);
		m9.setMonthProperty(9);
		m9.yearPropertyProperty().bind(yearProperty);
		m10.setMonthProperty(10);
		m10.yearPropertyProperty().bind(yearProperty);
		m11.setMonthProperty(11);
		m11.yearPropertyProperty().bind(yearProperty);
		m12.setMonthProperty(12);
		m12.yearPropertyProperty().bind(yearProperty);
		
	}
	    @FXML
	    void nextYear(ActionEvent event) {
	    	yearProperty.set(yearProperty.get()+1);
	    }

	    @FXML
	    void previousYear(ActionEvent event) {
	    	yearProperty.set(yearProperty.get()-1);
	    }
		public final IntegerProperty yearPropertyProperty() {
			return this.yearProperty;
		}
		
		public final int getYearProperty() {
			return this.yearPropertyProperty().get();
		}
		
		public final void setYearProperty(final int yearProperty) {
			this.yearPropertyProperty().set(yearProperty);
		}
		
	
	public GridPane getRoot() {
		return root;
	}
}
