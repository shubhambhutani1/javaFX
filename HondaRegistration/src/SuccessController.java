
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class SuccessController implements Initializable {
	@FXML
	private Label buyerNamelbl;
	@FXML
	private Label chasisNumberlbl;
	@FXML
	private Label dateOfPurchaselbl;
	@FXML
	private Label modelNamelbl;
	@FXML
	private Label cityOfRegistrationlbl;

	// Event Listener on Button.onAction

	public void exit(ActionEvent event) {
		System.out.println("Exiting");
		System.exit(0);
		System.out.println("Exited");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public void getCertificate(String buyerName, String dateOfPurchase, String modelName, String chasisNumber,
			String cityOfRegistration) {

		buyerNamelbl.setText(buyerName);
		chasisNumberlbl.setText(chasisNumber.toString());
		dateOfPurchaselbl.setText(dateOfPurchase.toString());
		cityOfRegistrationlbl.setText(cityOfRegistration);
		modelNamelbl.setText(modelName);
	}

}
