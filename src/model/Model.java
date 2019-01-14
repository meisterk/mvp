package model;

public class Model implements IModel {
    private String data;

    @Override
    public void setData(String input) {
        this.data = input;
    }

    @Override
    public String getData() {
        return data.toUpperCase();
    }
}
