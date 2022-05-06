package com.lc101.jasmine.studios.spinningthedisc;

public class FloppyDisk extends BaseDisc implements OpticalDisc{

    public FloppyDisk(String data, String title, int spinSpeed) {
        super(data, title, spinSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A Floppy Disk spins at a rate of " + this.getSpinSpeed() + " rpm");
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
