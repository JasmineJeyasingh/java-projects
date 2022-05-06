package com.lc101.jasmine.studios.spinningthedisc;

public class DVD extends BaseDisc implements OpticalDisc {
    @Override
    public String title() {
        return getTitle();
    }

    public DVD(String data, String title, int spinSpeed) {
        super(data, title, spinSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + this.getSpinSpeed() + " rpm");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);
    }


    // TODO: Implement your custom interface.


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


}
