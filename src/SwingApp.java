import model.IModel;
import model.Model;
import presenter.IPresenter;
import presenter.Presenter;
import view.IView;
import view.SwingView;

public class SwingApp {
    public static void main(String[] args) {
        IView view = new SwingView();
        IModel model = new Model();
        IPresenter presenter = new Presenter(view, model);
        view.setPresenter(presenter);
    }
}
