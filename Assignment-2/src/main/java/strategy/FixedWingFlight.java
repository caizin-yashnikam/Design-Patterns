package strategy;

public class FixedWingFlight implements MovementStrategy {
    @Override
    public void move(float intensity) {
        System.out.println("Turbine thrust active. Lift coefficient: " + (intensity * 10));
    }

    @Override
    public void brake() {
        System.out.println("Air brakes and flaps extended.");
    }

    @Override
    public String getMechanismName() {
        return "Retractable Wings";
    }
}