package com.lc101.jasmine.exercises;

public class Pet {
    public static void main(String[] args) {
        String firstPet = "Fluffy";
        Pet secondPet = new Pet("Fluffy");
        Pet thirdPet = new Pet("Fluffy");
        System.out.println(secondPet == thirdPet
);
        System.out.println(thirdPet.equals(secondPet)
);
    }

    private String name;

    Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean equals(Object petToCheck) {

        if (petToCheck == this) {
            return true;
        }

        if (petToCheck == null) {
            return false;
        }

        if (petToCheck.getClass() != getClass()) {
            return false;
        }

        Pet thePet = (Pet) petToCheck;
        return thePet.getName() == getName();
    }
}
