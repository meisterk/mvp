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
        view.displayData("Start");
    }

    // Events
    @Override
    public void buttonClick() {
        // View -> Model
        String input = view.getData();
        model.setData(input);

        // Model -> View
        String output = model.getData();
        view.displayData(output);
    }
}
