import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RegistrationController {

	ObservableList<String> modelNameList = FXCollections.observableArrayList("City", "Civic", "Accord", "Brio", "WR-V",
			"CR-V", "Jazz");

	ObservableList<String> cityOfRegistrationList = FXCollections.observableArrayList("Delhi", "Chandigarh", "Gurgaon",
			"Mumbai", "Navi Mumbai", "Chennai", "Bangalore");

	@FXML
	private TextField buyerName;

	@FXML
	private DatePicker dateOfPurchase;

	@FXML
	private ChoiceBox<String> modelName;

	@FXML
	private TextField chasisNumber;

	@FXML
	private ChoiceBox<String> cityOfRegistration;

	public void register(ActionEvent event) throws Exception {
		System.out.println("Registered!");

		Stage primaryStage = new Stage();
		System.out.println("Stage set");
		FXMLLoader loader = new FXMLLoader();
		System.out.println("Loader set");

		Pane root = loader.load(getClass().getResource("Success.fxml").openStream());
		Scene scene = new Scene(root);
		System.out.println("reached");
		// SuccessController successController = (SuccessController)
		// loader.getController();
		// successController.getCertificate(buyerName.getText(),
		// dateOfPurchase.getValue().toString(),
		// modelName.getValue().toString(), chasisNumber.getText(),
		// cityOfRegistration.getValue().toString());

		// scene.getStylesheets().add(getClass().getResource("registration.css").toExternalForm());
		// primaryStage.setTitle("Honda Registration");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void exit(ActionEvent event) {
		System.out.println("Exiting");
		System.exit(0);
		System.out.println("Exited");
	}

	@FXML
	public void initialize() {
		modelName.setItems(modelNameList);
		cityOfRegistration.setItems(cityOfRegistrationList);
	}

}
