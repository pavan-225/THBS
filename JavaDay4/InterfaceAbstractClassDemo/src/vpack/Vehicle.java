package vpack;

public abstract class Vehicle implements Automobile {
    protected int regno;
    protected String model;
    protected int currSpeed;



    @Override
    public String start() {
        return null;
    }

    @Override
    public int increSpeed() {
        return 0;
    }

    @Override
    public String stop() {
        return null;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "regno=" + regno +
                ", model='" + model + '\'' +
                ", currSpeed=" + currSpeed +
                '}';
    }
}
