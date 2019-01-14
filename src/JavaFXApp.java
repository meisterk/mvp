import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.IModel;
import model.Model;
import presenter.IPresenter;
import presenter.Presenter;
import view.JavaFXView;
import view.IView;

import java.net.URL;

public class JavaFXApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage fenster) throws Exception {
        // FXML-Datei laden
        final URL url = getClass().getResource("view/layout.fxml");
        final FXMLLoader fxmlloader = new FXMLLoader(url);

        // Controller verbinden
        IView view = new JavaFXView();
        fxmlloader.setController(view);

        // Layout laden
        final Parent root = fxmlloader.load();

        // presenter.Presenter erst erstellen, nachdem View erstellt ist
        IModel model = new Model();
        IPresenter presenter = new Presenter(view, model);
        view.setPresenter(presenter);

        // Layout auf Fensterinhalt setzen
        fenster.setScene(new Scene(root));

        // sonstige Fenstereigenschaften
        fenster.setTitle("MVP with JavaFX");

        // Fenster anzeigen
        fenster.show();
    }
}
