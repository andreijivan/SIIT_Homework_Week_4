package com.andreijivan;

public class DaciaLogan extends Dacia {
    private int fuelTankSize;
    private boolean fuelType; // true: petrol, false: diesel
    private int gears;
    private double avgConsumption;
    private String engineType;
    private int availableFuel = 50;
    private int tyreSize = 16;

    public DaciaLogan(String chassisNr, int fuelTankSize, boolean fuelType, int gears, double avgConsumption, String engineType) {
        super(chassisNr);
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.avgConsumption = avgConsumption;
        this.engineType = engineType;
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
}
