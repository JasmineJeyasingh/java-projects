package com.lc101.jasmine.studios.spinningthedisc;

public class LP extends BaseDisc implements OpticalDisc {

    public LP(String data, String title, int spinSpeed) {
        super(data, title, spinSpeed);
    }

    public LP() {
    }

    @Override
    public void spinDisc() {
        System.out.println("A LP spins at a rate of " + this.getSpinSpeed() + " rpm");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);
    }

    @Override
    public String title() {
        return null;
    }
}
