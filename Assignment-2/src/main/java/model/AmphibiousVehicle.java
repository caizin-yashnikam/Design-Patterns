package model;

import Observer.*;
import strategy.*;

import java.util.ArrayList;
import java.util.List;

public class AmphibiousVehicle {
    private final String vehicleId;

    private MovementStrategy currentMovement;

    private List<VehicleObserver> observers;

    public AmphibiousVehicle(String vehicleId) {
        this.vehicleId = vehicleId;
        this.observers = new ArrayList<>();

        this.currentMovement = new WheeledTraction();
    }

    public void attach(VehicleObserver observer) {
        observers.add(observer);
        System.out.println("[System] Attached observer: " + observer.getClass().getSimpleName());
    }

    public void detach(VehicleObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(TerrainType terrain) {
        for (VehicleObserver observer : observers) {
            observer.onTerrainChanged(terrain, currentMovement.getMechanismName());
        }
    }

    public void switchTerrain(TerrainType newTerrain) {

        switch (newTerrain) {
            case LAND -> setStrategy(new WheeledTraction());
            case WATER -> setStrategy(new JetPropulsion());
            case AIR -> setStrategy(new FixedWingFlight());
        }

        notifyObservers(newTerrain);
    }

    private void setStrategy(MovementStrategy newStrategy) {
        this.currentMovement = newStrategy;
    }

    public void performMove(float intensity) {
        currentMovement.move(intensity);
    }
    
    public void performBrake() {
        currentMovement.brake();
    }
}