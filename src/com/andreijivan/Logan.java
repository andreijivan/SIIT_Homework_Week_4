package com.andreijivan;

public class Logan extends Dacia {
    private int fuelTankSize = 50;
    private boolean fuelType = true; // true: diesel, false: petrol
    private int gears = 5;
    private double avgConsumption = 6.5;
    public int availableFuel;
    public int tyreSize = 16;

    public Logan(String chassisNr, int availableFuel) {
        super(chassisNr);
        this. availableFuel = availableFuel;

    }

    public int getAvailableFuel() {
        return availableFuel;
    }

    public void setAvailableFuel(int availableFuel) {
        this.availableFuel = availableFuel;
    }

    public int getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(int tyreSize) {
        this.tyreSize = tyreSize;
    }

    public double getAvgConsumption() {
        return avgConsumption;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void drive(int km) {

    }
}
