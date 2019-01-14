package view;

import presenter.IPresenter;

public interface IView {
    // for App: connect View -> Presenter for events
    void setPresenter(IPresenter presenter);

    // for Presenter: display data and read userinput
    void displayData(String data);
    String getData();
}
