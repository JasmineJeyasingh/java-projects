package com.lc101.jasmine.studios.spinningthedisc;

public abstract class BaseDisc {

    private String data;
    private String title;
    private int spinSpeed;

    public BaseDisc(String data, String title, int spinSpeed) {
        this.data = data;
        this.title = title;
        this.spinSpeed = spinSpeed;
    }

    public BaseDisc() {
        this.data = "";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void writeData(String aData) {
        this.data += aData;
    }

    public String readData() {
        return this.data;
    }

    public abstract String title();

}
