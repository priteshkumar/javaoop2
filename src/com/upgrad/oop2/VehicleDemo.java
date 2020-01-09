package com.upgrad.oop2;

class Vehicle {
    private int passengers;
    private double fuelCap;
    private double milesPerGallon;

    public Vehicle(int p, double f, double m) {
        this.passengers = p;
        this.fuelCap = f;
        this.milesPerGallon = m;
    }

    public double getRange() {
        return this.fuelCap * this.milesPerGallon;
    }

    public double getFuelneeded(double miles) {
        return miles / this.milesPerGallon;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void setPassengers(int p) {
        this.passengers = p;
    }

    public double getFuelCap() {
        return this.fuelCap;
    }

    public void setFuelCap(double fuelCap) {
        this.fuelCap = fuelCap;
    }
}

class Truck extends Vehicle {
    private int cargoCap;

    public Truck(int p, double f, double m, int c) {
        super(p, f, m);
        this.cargoCap = c;
    }

    public int getCargoCap() {
        return cargoCap;
    }

    public void setCargoCap(int c) {
        this.cargoCap = c;
    }
}


public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Demo single level inheritance");

        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.getFuelneeded(dist);
        System.out.println("Semi can carry " + semi.getCargoCap() + " pounds. ");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");
    }
}
