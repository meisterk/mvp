package model;

public class Model implements IModel {
    private String daten;

    @Override
    public void setData(String input) {
        this.daten = input;
    }

    @Override
    public String getData() {
        return daten.toUpperCase();
    }
}
