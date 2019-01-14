package view;

import presenter.IPresenter;

public interface IView {
    // für App: Verbindung View -> Presenter für Events
    void setPresenter(IPresenter presenter);

    // für Presenter: anzeigen und lesen von Daten
    void setDaten(String daten);
    String getDaten();
}
