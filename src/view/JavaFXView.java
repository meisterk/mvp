package view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import presenter.IPresenter;

import java.net.URL;
import java.util.ResourceBundle;

public class JavaFXView implements IView , Initializable {
    @FXML
    private TextField textFieldEingabe;
    @FXML
    private Button button;
    @FXML
    private Label labelAusgabe;

    private IPresenter presenter;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button.setOnAction(evt -> {
            presenter.buttonClick();
        });
    }

    // Events
    @Override
    public void setPresenter(IPresenter presenter) {
        this.presenter = presenter;
    }

    // Daten
    public void setDaten(String daten) {
        labelAusgabe.setText(daten);
    }

    public String getDaten() {
        return textFieldEingabe.getText();
    }


}
