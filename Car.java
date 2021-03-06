package org.fasttrackit;

// "is-a" relationship (inheritance)
public class Car extends AutoVehicle {

    private int doorCount;

    public Car(Engine engine) {
        super(engine);
    }

    // constructor overLoading
    public Car() {
        this(new Engine());
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
