package presenter;

import model.IModel;
import view.IView;

public class Presenter implements IPresenter {
    private IView view;
    private IModel model;

    public Presenter(IView view, IModel model) {
        this.view = view;
        this.model = model;

        // Start
        view.displayData("wrtegdfgf");
    }

    // Events
    @Override
    public void buttonClick() {
        String eingabe = view.getData();
        model.setData(eingabe);
        String ausgabe = model.getData();
        view.displayData(ausgabe);
    }
}
