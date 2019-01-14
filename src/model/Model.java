package model;

public class Model implements IModel {
    private String daten;

    @Override
    public void setDaten(String eingabe) {
        this.daten = eingabe;
    }

    @Override
    public String getDaten() {
        return daten.toUpperCase();
    }
}
