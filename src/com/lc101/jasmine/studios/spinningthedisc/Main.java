package com.lc101.jasmine.studios.spinningthedisc;

public class Main {
    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCd = new CD("Song", "Christmas Song", 500);
        myCd.spinDisc();

        DVD myDvd = new DVD("Song", "Christmas Song", 1600);
        myDvd.spinDisc();

        myCd.writeData(" Hello");
        System.out.println(myCd.readData());
        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
