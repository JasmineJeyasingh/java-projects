package com.lc101.jasmine.studios.spinningthedisc;

public class CD extends BaseDisc implements OpticalDisc {


    public CD(String data, String title, int spinSpeed) {
        super(data, title, spinSpeed);
    }

    @Override
    public String title() {
        return this.getTitle();
    }
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + this.getSpinSpeed() + " rpm");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
