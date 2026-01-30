package strategy;

public class WheeledTraction implements MovementStrategy {
    @Override
    public void move(float intensity) {
        System.out.println(" Torque applied to wheels. Friction calc: " + (intensity * 100));
    }

    @Override
    public void brake() {
        System.out.println("ABS Brakes engaged.");
    }

    @Override
    public String getMechanismName() {
        return "All-Terrain Wheels";
    }
}